package com.araujo.lightinject.example.generator;

import java.util.Random;

/**
 * Created by jorge.araujo on 3/30/2017.
 */

public class TextLowercaseGenerator implements TextGenerator {

	private int maxCharacters;

	public TextLowercaseGenerator() {
		maxCharacters = 10;
	}

	public TextLowercaseGenerator(int amountOfCharacters) {
		maxCharacters = amountOfCharacters;
	}

	@Override
	public String generate() {
		String SALTCHARS = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < maxCharacters) {
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;
	}
}
