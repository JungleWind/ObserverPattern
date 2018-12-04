/**
* Copyright © 1998-2018, Glodon Inc. All Rights Reserved.
*/
package jungle.wind.observer;

/**
 * 观察者模式测试
 * @author hexh-a
 * @since jdk1.6
 * 2018年12月4日
 *  
 */

public class TestObserver {

	public static void main(String[] args) {
		Subject housePrice = new HousePrice();
		housePrice.addObserver(new Poor());
		housePrice.addObserver(new Middle());
		housePrice.addObserver(new Rich());
		housePrice.notifyObserver(PriceVary.GO_HIGH);
		System.out.println("----------------------------");
		housePrice.notifyObserver(PriceVary.GO_LOW);
	}

}
