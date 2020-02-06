/*Write a complete Java program in a class named FightSong that generates
the following output. Use static methods to show structure
and eliminate code duplication in your solution by using methods.

In particular, make sure that
1) Move the system.out from main to the refactored methods.
   The main method should NOT contain any System.out.println statements.
2) the same System.out.println statement never appears in two places in the code.
*/

package com.ektha.corejava.basic.lab3;

public class FightSong {

	public static void goNextLine() {
		System.out.println("");
	}

	public static void goTeam() {
		System.out.println("Go, team, go!");
		System.out.println("You can do it.");
	}

	public static void goWest() {
		System.out.println("You're the best,");
		System.out.println("In the West");

	}

}