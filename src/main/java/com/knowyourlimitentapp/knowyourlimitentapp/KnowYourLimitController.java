package com.knowyourlimitentapp.knowyourlimitentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.knowyourlimit.dto.DrinkDTO;
import com.knowyourlimit.service.iDrinkService;

@Controller
public class KnowYourLimitController {

	@Autowired
	private iDrinkService drinkServiceStub;
	
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String read(Model model) {
		DrinkDTO drinkDTO = drinkServiceStub.fetchById(1);
		model.addAttribute("drinkDTO", drinkDTO);
		return "start";
	}
	
	@PostMapping("/start")
	public String create() {
		return "start";
	}
	
	@RequestMapping("/")
	public String index() {
		return "start";
	}
	
}
