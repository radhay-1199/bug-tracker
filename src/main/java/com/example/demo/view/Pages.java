package com.example.demo.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.IssueDb;

@Controller
public class Pages {

	@Autowired
	IssueDb issue;
	
	@GetMapping("/")
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("command",issue);
		return mv;
	}
}
