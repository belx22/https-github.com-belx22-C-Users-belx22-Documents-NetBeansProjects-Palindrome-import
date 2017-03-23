/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author belx22
 */
public class Binaire {
     public static void main(String[] args) {
        int tab[]= new int[30];
         Scanner tj = new Scanner(System.in);    
        System.out.println("Entrer le nombre a convertir en Binaire :");
     int  nbre = tj.nextInt();
        int i=0,k;
        System.out.print(nbre+" En binaire est :");
         do{
             tab[i] = nbre%2;
             
             nbre=nbre/2;
             i++;
         }while(nbre!=0);
         for(k=i-1;k>=0;k--){
             System.out.print(" "+tab[k]);
         }
         System.out.println("");
     }
}
