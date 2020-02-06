/**
 *
 */
package com.ektha.corejava.basic.lab4;

/**
 * @author usha
 *
 */
public class DemoRefactorWithStaticMethodAfter {

	public static void aboutMySelf(String city, String state) {
		System.out.println("Hello my name is Usha");
		System.out.println("I Live in " + city + ", " + state + ".");
		System.out.println("I am a JavaDeveloper.");
		System.out.println("I work for EkthaSolutions. \n");
	}

	public static int add(int i, int j) {
		return i + j;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		aboutMySelf("Irving", "TX");
		aboutMySelf("Irving", "TX");
		aboutMySelf("Irving", "TX");

		int i = 5, j = 6;
		int k = add(i, j);
		System.out.println(k);

		k = add(4, 7);
		System.out.println(k);

	}

}
