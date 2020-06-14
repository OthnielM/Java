import java.util.ArrayList;

public class Professeur extends Personne{
	private ArrayList<String> matieres;

       //Par defaut
           public Professeur(){
	super();
          }
      //Surcharge du Contructeur
         //Creer un Objet puis de l'initialiser
          public Professeur(String nomComplet,
               String dateNaiss, ArrayList<String> matieres){
            //Initialisation de la personne
              super(nomComplet,dateNaiss);
             this.matieres = matieres;
          }

   //Getters and Setters
      public ArrayList<String> getMatieres(){
	return this.matieres;
      }
      public void setMatieres(ArrayList<String> matieres){
	this.matieres = matieres;
      }

    @Override
    public String affiche(){
    //super signifie personne
    //this signifie professeur
       return super.affiche() +" Matieres: "+this.matieres.toArray();
    }


}