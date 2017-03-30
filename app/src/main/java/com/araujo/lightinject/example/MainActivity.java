package com.araujo.lightinject.example;

import com.araujo.lightinject.example.generator.TextGenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

	@Inject private TextGenerator textGenerator; // It will be instantiated with the value specified in MyApplication

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView textView = (TextView) findViewById(R.id.text_view);
		textView.setText(textGenerator.generate());
	}
}
