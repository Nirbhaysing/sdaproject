package com.symbiosis.springprojectbootapplication;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.symbiosis.model.Actor;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home()
	{
		System.out.println("home page requst");
		return "index.jsp";
	}
	
	
   /* @PostMapping(value="addActor")
	public String addActor(@RequestParam("aid")int aid, @RequestParam("name") String name, Model m)
	{
    	Actor a=new Actor();
    	a.setAid(aid);
    	a.setName(name);
    	m.addAttribute("actor",a);
		return "show.jsp";
		
	*/	
		@GetMapping(value="getActor")
		String getActors(Model m) {
			List<Actor> li=Arrays.asList(new Actor(101,"Laka"));
			
			m.addAttribute("r",li);
			return "show.jsp";
		}
  
	}


