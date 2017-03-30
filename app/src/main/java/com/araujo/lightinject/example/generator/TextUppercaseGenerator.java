package com.araujo.lightinject.example.generator;

import java.util.Random;

/**
 * Created by jorge.araujo on 3/30/2017.
 */

public class TextUppercaseGenerator implements TextGenerator {

	@Override
	public String generate() {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 10) {
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;
	}
}
