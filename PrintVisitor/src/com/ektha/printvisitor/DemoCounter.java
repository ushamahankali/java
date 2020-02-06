/**
 *
 */
package com.ektha.printvisitor;

/**
 * @author usha
 *
 */
public class DemoCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Counter counter = new Counter();

		int count = 1;

		while (count <= 100) {

			counter.incrementCounter();
			System.out.println(count);
			count++;

		}
		counter.scanner.close();

	}
}
