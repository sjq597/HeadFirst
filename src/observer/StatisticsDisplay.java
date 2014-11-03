package observer;


public class StatisticsDisplay implements Observer, DisplayElemnet {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.setWeatherData(weatherData);
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Avg/Max/Min temperature = : " + (tempSum/numReadings)
				+ "/" + maxTemp + "/" + minTemp);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		tempSum += temp;
		numReadings++;
		
		if(temp > maxTemp)
			maxTemp = temp;
		if(temp < minTemp)
			minTemp = temp;
		display();
	}

	public void setWeatherData(Subject weatherData) {
		this.weatherData = weatherData;
	}

	public Subject getWeatherData() {
		return weatherData;
	}

}
