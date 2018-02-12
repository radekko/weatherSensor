package com.sensor;

import com.model.WeatherConditions;

public class WeatherSensor {

	private boolean isChange;
	private WeatherConditions currentWeatherConditions;
	private WeatherConditions newWeatherConditions;
	
	public WeatherSensor() {
		currentWeatherConditions = new WeatherConditions();
	}
	
	public void harvestNewWeatherCondition(WeatherConditions fakedWc) {
		 newWeatherConditions = fakedWc;
		 if(!newWeatherConditions.equals(currentWeatherConditions)) {
			 currentWeatherConditions = newWeatherConditions;
			 isChange = true;
		 }
		 else
			 isChange = false;
	}
	
	public boolean isChange() {
		return isChange;
	}

	public WeatherConditions getCurrentWeatherConditions() {
		return currentWeatherConditions;
	}
	
}
