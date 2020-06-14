package calculatrice;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Albéric
 */
public class Calculatrice {

    /**
     *  @param args the command line arguments
     */
    public static void main(String args[]) {
        do{
            menu();
        
            Scanner clavier = new Scanner(System.in);
            System.out.println("Saisir votre choix : ");
            choix = clavier.nextInt();
            while(choix <1 || choix > 5){
                System.out.println("Saisir votre choix : ");
                choix = clavier.nextInt();
            }
            if((choix >= 1) && (choix <5)){
                saisie();
                System.out.println(Base.calculatrice(Calculatrice.nbre1, Calculatrice.nbre2, choix));
            } else if(choix == 5){
                System.out.println("Au revoir !!!");
            } else {
                System.out.println("Erreur de saisie !!!");
            }
            
        } while (choix != 5);

    }
    
    private static double nbre1;
    private static double nbre2;
    private static int choix;
    
    public static void saisie(){

        Scanner clavier = new Scanner(System.in);
        System.out.print("Saisir un nombre : ");
        Calculatrice.nbre1 = clavier.nextDouble();
        System.out.print("Saisir un nombre : ");
        Calculatrice.nbre2 = clavier.nextDouble();
        
    }
    
    public static void menu(){
        System.out.println("~~~~~~~~~~~Menu~~~~~~~~~~~\n");
            System.out.println("~~~~~~~~~~~1 -> ADDITION~~~~~~~~~~~\n");
            System.out.println("~~~~~~~~~~~2 -> SOUSTRACTION~~~~~~~~~~~\n");
            System.out.println("~~~~~~~~~~~3 -> DIVISION~~~~~~~~~~~\n");
            System.out.println("~~~~~~~~~~~4 -> MULTIPLICATION~~~~~~~~~~~\n");
            System.out.println("~~~~~~~~~~~5 -> QUITTER~~~~~~~~~~~\n");
    }
    
}
