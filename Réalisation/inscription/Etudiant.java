import java.time.LocalDate;
public class Etudiant extends Personne{
	private String tuteur;
	private int annee;
	// Propriete navigationnelle;
	private Classe classEtu;

	//Constructeur
	// Par defaut
	public Etudiant(){
		super();
	}
	// Surcharge du constructeur
	public Etudiant(String nomComplet, String dateNaissance, String tuteur, int annee){
		// Initialisation de la personne
		super(nomComplet, dateNaissance);
		this.tuteur = tuteur;
		this.annee = annee;
		
	}

	//Getters et Setters
	public String getTuteur(){
		return this.tuteur;
	}
	public void setTuteur(String tuteur){
		this.tuteur = tuteur;
	}
      	public String getAnnee(){
		return this.annee;
  	    }
     	 public String setAnnee(String annee){
		this.annee = annee;
    	  }
	// Redefinition de la methode affiche()

	@Override
	public String affiche(){
		//super signifie Personne
		//this signifie etudiant
		return super.affiche() +" Tuteur: "+tuteur+" Annee: "+annee;
	}
}