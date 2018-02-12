import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.displayer.AbstractDisplayer;
import com.displayer.TextDisplayer;
import com.model.WeatherConditions;
import com.sensor.WeatherSensor;
import com.sensor.WeatherSensorCommunicator;

public class DisplayerTest {
	
	@Test
	public void testIfChangesInWeatherConditionsAreSendingToDisplayer() {
		WeatherSensor ws = new WeatherSensor();
		WeatherSensorCommunicator wss = new WeatherSensorCommunicator(ws);
		AbstractDisplayer textDisplayer = new TextDisplayer();
		wss.registerDisplayer(textDisplayer);
		
		WeatherConditions fakeWeatherConditions = new WeatherConditions(1.1,1.2,1.3,1.4);
		wss.harvestNewWeatherCondition(fakeWeatherConditions);
		
		String firstWeatherConditions = textDisplayer.display();
		
		WeatherConditions fakeWeatherConditions2 = new WeatherConditions(2.1,2.2,2.3,1.4);
		wss.harvestNewWeatherCondition(fakeWeatherConditions2);
		
		String secondWeatherConditions = textDisplayer.display();
		assertNotEquals(firstWeatherConditions, secondWeatherConditions);
	}

}
