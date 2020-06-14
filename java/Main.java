//java.lang
//System.out =>Ecran
//System.in =>Clavier
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class Main {
        //Declaration de variables => portée de classe
       public static void main(String args[]){
	/*
	System.out.println("Bonjour à Tous"); 
	System.out.println("les etudiants de la GLRS et MAE "); 
               //Scanner clavier pour lire les données tapeés au clavier
	Scanner clavier=new Scanner(System.in);
	System.out.println("Veuillez saisir un Mot");
               //Lire une donnée de type chaine 
	String prenom=clavier.next();
	System.out.println("Bonjour "+prenom); 
               
               //type primitifs ou de données  => int ,    float, double, char,      boolean 
               //classes wappers ou Enveloppes => Integer, Float, Double, Character, Boolean
               
	System.out.println("Veuillez saisir un entier");
	int x=clavier.nextInt();
	System.out.println("Le nombre est "+x); 
          
             // Figure f=new Figure(); impossible car //Figure est classe Abstraite
                Carre c=new Carre();
                c.setLongueur(12);
                System.out.println("La Longueur est "+ c.getLongueur());
                 //Surcharge
                Carre c1=new Carre(15);
                System.out.println("La Longueur est "+ c1.getLongueur());
                 System.out.println("Le Demi Perimetre est "+ c1.demiPerimetre());
                 System.out.println("Le Perimetre est "+ c1.perimetre());
	System.out.println("La Surface est "+ c1.surface());
	System.out.println("La Diagonale est "+ c1.diagonale());
	*/

int choix;

ArrayList<Carre> listCarre = new ArrayList<Carre>();
ArrayList<Rectangle> listRectangle = new ArrayList<Rectangle>();
do{
	Carre carre=new Carre();
	Rectangle rect=new Rectangle();
              System.out.println();
              System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~MENU~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
              System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~1- Ajout Carre~~~~~~~~~~~~~~~~~~~~~~~~~~");
              System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~2- Lister Carre~~~~~~~~~~~~~~~~~~~~~~~~~~");
              System.out.println("~~~~~~~~~~~~~~~~~~~~3- Afficher tableau Carre~~~~~~~~~~~~~~~~~~~~");
              System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~4- Ajout Rectangle~~~~~~~~~~~~~~~~~~~~~~~~");
              System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~5- Lister Rectangle~~~~~~~~~~~~~~~~~~~~~~~~");
              System.out.println("~~~~~~~~~~~~~~~~~~6- Afficher tableau Rectangle~~~~~~~~~~~~~~~~~~");
              System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~7- Quitter~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
              System.out.println("Faites votre choix");
              Scanner clavier=new Scanner(System.in);
              choix=clavier.nextInt();
              System.out.println();

           switch(choix){
            case 1:
                 System.out.println("Veuillez saisir la longueur");
                   double longueur=clavier.nextDouble();
                   carre.setLongueur(longueur);
	  listCarre.add(0, carre);
             break;
            case 2:
                 System.out.println("La Longueur est "+listCarre.get(0).getLongueur());
                 System.out.println("Le Demi Perimetre est "+listCarre.get(0).demiPerimetre());
                 System.out.println("Le Perimetre est "+ listCarre.get(0).perimetre());
                 System.out.println("La Surface est "+ listCarre.get(0).surface());
                 System.out.println("La Diagonale est "+listCarre.get(0).diagonale());
             break;
             case 3:
	int i = 0;
	while(i < listCarre.size()){
		System.out.println("Longueur: " +listCarre.get(i).getLongueur());
		i++;
	}
             break;
             case 4:
              	  System.out.println("Veuillez saisir la Longueur");
                   double a=clavier.nextDouble();
	  System.out.println("Veuillez saisir la largeur");
                   double b=clavier.nextDouble();
                   rect.setLongueur(a);
                   rect.setLargeur(b);
	  listRectangle.add(0, rect);
              break;
              case 5:
                 System.out.println("La Longueur est "+listRectangle.get(0).getLongueur()+" et la largeur est "+listRectangle.get(0).getLargeur());
                 System.out.println("Le Demi Perimetre est "+listRectangle.get(0).demiPerimetre());
                 System.out.println("Le Perimetre est "+ listRectangle.get(0).perimetre());
                 System.out.println("La Surface est "+ listRectangle.get(0).surface());
                 System.out.println("La Diagonale est "+listRectangle.get(0).diagonale());
             break;
             case 6:
/*
	for (Rectangle r_object: listRectangle){
		System.out.println("Longueur: " +r_object.getLongueur() + "   |   Largeur: "+r_object.getLargeur());
	}
*/
	int j = 0;
	while(j < listRectangle.size()){
		System.out.println("Longueur: " +listRectangle.get(j).getLongueur() + "   |   Largeur: "+listRectangle.get(j).getLargeur());
		j++;
	}
             break;
           }

     } while(choix!=7);


                  
       }

}

/*Portée block
 {
    int var1=2;
    {
       int var2;
      //Possible
       int s=var1+var2;
    }
      //Impossible
       int s=var1+var2;//var2 n'existe pas dans ce bloc
 }
*/

