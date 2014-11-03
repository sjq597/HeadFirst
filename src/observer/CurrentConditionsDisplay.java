/**
 * 当前观测值布告板
 */
package observer;


/**
 * @author Administrator
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElemnet {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	//构造器需要weatherDatad对象(也就是主题)作为注册用
	public CurrentConditionsDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		//保存Subject的引用，以后可能会想要取消注册，有其引用会比较方便
		this.setWeatherData(weatherData);
		//注意是调用主题WeatherData把CurrentConditionsDisplay这个观察者注册，
		//切忌写成this.weatherData.registerObserver(weatherData)
		weatherData.registerObserver(this);
	}

	/* (non-Javadoc)
	 * @see observer.DisplayElemnet#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	/* (non-Javadoc)
	 * @see observer.Observer#update(float, float, float)
	 */
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		//同理，把温度和湿度保存起来，理由同上
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

	public void setWeatherData(Subject weatherData) {
		this.weatherData = weatherData;
	}

	public Subject getWeatherData() {
		return weatherData;
	}

}
