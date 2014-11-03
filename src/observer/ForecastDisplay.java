package observer;


public class ForecastDisplay implements Observer, DisplayElemnet {
	private float currentPressure = 29.2f;
	private float lastPressure;
	private Subject weatherData;

	public ForecastDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.setWeatherData(weatherData);
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the day!");
		} else if(currentPressure < lastPressure) {
			System.out.println("More of the same!");
		} else {
			System.out.println("Watch out for cooler, rainy weather!");
		}
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		lastPressure = currentPressure;
		currentPressure = pressure;

		display();
	}

	public void setWeatherData(Subject weatherData) {
		this.weatherData = weatherData;
	}

	public Subject getWeatherData() {
		return weatherData;
	}

}
