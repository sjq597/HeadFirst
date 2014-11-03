/**
 * 
 */
package observer;

/**
 * @author Administrator
 *
 */
public interface Observer {
	//当观测值改变时，主题会把这些状态当作方法的参数，传送给观察者
	public void update(float temp, float humidity, float pressure);
}
