/**
* Copyright © 1998-2018, Glodon Inc. All Rights Reserved.
*/
package jungle.wind.observer;

/**
 * 房价（被观察者）
 * @author hexh-a
 * @since jdk1.6
 * 2018年12月4日
 *  
 */

public class HousePrice extends Subject{

	@Override
	public void notifyObserver(String message) {
		for (Observer observer : observers) {
			observer.update(message);
		}
	}

}
