package com.araujo.lightinject.example;

import com.araujo.lightinject.di.BindingConfiguration;
import com.araujo.lightinject.example.generator.TextGenerator;
import com.araujo.lightinject.example.generator.TextGeneratorProvider;
import com.araujo.lightinject.example.generator.TextLowercaseGenerator;
import com.araujo.lightinject.example.generator.TextUppercaseGenerator;

import android.app.Application;

/**
 * Created by jorge.araujo on 3/30/2017.
 */

public class MyApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		new BindingConfiguration() {
			@Override
			public void configure() {
				// To generate a text in lowercase
				from(TextGenerator.class).to(TextLowercaseGenerator.class).add();

				// To generate a text in uppercase
				//from(TextGenerator.class).to(TextUppercaseGenerator.class).add();

				// To generate a text in lowercase, the object is singleton (will be the same across the whole app)
				//from(TextGenerator.class).to(TextLowercaseGenerator.class).singleton().add();

				// To generate a text the way that it's specified in the TextGeneratorProvider (20 characters instead 10)
				//from(TextGenerator.class).provider(TextGeneratorProvider.class).add();
			}
		}.configure();
	}
}
