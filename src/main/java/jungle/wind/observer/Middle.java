/**
* Copyright © 1998-2018, Glodon Inc. All Rights Reserved.
*/
package jungle.wind.observer;

/**
 * 中产阶级（观察者）
 * @author hexh-a
 * @since jdk1.6
 * 2018年12月4日
 *  
 */

public class Middle implements Observer {

	public void update(String message) {
		if (message.equals(PriceVary.GO_HIGH)) {
			System.out.println(message + " 还要再存点钱才能买。");
		} else if (message.equals(PriceVary.GO_LOW)) {
			System.out.println(message + " 终于能付个首付了！");
		}
	}

}
