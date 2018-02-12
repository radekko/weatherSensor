package com.main;

import com.displayer.GraphicsDisplayer;
import com.displayer.AbstractDisplayer;
import com.displayer.TextDisplayer;
import com.model.WeatherConditions;
import com.sensor.WeatherSensor;
import com.sensor.WeatherSensorCommunicator;

public class Main {

	public static void main(String[] args) {
		WeatherSensor ws = new WeatherSensor();
		WeatherSensorCommunicator wss = new WeatherSensorCommunicator(ws);
		
		AbstractDisplayer textDisplayer = new TextDisplayer();
		AbstractDisplayer graphicsDisplayer = new GraphicsDisplayer();
		wss.registerDisplayer(textDisplayer);
		wss.registerDisplayer(graphicsDisplayer);
		
		System.out.println(textDisplayer.display());
		System.out.println(graphicsDisplayer.display());
		
		WeatherConditions fakeWeatherConditions = new WeatherConditions(1.1,1.2,1.3,1.4);
		wss.harvestNewWeatherCondition(fakeWeatherConditions);
		
		System.out.println(textDisplayer.display());
		System.out.println(graphicsDisplayer.display());
		
		WeatherConditions fakeWeatherConditions2 = new WeatherConditions(2.1,2.2,2.3,1.4);
		wss.harvestNewWeatherCondition(fakeWeatherConditions2);
		
		System.out.println(textDisplayer.display());
		System.out.println(graphicsDisplayer.display());
	}

}
