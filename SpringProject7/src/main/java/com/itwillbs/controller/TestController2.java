package com.itwillbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController2 {

	@RequestMapping(value="/test2",method=RequestMethod.GET)
	public void test2() {
		// 기능완료
	}
	
	@RequestMapping(value="/test3",method=RequestMethod.GET)
	public void test3() {
		// 기능 완료
	}
	
	@RequestMapping(value="/test4",method=RequestMethod.GET)
	public void test4() {
		// 기능 완료
	}
	
	@RequestMapping(value="/test5",method=RequestMethod.GET)
	public void test5_home() {
		// 집에서 기능 생성완료
	}
	
	@RequestMapping(value="/test6",method=RequestMethod.GET)
	public void test6_home() {
		// 집에서 기능 생성완료2
	}
	
	
	
}
