package com.ti.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ti.login.service.AuthServiceInterface;

@Controller
public class HelloController {
	@Autowired
	AuthServiceInterface service;  
	
	
	 @GetMapping({"/", "/hello"})
	    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
	        model.addAttribute("name", name);
	        return "hello";
	    }
	 
	 
	 @GetMapping(value = "/loginhome")
	    public String login(Model model) {
		 
		 return "loginHome";
		 
		
		  // Create H2 table TechIndiaAuth (id,username,password) // Fetch user name
		  //and value from request param
		  
		 
		  
		 
		 
	    }
	 
	  @GetMapping({ "/welcome"})
	    public String welcome(Model model) {
	        return "welcome";
	    }
	  
	  @PostMapping({ "/validate"})
	    public String loginPage( @RequestParam(value="username", required=false) String name, @RequestParam(value="password", required=false) String password, Model model) {
		
		  System.out.println(name);
		  
		  System.out.println(password);
		  Boolean flag = service.validateUser(name, password);
		  if(flag) 
		  { return "/welcome"; 
		  }
		  
	        return "AuthFailure";
	    }
}
 