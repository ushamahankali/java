/*Write a complete Java program in a class named FightSong that generates
the following output. Use static methods to show structure
and eliminate code duplication in your solution by using methods.

In particular, make sure that
1) Move the system.out from main to the refactored methods.
   The main method should NOT contain any System.out.println statements.
2) the same System.out.println statement never appears in two places in the code.
*/
package com.ektha.corejava.basic.lab3;

public class FightSongMain {

	public static void main(String[] args) {

		/*
		 * FightSong.goTeam(); FightSong.goNextLine(); FightSong.goTeam();
		 * FightSong.goWest(); FightSong.goTeam(); FightSong.goNextLine();
		 * FightSong.goTeam(); FightSong.goWest(); FightSong.goTeam();
		 * FightSong.goNextLine(); FightSong.goTeam();
		 */

		/* Instead of calling method used do while loop */

		int i = 1;
		do {
			if (i % 2 == 1) {
				FightSong.goTeam();
			} else if (i % 4 == 0) {
				FightSong.goWest();
			} else
				FightSong.goNextLine();

			i++;
		} while (i < 12);

	}

}
