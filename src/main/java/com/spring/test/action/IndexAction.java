package com.spring.test.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexAction {
	@RequestMapping("/")
	@ResponseBody
	public String indexPage(){
		return "index";
	}
	
	@RequestMapping("/index")
	public String topage(){
		return "index_page";
	}
	
}
