package com.sensor;
import java.util.ArrayList;
import java.util.List;

import com.displayer.AbstractDisplayer;
import com.model.WeatherConditions;

public class WeatherSensorCommunicator {
	
	 private List<AbstractDisplayer> listOfDisplayers = new ArrayList<AbstractDisplayer>();
	 private WeatherSensor ws;

	 public WeatherSensorCommunicator(WeatherSensor ws) {
		 this.ws = ws;
	 }
	
	public void registerDisplayer(AbstractDisplayer displayer) {
		listOfDisplayers.add(displayer);
	}
	
	public void unregisterDisplayer(AbstractDisplayer displayer) {
		listOfDisplayers.remove(displayer);
	}
	
	public void harvestNewWeatherCondition(WeatherConditions fakeWc) {
		 ws.harvestNewWeatherCondition(fakeWc);
		 notifyDisplayersIfWeatherConditionsAreChanged();
	}
	
	private void notifyDisplayersIfWeatherConditionsAreChanged() {
		if(ws.isChange())
			notifyDisplayers(ws.getCurrentWeatherConditions());
	}
	
	private void notifyDisplayers(WeatherConditions newWeatherConditions) {
		if(!listOfDisplayers.isEmpty())
			listOfDisplayers.stream()
				.forEach(displayer -> displayer.setNewWeatherConditionsToDisplay(newWeatherConditions));
	}

}
