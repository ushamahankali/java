/**
 *
 */
package com.ektha.corejava.flowcontrol.lab1;

/**
 * @author Usha
 *
 */
public class DemoLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ForLoop fl = new ForLoop();
		WhileLoop wl = new WhileLoop();
		System.out.println("Result from While Loop");
		wl.getWhileLoop();
		System.out.println("\nResult from For Loop");
		fl.getForLoop();

	}

}
