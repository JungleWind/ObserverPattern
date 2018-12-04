/**
* Copyright © 1998-2018, Glodon Inc. All Rights Reserved.
*/
package jungle.wind.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * 被观察者
 * @author hexh-a
 * @since jdk1.6
 * 2018年12月4日
 *  
 */

public abstract class Subject {
	List<Observer> observers = new LinkedList<Observer>();
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	/**
	 * 通知观察者
	 * @param message
	 */
	public abstract void notifyObserver(String message);
}
