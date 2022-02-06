package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/info")  // ce qu'on tape ds l'url
	public String info()
	{
		System.out.println("methode info");
		return "home/info"; //schema fichier html templates/home
	}
	@RequestMapping("/affichage")
	public String affichage()
	{
		return "home/affichage";
	}
}
