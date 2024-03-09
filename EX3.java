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
		int n, i;
		double h = 0f;

		System.out.println("Entrez un entier :");
        	n = in.nextInt();

		for(i = 1; i <= n; i++){
			h += 1.0 / i;
		}

		System.out.println("La somme des " + n + "premiers termes de la série harmonique : " + h);
	}
}
