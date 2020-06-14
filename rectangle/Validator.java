package rectangle;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Albéric
 */
public class Validator {

    /**
     * classe Validator permet de verifier la validité de nos entrées.
     * Attribut dictionnaire contenant les erreurs générées
     * errors
     */
        
    private HashMap<String, String> errors = new HashMap<String, String>();
    
    
    public HashMap getErors(){
        return this.errors;
    }
    
    
    public boolean isValid(){
        return errors.isEmpty();
    }
    
        public void is_empty(int nombre, String key, String sms = null){
        if(nombre == 0){
            if(sms == null){
                sms = "Le nombre est obligatoire";
            }
        }
        this.errors.put(key, sms);
    }
    
         public static boolean isInteger(String s) {
            boolean isValid = true;
            try{ Integer.parseInt(s); }
            catch(NumberFormatException nfe){ isValid = false; }
            return isValid;
   }
    
    // Longueur et Largueur doivent etre numeric(entier,reel)
    public  void isNumber(String nombre, String key, String sms = null){
        if(this.isValid()){
            if(!isInteger(nombre)){
                sms = "Veuiller saisir un nombre";
                this.errors.put(key, sms);
            }
        }
    }
    
    public void isPositif(String nombre, String key, String sms = null){
        this.isNumber(nombre, key, sms);
        int nombreInt = Integer.parseInt(nombre);
        if(this.isValid()){
            if(nombreInt <= 0){
                sms = "Veuiller saisir un nombre positif";
                this.errors.put(key, sms);
            }
        }
    }
    
    public void compare(String nbre1, String nbre2, String key1, String key2, String errorMessage = null){
        this.isPositif(nbre1, key1, errorMessage);
        this.isPositif(nbre2, key2, errorMessage);
        if(this.isValid()){
            int iNbre1 = Integer.parseInt(nbre1);
            int iNbre2 =  Integer.parseInt(nbre2);
            int result = Integer.compare(iNbre1, iNbre2);
            if(result <= 0){
                errorMessage = "La longueur doit etre superieure a la largeur";
                this.errors.put("all", errorMessage);
            }
        }
    }

}
