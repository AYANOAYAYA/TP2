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
		int x, n, mul = 1, i;

		System.out.println("Entrez un entier :");
        	x = in.nextInt();

		System.out.println("Entrez un entier :");
        	n = in.nextInt();

		for(i = 1; i <= n; i++){
			mul *= x;
		}

		System.out.println("La multiplications successives est : " + mul);
	}
}
