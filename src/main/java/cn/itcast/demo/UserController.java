package cn.itcast.demo;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("/findLoginUser")
	public void findLoginUser(){
		//当前登录名
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		System.out.println("当前登录名："+name);
System.out.println("添点东西");	}
	// 添加一个方法
	@RequestMapping("/findLoginUser1")
	public void findLoginUser1(){
		//当前登录名
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		System.out.println("当前登录名："+name);
		
	}
	
}
