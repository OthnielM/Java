public class Classe implements IInscription{

   //Auto généré
    private int id;
    private String nom;
    private static int count;

    // Constructeur
    public Classe(){
	this.id = assignId();
    }

   //Getters and Setters
     public int getId(){
	return this.id;
     }
     public void setId(int id){
	this.id = id;
     }

     public String getNom(){
	return this.nom;
     }
     public void setNom(String nom){
	this.nom = nom;
     }
   //redefinition de la methode affiche()

    @Override
    public String affiche(){
       return "Id: "+id+" Nom : "+nom;
    }

   Classe.count = 0;
   private static int assignId(){
       Classe.count++;
       return Main.count;
   }

}