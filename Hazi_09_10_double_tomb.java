/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi_09_10_double_tomb;

import java.util.Scanner;

/**
 *
 * @author bodnart
 */
public class Hazi_09_10_double_tomb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //double szorzatok
        Scanner sc = new Scanner(System.in);
        int egesz = 0;
        double max = 0;
        double szorzat = 1;
        double osszeg = 0;
        double min = 0;
        double tiznelNagyobb = 0;

        do {
            System.out.println("Írj be egy pozitív egész számot: ");
            egesz = sc.nextInt();

        } while (egesz < 0);
        double[] tomb = new double[egesz];
        for (int i = 0; i <= tomb.length - 1; i++) {
            System.out.print(i + ". " + "Kérek egy double számot: ");
            double temp = sc.nextDouble();
            tomb[i] = temp;
        }
        for (double szam : tomb) {
            osszeg = osszeg + szam;
        }
        System.out.println("Összegük: " + osszeg);
        
        for (int i = tomb.length-1; i >= 0; i--) {
            System.out.println(tomb[i]);
        }

        for (int i = 0; i < tomb.length/2; i++){
            double temp = 0;
            temp = tomb[i];
            tomb[i] = tomb[tomb.length - 1 - i];
            tomb[tomb.length - 1 -i] = temp;
        }
        for (double szam : tomb) {
        System.out.println(szam);
    
        }
    }
}
