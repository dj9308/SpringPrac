package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.DashboardService;


@Controller
@RequestMapping(value = "/")
public class DashboardController {
	@Autowired
	DashboardService dashboardService; 
	
	@GetMapping
	public String main(Model model) {
		model.addAttribute("list",dashboardService.list());
		return "page/test";
	}
	
	@GetMapping(value = "/content/{num}")
	public String contents(Model model, @PathVariable("num") long num) {
		model.addAttribute("board",dashboardService.findbynum(num));
		return "page/contents";
	}
	
}
