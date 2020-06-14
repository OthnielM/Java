import java.time.LocalDate;
public class Main{
	public static void main(String[] args){
		Etudiant etu = new Etudiant();
		etu.setDateNaissance("2001-12-15");
		System.out.println(etu.getDateNaissance());
		System.out.println(LocalDate.now());
		System.out.println(etu.getDateNaissance().getYear());
		System.out.println(LocalDate.now().getYear());
		System.out.println(etu.getAge());


		LocalDate currentDate = LocalDate.now();
		int currentYear = currentDate.getYear();
		int birthYear = etu.getDateNaissance().getYear();
		int age = currentYear - birthYear;
		System.out.print(age);



		Etudiant e = new Etudiant("Alberic", LocalDate.parse("2001-12-15"), "Papa", 2019);
		//e.setDateNaissance("1999-12-15");
		System.out.println(e.getDateNaissance());
		System.out.println(e.getAge());
	}
}