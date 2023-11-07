package in.ineuron.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataTransferController {

	@GetMapping
	public String showHomePage() {
		return "home";
	}
	@GetMapping("/report")
	public String showReport(Map<String,Object> model) {
		
		model.put("name", "Kohli");
		model.put("age", 35);
		model.put("address", "Bangoluru");
		
		
		String[] countryNames=new String[] {"India","USA","Russia","Japan"};
		model.put("countryNames", countryNames);
		
		List<String> subjectLists = List.of("Java","jee","SpringBoot","MongoDB");
		model.put("subjectLists", subjectLists);
		
		Set<Long> mobileSets = Set.of(9905669732L,8757573723L,6200987646L,7894567890L);
		model.put("mobileSets", mobileSets);
		
		Map<String, Number> idsMap = Map.of("adhar",9082362L,"voterid",9874,"pan",89476);
		model.put("idsMap", idsMap);
		
		
		return "show_report";
	}
	
}
