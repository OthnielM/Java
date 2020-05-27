import java.util.Scanner;
public class Main {
          public static void main(String args[]){
int choix;
Carre carre=new Carre();
do{
              System.out.println("1- Inscrire etudiant");
              System.out.println("2- Lister classe");
              System.out.println("3- Afficher les etudiants");
              System.out.println("4- Afficher les professeurs");
              System.out.println("4- Creer professeurs");
              System.out.println("4- Creer classe");
              System.out.println("4- afficher une classe");
              System.out.println("5- Quitter");
              System.out.println("Faites votre choix");
              Scanner clavier=new Scanner(System.in);
              choix=clavier.nextInt();