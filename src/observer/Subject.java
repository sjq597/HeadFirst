/**
 * 
 */
package observer;



/**
 * @author Administrator
 * 
 */
public interface Subject {
	//需要一个观察者作为变量
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	//当主题状态改变时，这个方法会被调用，以通知所有观察者
	public void notifyObservers();
}
