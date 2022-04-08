package main.java.com.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@Resource
	MainService service;
	
	@RequestMapping(value="/")
	public String test(Model model) {
		System.out.println("controller");
		String test=service.select();
		System.out.println(test);
		model.addAttribute("selectTableList", test);
		return "main/Main";
	}

}
