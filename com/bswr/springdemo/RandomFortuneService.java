package com.bswr.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	String[] data = {
		"do it hard, you will succeed!",
		"diligengce is the mother of success!",
		"be aware of the wolf in sheep clothes!"
	};
	
	Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
