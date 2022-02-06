package com.sip.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/info")  // ce qu'on tape ds l'url
	public String info(Model model)
	{
		String formation="fullstack";
		ArrayList<String> names= new ArrayList<>();
		names.add("OCP");
		names.add("OCA");
		System.out.println("methode info");
		model.addAttribute("workshop", formation);
		model.addAttribute("names", names);
		return "home/info"; //schema fichier html templates/home
	}
	@RequestMapping("/affichage")
	public String affichage()
	{
		return "home/affichage";
	}
}
