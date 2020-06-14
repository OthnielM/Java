import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
public abstract class Personne implements IInscription{
	protected int id;
	protected String nomComplet;
	protected LocalDate dateNaissance;
	protected int age;
	private int count;
	// Constructeurs
	public Personne(){
		// Initialiser Id
		this.id = assignId();
	}
	public Personne(String nomComplet, String dateNaissance){
		this.nomComplet = nomComplet;
		this.dateNaissance = LocalDate.parse(dateNaissance);
		// Initialiser Id
		this.age = calculAge();
		 this.id = assignId();
	}
	// Getters et Setters
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}

	public String getNomComplet(){
		return this.nomComplet;
	}
	public void setNomComplet(String nomComplet){
		this.nomComplet = nomComplet;
	}

	public LocalDate getDateNaissance(){
		return this.dateNaissance;
	}
	public void setDateNaissance(String dateNaissance){
		this.dateNaissance = LocalDate.parse(dateNaissance);
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
		return "Id: "+id.toString()+" Nom et Prenom : "+nomComplet+" Date de naissance:"+ this.dateNaissance.toString();
	}

	private int calculAge(){
		LocalDate currentDate = LocalDate.now();
		int currentYear = currentDate.getYear();
		int birthYear = this.dateNaissance.getYear();
		int age = currentYear - birthYear;
		return age;
	}

	count = 0;
	private int assignId(){
		count++;
		return count;
	}
}