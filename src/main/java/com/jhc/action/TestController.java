package com.jhc.action;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhc.model.UserModel;
import com.jhc.service.UserService;

@RestController
public class TestController {
	@Autowired
	private UserService userService;
	@RequestMapping("/test")
	public String test(){
		System.out.println("start to springboot project ~~");
		List<UserModel> list = userService.getAllUser();
		System.out.println(list);
		return "Hello !! This is My First Spring Boot Project";
	}
	@RequestMapping("/loginOn")
	public String loginOn(){
		return "login";
	}
}
