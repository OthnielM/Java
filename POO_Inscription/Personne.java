import java.time.LocalDate;
import java.time.Period;
public abstract class Personne implements IInscription{

   //Auto généré
    protected int id;
    protected  String nomComplet;
    protected  LocalDate dateNaiss;
    protected  int  age;
    private static int count;

    public Personne (String nomComplet,
               String dateNaiss){
      this.nomComplet=nomComplet;
      this.dateNaiss=LocalDate.parse(dateNaiss);
     //Initialisé ID
       this.id = assignId();
       this.age=calculAge();

    }

      public Personne (){
        //Initialisé ID
       this.id = assignId();
    }

   //Getters and Setters
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}

	public String getNomComplet(){
		return this.nomcomplet;
	}
	public void setNomComplet(String nomComplet){
		this.nomcomplet = nomComplet;
	}

	public LocalDate getDateNaiss(){
		return this.dateNaiss;
	}
	public void setDateNaiss(String dateNaiss){
		this.dateNaiss = LocalDate.parse(dateNaiss);
	}

	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age = age;
	}


   //redefinition de la methode affiche()

    @Override
    public String affiche(){
       return "Id: "+id+" Nom et Prenom : "+nomComplet+" Date de naissance: "+ this.dateNaissance.toString();
    }

   private int calculAge(){
      LocalDate currentDate = LocalDate.now();
      return Period.between(dateNaiss, currentDate).getYears();
   }

   Personne.count = 0;
   private static int assignId(){
       Personne.count++;
       return Main.count;
   }

}