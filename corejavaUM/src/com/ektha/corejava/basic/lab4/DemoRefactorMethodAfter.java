/**public class DemoRefactorMethodBefore {

  public static void main(String[] args) {

    // Refactor the following 4 lines as a method & make the
    // name, city and state as parameters to the method.
    System.out.println("Hello, My name is Boot Camp");
    System.out.println("I live in Dallas, TX");
    System.out.println("I am a java instructor");
    System.out.println("I work for Nivtek");

    System.out.println("Hello, My name is Boot Camp");
    System.out.println("I live in Dallas, TX");
    System.out.println("I am a java instructor");
    System.out.println("I work for Nivtek");

    System.out.println("Hello, My name is Boot Camp");
    System.out.println("I live in Dallas, TX");
    System.out.println("I am a java instructor");
    System.out.println("I work for Nivtek");

    int i = 5, j = 6;
    // Refactor the line below to create an add method.
    int k = i + j;

    System.out.println(k);
    k = 4 + 7;
    System.out.println(k);
  }
}
 *
 */

package com.ektha.corejava.basic.lab4;

/**
 * @author usha
 *
 *
 */
public class DemoRefactorMethodAfter {

	public static void main(String[] args) {

		DemoRefactorMethodAfter drmb = new DemoRefactorMethodAfter();

		drmb.aboutMyself("usha", "Irving", "TX", "Java Developer", "Ekatha Solution");
		drmb.aboutMyself("usha", "Irving", "TX", "Java Developer", "Ekatha Solution");
		drmb.aboutMyself("usha", "Irving", "TX", "Java Developer", "Ekatha Solution");

		int i = 5, j = 6;
		int k = drmb.addition(i, j);
		System.out.println(k);

		k = drmb.addition(4, 7);
		System.out.println(k);

	}

	/**
	 * @param args
	 *
	 */
	public void aboutMyself(String name, String city, String state, String job, String company) {
		System.out.println("My name is " + name);
		System.out.println("I live in " + city + "," + state);
		System.out.println("I Work as " + job);
		System.out.println("I Work for " + company + "\n");
	}

	public int addition(int num1, int num2) {

		return num1 + num2;

	}
}
