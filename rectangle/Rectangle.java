package rectangle;

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
public class Rectangle {

    /**
     *  Classe Rectangle
     *  Attributs longueur, largeur et unité
     */
    
    //Attributs Instances
            private int largeur; 
            private int longueur; 
          //Attributs classe ou Attributs static
            private static String unite;
            private static int choix;
            public Rectangle(int longueur, int largeur){
                this.longueur = longueur;
                this.largeur = largeur;
    }
            public Rectangle(){
                this.longueur = 0;
                this.largeur = 0;
            }
            // Getters
            public int getLongueur(){
                return this.longueur;
            }
            public int getLargeur(){
                return this.largeur;
            }
            
            // Setters
            public void setLongueur(int longueur){
                this.longueur = longueur;
            }
            public void setLargeur(int largeur){
                this.largeur = largeur;
            }
            
            // stactic functions
            public static String getUnite(){
                return unite;
            }
            public static void setUnite(String unite){
                Rectangle.unite = unite;
            }
            
            // use cases methods
            public int demiPerimetre(){
                return this.longueur + this.largeur;
            }
            public int perimetre(){
                return demiPerimetre() * 2;
            }
            public int surface(){
                return this.longueur * this.largeur;
            }
            public int diagonale(){
                return 0;
            }
            
            public static void menu(){
                System.out.println("~~~~~~~~~~~Menu~~~~~~~~~~~\n");
                System.out.println("~~~~~~~~~~~1 -> CREER RECTANGLE~~~~~~~~~~~\n");
                System.out.println("~~~~~~~~~~~2 -> DEMI-PERIMETRE~~~~~~~~~~~\n");
                System.out.println("~~~~~~~~~~~3 -> PERIMETRE~~~~~~~~~~~\n");
                System.out.println("~~~~~~~~~~~4 -> SURFACE~~~~~~~~~~~\n");
                System.out.println("~~~~~~~~~~~5 -> DIAGONALE~~~~~~~~~~~\n");
                System.out.println("~~~~~~~~~~~6 -> QUITTER~~~~~~~~~~~\n");
            }
            
            public void saisie(){
                Scanner clavier = new Scanner(System.in);
                System.out.print("Saisir la longueur : ");
                 setLongueur(clavier.nextInt());
                System.out.print("Saisir la largeur : ");
                 setLargeur(clavier.nextInt());
        
            }
            
            public static  void main (String[] args){
                do{
                    menu();
        
                    Scanner clavier = new Scanner(System.in);
                    System.out.println("Saisir votre choix : ");
                    choix = clavier.nextInt();
                    while(choix <1 || choix > 6){
                        System.out.println("Saisir votre choix : ");
                        choix = clavier.nextInt();
                    }

                    Rectangle rect = new Rectangle();

                    switch(choix){
                        case 1:
                            rect.saisie();
                            break;
                        case 2:
                            System.out.println(rect.demiPerimetre());
                            break;
                        case 3:
                           System.out.println( rect.perimetre());
                           break;
                        case 4:
                            System.out.println(rect.surface());
                            break;
                        case 5:
                            System.out.println(rect.diagonale());
                            break;
                        case 6:
                            System.out.println("Au revoir !!!\n");
                            break;
                        default:
                            System.out.println("Operation indisponible\n");
                    }
                    if((choix < 1) && (choix >6)){
                        System.out.println("Erreur de saisie");
                    }
                    if(choix == 6){
                        System.out.println("Au revoir");
                    }
                } while(choix !=6);
            }
}
