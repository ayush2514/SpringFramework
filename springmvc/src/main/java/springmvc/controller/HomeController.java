package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.time.LocalDateTime;
import java.util.*;
@Controller
public class HomeController {
	
	//We have to create methods for handling the url
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home page");
		model.addAttribute("name", "Vaani");
		model.addAttribute("id",1234);
		List<String> list=new ArrayList<String>();
		list.add("Ram");
		list.add("Shyam");
		list.add("Shami");
		list.add("Tushar");
		model.addAttribute("f",list);
		return "index";
	}
	
	@RequestMapping("/help")
	public String help() {
		System.out.println("This is help controller");
		return "help";
	}
	
	@RequestMapping("/help1")
	public ModelAndView help1() {
		ModelAndView mnv=new ModelAndView();
		mnv.addObject("name","Amit Trivedi");
		mnv.addObject("id",13213);
		LocalDateTime now=LocalDateTime.now();
		mnv.addObject("time",now);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(13);
		list.add(157);
		list.add(3526);
		list.add(5);
		mnv.addObject( "marks",list);
		mnv.setViewName("help1");
		return mnv;
	}

}
