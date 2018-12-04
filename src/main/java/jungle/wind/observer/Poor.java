/**
* Copyright © 1998-2018, Glodon Inc. All Rights Reserved.
*/
package jungle.wind.observer;

/**
 * 穷人（观察者）
 * @author hexh-a
 * @since jdk1.6
 * 2018年12月4日
 *  
 */

public class Poor implements Observer{

	public void update(String message) {
		System.out.println(message + " 跟我没关系，反正买不起！");
	}

}
