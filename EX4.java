/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author pro
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, i, j;

		System.out.println("Entrez le nombre de lignes :");
        	n = in.nextInt();

		for(i = 1; i <= n; i++){
			for(j = 1; j <= i; j++)
				System.out.println("*");
			System.out.println();
		}
	}
}
