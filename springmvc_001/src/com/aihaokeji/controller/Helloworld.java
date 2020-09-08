package com.aihaokeji.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.aihaokeji.pojo.User;

//@SessionAttributes(value = {"user"})
@Controller
public class Helloworld {
	
	@RequestMapping("/testredirect")
	public String testview1() {
		System.out.println("test redirect");
		return "redirect:/index.jsp";
	}
	
	@RequestMapping("/testview")
	public String testview() {
		System.out.println("test view");
		return "helloViews";
	}
	@ModelAttribute
	public void selectuser(@RequestParam(value = "id",required = false)Integer id,Map<String, Object> map) {
		if(id!=null) {			
			User user = new User();
			user.setId(1);
			user.setUsername("zs");
			user.setPassword("12345678");
			user.setAge(10);
			System.out.println("模拟数据库获取对象"+user);
			map.put("user", user);
		}
	}
	
	@RequestMapping(value = "/testxiugai",method = RequestMethod.POST)
	public String testxiugai(User user) {
		System.out.println("修改：User   "+user);
		return "success";
	}
	
	@RequestMapping(value = "/testsession",method = RequestMethod.GET)
	public String testsession(Map<String, Object> map) {
		User user = new User();
		user.setUsername("zc");
		user.setPassword("12345");
		user.setAge(20);
		map.put("user", user);
		map.put("school", "aikaoxueyuan");
		return "success";
	}
	
	
	@RequestMapping(value = "/testmap",method = RequestMethod.GET)
	public String testmap(Map<String, Object> map) {
		map.put("names", Arrays.asList("a","b","c","d"));
		return "success";
	}
	
	@RequestMapping(value = "/testmodelandview",method = RequestMethod.GET)
	public ModelAndView testmodelandviewString() {
		ModelAndView modelAndView = new ModelAndView("success");
		modelAndView.addObject("time",new Date());
		return modelAndView;
	}
	
	@RequestMapping(value = "/testpojo",method = RequestMethod.POST)
	public String testpojo(User user) {
		System.out.println("user: "+user);
		return "success";
	}
	
	@RequestMapping(value = "/testcookie",method = RequestMethod.GET)
	public String testcookie(@CookieValue(value = "JSESSIONID") String u) {
		System.out.println("JSESSIONID: "+u);
		return "success";
	}
	
	@RequestMapping(value = "/testrequestheader",method = RequestMethod.GET)
	public String testrequestparam(@RequestHeader(value = "User-Agent") String u) {
		System.out.println("User-Agent: "+u);
		return "success";
	}
	
	@RequestMapping(value = "/testrequestparam",method = RequestMethod.GET)
	public String testrequestparam(@RequestParam(value = "username") String username,@RequestParam(value = "age",required = false,defaultValue = "0") Integer age) {
		System.out.println("username: "+username+"  ,age:  "+age);
		return "success";
	}
	@RequestMapping(value = "/test/id={id}",method = RequestMethod.GET)
	public String testget(@PathVariable("id") Integer id) {
		System.out.println("get "+ id);
		return"success";
	}
	
	@RequestMapping(value = "/test",method = RequestMethod.POST)
	public String testpost() {
		System.out.println("post");
		return"success";
	}
	
	@RequestMapping(value = "/test/id={id}",method = RequestMethod.PUT)
	public String testput(@PathVariable("id") Integer id) {
		System.out.println("put: "+ id);
		return"success";
	}
	@RequestMapping(value = "/test/id={id}",method = RequestMethod.DELETE)
	public String testdelete(@PathVariable("id") Integer id) {
		System.out.println("delete: "+ id);
		return"success";
	}
	
	@RequestMapping("/hello")
	public String helloworld() {
		System.out.println("success");
		return"success";
	}
	@RequestMapping(value ="update/id={id}")
	public String pathValiable(@PathVariable("id") Integer id) {
		System.out.println("path valiable "+id);
		return "success";
	}
	

}
