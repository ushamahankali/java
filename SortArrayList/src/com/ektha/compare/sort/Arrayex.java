package com.ektha.compare.sort;

public class Arrayex {
	public static void main(String[] args) {
		int[][] n = { { 1, 2 }, { 3, 4 } };
		for (int i = 0; i < n.length; i++) {
			for (int x : n[i]) {
				System.out.print(x);
			}
		}
	}
}