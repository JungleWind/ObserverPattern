/**
* Copyright © 1998-2018, Glodon Inc. All Rights Reserved.
*/
package jungle.wind.observer;

/**
 * 富人（观察者）
 * @author hexh-a
 * @since jdk1.6
 * 2018年12月4日
 *  
 */

public class Rich implements Observer {

	public void update(String message) {
		if (message.equals(PriceVary.GO_HIGH)) {
			System.out.println(message + " 涨的好，我那10套房又能赚几十亿了！");
		} else if (message.equals(PriceVary.GO_LOW)) {
			System.out.println(message + " 没事，房价是中国经济的支柱，后买会涨的。");
		}
	}

}
