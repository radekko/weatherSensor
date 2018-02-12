package com.displayer;

public class GraphicsDisplayer extends AbstractDisplayer {

	@Override
	public String display() {
		return "Graphics displayer: " + weatherConditions.toString();
	}

}
