package com.BikkadIT.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.BikkadIT.Model.User;
import com.BikkadIT.Service.UserServiceI;

@Controller
public class Usercontroller {

	@Autowired
	private UserServiceI userservicei;

	@GetMapping("/welcome")
	public String LoadFram() {
			return "Registration";	
	}
	
	
	@PostMapping("/reg")
	public String UserRegistration(User user,Model model) {
		System.out.println("controller layer method");
		System.out.println(user);
		User user2 = userservicei.SaveUser(user);
		
		model.addAttribute("USER", user2);
		return "usersuccess" ;
		
	}
}
