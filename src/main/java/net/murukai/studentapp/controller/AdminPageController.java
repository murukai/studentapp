package net.murukai.studentapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/manage")
public class AdminPageController {
	
	@RequestMapping( value = {"/","/home","/index"})
	public ModelAndView index(){
		ModelAndView model = new ModelAndView("page");
		model.addObject("title", "Home");
		model.addObject("userClickHome",true);
		return model;
	}
	
	@RequestMapping(value = "/about")
	public ModelAndView about() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;				
	}	
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact",true);
		return mv;				
	}	
	
	@RequestMapping(value = "/department")
	public ModelAndView department() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","Department");
		mv.addObject("userClickDepartment",true);
		return mv;				
	}	
	@RequestMapping(value = "/sport")
	public ModelAndView sport() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","Sport");
		mv.addObject("userClickSport",true);
		return mv;				
	}	
	
	@RequestMapping(value = "/add/sport")
	public ModelAndView addSport() {		
		ModelAndView mv = new ModelAndView("add_sport");		
		mv.addObject("title","Sport");
		
		return mv;				
	}	
	
	@RequestMapping(value = "/students")
	public ModelAndView students() {		
		ModelAndView mv = new ModelAndView("students");		
		mv.addObject("title","Students");
		mv.addObject("userClickStudent",true);
		return mv;				
	}	
}
