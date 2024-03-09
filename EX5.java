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
		int n, fact=1, i;

		do{
		System.out.println("Entrer un entier :");
		n = in.nextInt();
		}while(n < 0);

		if(n == 0 || n == 1)
			System.out.println(n + "! = 1");
		else{
			i = n;
			while(i >= 2){
				fact *= n;
				i--;
			}
			System.out.println(n + "! = " + fact);

			fact = 1;
			for(i = n; i >= 2; i--)
				fact *= n;
			System.out.println(n + "! = " + fact);
		}

	}
}
