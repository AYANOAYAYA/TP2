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
		int n, count = 0, i;

		System.out.println("Entrez le nombre :");
        	n = in.nextInt();

		for(i = 1; i <= n; i++){
			if ((n % i) == 0)
			count++;
		}
		if(count == 2)
			System.out.println(n + " est premier.");
		else
			System.out.println(n + " n'est pas premier.");
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, count = 0, i, j;
		System.out.println("Entrez le nombre N :");
        	n = in.nextInt();

        	for (i = 1; i <= n; i++) {
            		for (j = 1; j <= i; j++) {
                		if (i % j == 0) {
                    			count++;
                		}
            		}
            		if (count == 2) {
                		System.out.println(i + " est premier.");
            		} else {
                		System.out.println(i + " n'est pas premier.");
           	 }
	}
}
