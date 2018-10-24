package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("dashboard")
public class DashboardController {

	@RequestMapping(value="")
	public String viewDashboard(Model model) {
		return "dashboard/view";
	}
}
