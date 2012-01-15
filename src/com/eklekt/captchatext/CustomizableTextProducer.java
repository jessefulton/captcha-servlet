package com.eklekt.captchatext;
import nl.captcha.text.producer.TextProducer;

public class CustomizableTextProducer implements TextProducer {

	private String word;
	
	public CustomizableTextProducer(String theWord) {
		this.word = theWord;
	}
	
	public String getText() {
		return this.word;
	}

	
	
}
