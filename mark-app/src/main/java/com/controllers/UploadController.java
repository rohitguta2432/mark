package com.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("upload")
public class UploadController {
	
	@PostMapping("/")
	public String uploadFile(Model model) {
		
		return "successFull";
	}
	
}
