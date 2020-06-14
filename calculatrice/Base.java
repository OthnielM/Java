package calculatrice;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Albéric
 */
public class Base {

    /**
     * the command line arguments
     */
         public static  double resultat;
        public static double calculatrice(double nbre1, double nbre2, int op){
           
            switch(op){
                case 1:
                    resultat = nbre1 + nbre2;
                    break;
                case 2:
                    resultat = nbre1 - nbre2;
                    break;
                case 3:
                    resultat = nbre1 / nbre2;
                    break;
                case 4:
                    resultat = nbre1 * nbre2;
                    break;
                default:
                    break;
            }
            return resultat;
        }
}
