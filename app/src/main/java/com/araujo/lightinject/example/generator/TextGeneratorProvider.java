package com.araujo.lightinject.example.generator;

import com.araujo.lightinject.di.Provider;

/**
 * Created by jorge.araujo on 3/30/2017.
 */

public class TextGeneratorProvider implements Provider<TextGenerator> {

	@Override
	public TextGenerator provide() {
		return new TextLowercaseGenerator(20);
	}
}
