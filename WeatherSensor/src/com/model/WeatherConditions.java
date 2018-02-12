package com.model;

public class WeatherConditions {
	private double outsideTemperature;
	private double insideTemperature;
	private double  humidity;
	private double pressure;
	
	
	public WeatherConditions() {
		outsideTemperature = 0.0;
		insideTemperature = 0.0;
		humidity = 0.0;
		pressure = 0.0;
	}
	
	public WeatherConditions(double outsideTemperature, double insideTemperature, double humidity, double pressure) {
		this.outsideTemperature = outsideTemperature;
		this.insideTemperature = insideTemperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}

	public double getOutsideTemperature() {
		return outsideTemperature;
	}
	public void setOutsideTemperature(double outsideTemperature) {
		this.outsideTemperature = outsideTemperature;
	}
	public double getInsideTemperature() {
		return insideTemperature;
	}
	public void setInsideTemperature(double insideTemperature) {
		this.insideTemperature = insideTemperature;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	@Override
	public String toString() {
		return " [outsideTemperature=" + outsideTemperature + ", insideTemperature="
				+ insideTemperature + ", humidity=" + humidity + ", pressure=" + pressure + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(humidity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(insideTemperature);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(outsideTemperature);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(pressure);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WeatherConditions other = (WeatherConditions) obj;
		if (Double.doubleToLongBits(humidity) != Double.doubleToLongBits(other.humidity))
			return false;
		if (Double.doubleToLongBits(insideTemperature) != Double.doubleToLongBits(other.insideTemperature))
			return false;
		if (Double.doubleToLongBits(outsideTemperature) != Double.doubleToLongBits(other.outsideTemperature))
			return false;
		if (Double.doubleToLongBits(pressure) != Double.doubleToLongBits(other.pressure))
			return false;
		return true;
	}
	

}

