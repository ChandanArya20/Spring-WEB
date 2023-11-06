package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import in.ineuron.service.IWishMessageService;

@Controller
public class ShowWishController {

	@Autowired
	private IWishMessageService service;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String showHomePage() {
		return "home";
	}
	
//	@RequestMapping(value="/wish", method = RequestMethod.GET)
//	public ModelAndView showWishMessage() {
//		
//		String msg=service.generateWishMessage();
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("msg",msg);
//		mav.setViewName("display");
//		return mav;
//	}
	
//	@RequestMapping(value="/wish", method = RequestMethod.GET)
//	public String showWishMessage(Model model) {
//		
//		String msg=service.generateWishMessage();
//		model.addAttribute("msg", msg);
//		return "display";
//	}
	
//	@RequestMapping(value="/wish", method = RequestMethod.GET)
//	public String showWishMessage(Map<String, Object> model) {
//		
//		String msg=service.generateWishMessage();
//		model.put("msg", msg);
//		return "display";
//	}
	
	@RequestMapping(value="/wish", method = RequestMethod.GET)
	public void showWishMessage(HttpServletResponse response) throws IOException {
		
		String msg=service.generateWishMessage();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<h1>Wish Message :"+msg+"</h1>");
		
	}
	
	
	
}
