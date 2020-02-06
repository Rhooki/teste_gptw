package com.gptw.teste.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {
		
	@RequestMapping("/")
	public String index() {
		return "Teste para a Empresa GPTW";
	}
}
