package com.aps.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aps.model.UserData;

@RestController
public class ViewAllRequestsController {
	@RequestMapping("/ViewAllRequestsPageController")
	public String method() {
		Model model = null;
		UserData userData = new UserData();
		model.addAttribute(userData);
		return "ViewAllRequestsPage";
	}
}