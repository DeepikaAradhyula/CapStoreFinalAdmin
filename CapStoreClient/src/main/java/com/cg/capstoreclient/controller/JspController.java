package com.cg.capstoreclient.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {

	@RequestMapping(value="/admin")
	public String wel() {
		return "admin";
	}
}
