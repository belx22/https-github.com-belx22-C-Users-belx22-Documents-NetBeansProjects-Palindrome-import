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
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        int i;
        String renverser = "";
        
        Scanner rt = new Scanner(System.in);
        System.out.println("Veuillez entrer le mot à vérifier");
        String mot = rt.nextLine();
        for(i=mot.length()-1;i>=0;i--){
            
            renverser = renverser + mot.charAt(i);
           
            
        }
        
        if(mot.equals(renverser)){
            
            System.out.println("Ceci est un palindrome");
        }
        else System.out.println("Ce mot n'est pas un palindrome");
    }
    
}
