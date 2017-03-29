/*
 Ecrire la description du problème ici
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author belx22
 */
public class ImpaireSuite {
     public static void main(String[] args) {
         
         Scanner st = new Scanner(System.in);
         //Resuperation de la valeur saisie au clavier
         System.out.println("Entrer une valeur");
        int n = st.nextInt();       
         int s=n;
         //boucle de test sur la condition initiale
         for(int i=1;i<=n;i++){       
             if(s%2==0){
                 s=s-1;
             }
             //Elimination de 1 car ce n'est pas un nombre premier
             else{
                 //Affichage des nombres impaire inferieur au numbre saisie
                  System.out.println(s);
                 s=s-1;
             }
         }
         
     }
    
}
