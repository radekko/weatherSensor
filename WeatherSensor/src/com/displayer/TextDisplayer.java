package com.displayer;

public class TextDisplayer extends AbstractDisplayer {

	@Override
	public String display() {
		return "Text displayer:     "+weatherConditions.toString();
	}

}
