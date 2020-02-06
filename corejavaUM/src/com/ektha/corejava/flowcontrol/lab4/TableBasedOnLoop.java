package com.ektha.corejava.flowcontrol.lab4;

public class TableBasedOnLoop {

	public void displayTable() {
		System.out.println("N\t10*N\t100*N\t1000*N\t");
		for (int i = 1; i < 6; i++) {
			System.out.printf("%d\t %d\t %d\t %d\t \n", i, i * 10, i * 100, i * 1000);

		}
	}

}
