package com.knowyourlimit.service;

import com.knowyourlimit.dto.DrinkDTO;

public interface iDrinkService {

	DrinkDTO fetchById(int id);

	void save(DrinkDTO drinkDTO);

}