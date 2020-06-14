import java.lang.Math;
public class Carre extends Figure{
	public Carre(){
		
	}
	public Carre(double longueur){
		this.longueur = longueur;
	}

	public double getLongueur(){
		return this.longueur;
	}

	public void setLongueur(double longueur){
		this.longueur = longueur;
	}
	
	@Override
	public double demiPerimetre(){
		return this.longueur * 2;
	}

	@Override
	public double surface(){
		return this.longueur * this.longueur;
	}

	@Override
	public double diagonale(){
		return Math.sqrt(Math.pow(this.longueur, 2.0) + Math.pow(this.longueur, 2.0));
	}

}