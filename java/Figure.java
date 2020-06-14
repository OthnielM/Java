// Classe non instanciable => abstract
public abstract class Figure{

	//attributs
		//instance
		protected double longueur;
		// Classe
		protected static String unite;

	// methodes
	// instance
	//Constructeur est une methode qui porte le meme nom de la classe et n'a pas de type de 	
	//retour
	//Constructeur par defaut
	public Figure(){
	
	}

	//Getters et setters => Toujours methodes concretes, methodes instances 	//ou methodes 		
	//Classe
	//Getters et Setters de longueur
	public double getLongueur(){
		return this.longueur;
	}

	public void setLongueur(double longueur){
		this.longueur = longueur;
	}

	//Getters et Setters d'unite
	public static String getUnite(){
		return unite;
	}

	public static void setUnite(String unite){
		Figure.unite = unite;
	}

	//metiers
	public abstract double demiPerimetre();
	public double perimetre(){
		return demiPerimetre() * 2;
	}
	public abstract double surface();
	public abstract double diagonale();

}