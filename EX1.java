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
        int n, sum = 0, produit = 1, i;
        float moyenne;

        System.out.println("Entrez un entier :");
        n = in.nextInt();

        i = 1;
        while (i <= n) {
            sum += i;
            produit *= i;
            i++;
        }
        moyenne = (float) sum / n;
        System.out.println("La somme est : " + sum + " ,le produit est : " + produit + " ,la moyenne est : " + moyenne);

        sum = 0;
        produit = 1;
        i = 1;
        do{
            sum += i;
            produit *= i;
            i++;
        }while (i <= n);
        moyenne = (float) sum / n;
        System.out.println("La somme est : " + sum + " ,le produit est : " + produit + " ,la moyenne est : " + moyenne);

        sum = 0;
        produit = 1;
        for(i = 1; i <= n; i++){
            sum += i;
	    produit *= i;
        }
        moyenne = (float) sum / n;
        System.out.println("La somme est : " + sum + " ,le produit est : " + produit + " ,la moyenne est : " + moyenne);
    }
}
