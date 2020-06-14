public class Classe implements IInscription{
	// Auto généré
	private Integer id;
	private String nom;
	// Propriete navigationnelle;
	private Etudiant[] EtuClass;

	// Getters and Setters

	// Redéfinition de la methode affiche()
	@Override
	public String affiche(){
		String idS = id.toString();
		return "Id: "+idS+" Nom: "+nom;
	}
}