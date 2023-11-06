package in.ineuron.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.ineuron.model.Customer;
import in.ineuron.service.ICustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	ICustomerService service;
	
	@GetMapping("/list")
	public String listCustomers(Map<String,Object> model) {
		List<Customer> customers = service.getCustomers();
		model.put("customers", customers);
		customers.forEach(System.out::println);
		return "list-customer";
		
	}
	@GetMapping("/showForm")
	public String showFormForAdd(Map<String,Object> model) {
		Customer customer = new Customer();
		System.out.println(customer);
		model.put("customer", customer);
		return "customer-form";
		
	}
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute Customer customer) {
		service.saveCustomer(customer);
		return "redirect:/customer/list";
	}
}
