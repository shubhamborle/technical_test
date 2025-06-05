package com.app.demo_sub_que.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo_sub_que.entity.Subject;

@RestController
@RequestMapping("/subject")
public class SubjectController {
	
	@GetMapping("/check")
	public String getAllSubject() {
		System.out.println("working well");
		return "working well";
	}
}
