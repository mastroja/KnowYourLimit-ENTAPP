package com.knowyourlimit.service;

import org.springframework.stereotype.Component;

import com.knowyourlimit.dto.DrinkDTO;

@Component
public class DrinkServiceStub implements iDrinkService {

	@Override
	public DrinkDTO fetchById(int id) {
		DrinkDTO drinkDTO = new DrinkDTO();
		drinkDTO.setDrinkID(1);
		return drinkDTO;
	}


	@Override
	public void save(DrinkDTO drinkDTO) {
		
	}
}
