public class Etudiant extends Personne{


    private String tuteur;
    private int annee;

    //Propriété navigationnelle
     private Classe  classeEtu;
   
    //Constructeur
       //Par defaut
           public Etudiant(){
          }
      //Surcharge du Contructeur
         //Creer un Objet puis de l'initialiser
          public Etudiant(String nomComplet,
               LocalDate dateNaiss,String matiere;){
            //Initialisation de la personne
              super(nomComplet,dateNaiss)
             this.matiere=matiere;
           
          }

   //Getters and Setters
     public string getTuteur(){
          return this.tuteur;
     }

     public void setTuteur(String tuteur){
            this.tuteur=tuteur;
     }
      public string getAnnee(){
          return this.annee;
     }

     public void setAnnee(int annee){
            this.annee=annee;
     }

   //redefinition de la methode affiche()

    @Override
    public String affiche(){
    //super signifie personne
    //this signifie etudiant
       return super.affiche() +" Tuteur : "+tuteur 
                     +" Annee "+annee;
    }

}