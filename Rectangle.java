import java.lang.Math;
public class Rectangle extends Figure{

//@Override => methode Redefinie
   
  //Constructeur par défaut
   //Surcharge
    //Deux methodes sont surchargées lorsqu'elles:
     //1-Ont le meme nom et le meme type retour
    //Mais elles doivent pas avoir le meme nombre Arguments
     //Ou si elles le meme nombre Arguments alors les arguments
    //ne doivent pas etre du meme type
   public Rectangle (){
   }

   //Surchage
    public Rectangle (double longueur,double largeur){
       this.longueur=longueur;
       this.largeur=largeur
   }


   @Override
   public double demiPerimetre() {
      return this.longueur + this.largeur;
   }   
   public double Perimetre() {
      return this.longueur+this.largeur;
   }   

  @Override
   public double surface() {
     return this.longueur*this.largeur;
} 

  

}