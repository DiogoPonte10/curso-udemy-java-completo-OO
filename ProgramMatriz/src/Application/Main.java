package Application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Write the number of lines: ");
		int m = sc.nextInt();
		System.out.print("Write the number of columns: ");
		int n = sc.nextInt();

		int[][] matriz = new int[m][n];

		for (int a=0; a < m; a++) {
			for (int b=0; b < n; b++) {
				matriz[a][b] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.print("Write the number that you want search: ");
		int x = sc.nextInt();

		for (int i=0; i < m; i++) {
			for (int c=0; c < n; c++) {
				if (x == matriz[i][c]) {
					System.out.println("Position " + i + ", " + c + ":");
					if (c > 0) {
						System.out.println("Left: " + matriz[i][c - 1]);
					}
					if (i  > 0) {
						System.out.println("Up: " + matriz[i - 1][c]);
					}
					if (c < (n - 1)) {
						System.out.println("Right: " + matriz[i][c + 1]);
					}
					if (i < (m - 1)) {
						System.out.println("Down: " + matriz[i + 1][c]);
					}
				}
			}
		}

		sc.close();
	}
}
