package com.itwillbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController2 {

	@RequestMapping(value="/test2",method=RequestMethod.GET)
	public void test2() {
		// ��ɿϷ�
	}
	
	@RequestMapping(value="/test3",method=RequestMethod.GET)
	public void test3() {
		// ��� �Ϸ�
	}
	
	@RequestMapping(value="/test4",method=RequestMethod.GET)
	public void test4() {
		// ��� �Ϸ�
	}
	
	@RequestMapping(value="/test5",method=RequestMethod.GET)
	public void test5_home() {
		// ������ ��� �����Ϸ�
	}
	
	
	
	
}
