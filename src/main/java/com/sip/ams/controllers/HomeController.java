package com.sip.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@PostMapping("/result")
	@ResponseBody
	public String resultat(@RequestParam("nom") String n, @RequestParam("email") String e)
	{
		return "Vous avez taper un nom : " +n +" un email : "+e;
	}
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
