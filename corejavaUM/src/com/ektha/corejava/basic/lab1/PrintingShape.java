
/*Write a complete Java program in a class named Shape that displays the following output:

  _______
 /       \
/         \
-"-'-"-'-"-
\         /
 \_______/


Help to solve this problem
--------------------------

In java, the \ character is an escape character.
It is used to escape from the normal interpretation of the character following it.

So to print \ itself, we need to escape it by using the \ character before it.

Similarly, the " character denotes the start or the end of a string.

To print the " character, we need to put a \ before the " character.*/

package com.ektha.corejava.basic.lab1;

public class PrintingShape {

	public static void main(String[] args) {

		System.out.println("   _______   ");
		System.out.println("  /       \\ ");
		System.out.println(" /         \\");
		System.out.println(" -\"-'-\"-'-\"-");
		System.out.println(" \\         /");
		System.out.println("  \\_______/ ");

	}

}
