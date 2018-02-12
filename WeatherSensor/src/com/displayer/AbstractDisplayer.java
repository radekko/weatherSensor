package com.displayer;

import com.model.WeatherConditions;

public abstract class AbstractDisplayer {

	protected WeatherConditions weatherConditions = new WeatherConditions();
	public abstract String display();
	public void setNewWeatherConditionsToDisplay(WeatherConditions newWeatherConditions) {
		weatherConditions = newWeatherConditions;
	};
}
