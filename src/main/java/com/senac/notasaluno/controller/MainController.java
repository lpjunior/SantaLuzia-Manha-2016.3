package com.senac.notasaluno.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/acesso")
public class MainController {

	@PostMapping(path = "/login")
	public @ResponseBody String login() {
		return "logged";
	}

}
