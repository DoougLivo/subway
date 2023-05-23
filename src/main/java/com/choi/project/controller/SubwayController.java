package com.choi.project.controller;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.choi.project.service.SubwayService;

@Controller
public class SubwayController {
	
	@Autowired
	SubwayService subwayService;
	
	@RequestMapping("/list")
	public String getList(Model model, String search) {
		JSONObject sb = subwayService.searchSubway(search);
		model.addAttribute("sb", sb);
		return "list";
	}
}
