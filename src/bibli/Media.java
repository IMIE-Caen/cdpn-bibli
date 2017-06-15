/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibli;

/**
 *
 * @author clement
 */
public abstract class Media {
    private Character nEtagere = null ;
    private Integer nRangee = null;
    private String titre; 

    public Media(String titre) {
       
        this.titre = titre;
    }

    public Media(char nEtagere, int nRangee, String titre) {
        this(titre);
        this.nEtagere = nEtagere;
        this.nRangee = nRangee;
        
    }
    
    public static Media cd(char nEtagere, int nRangee, String titre){
        return new CD(nEtagere,nRangee, titre);
    }
    
    public static Media livre(char nEtagere, int nRangee, String titre){
        return new Livre(nEtagere,nRangee, titre);
    }
    
    public void deplacer(char newNEtagere, int newNRange){
        setnEtagere(newNEtagere);
        setnRangee(newNRange);
    }
   
    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Character getnEtagere() {
        return nEtagere;
    }

    public void setnEtagere(char nEtagere) {
        this.nEtagere = nEtagere;
    }

    public Integer getnRangee() {
        return nRangee;
    }

    public void setnRangee(int nRangee) {
        this.nRangee = nRangee;
    }


    public String getEmplacement(){
        if(getnEtagere() != null && getnRangee() != null)
            return getnEtagere().toString() + getnRangee().toString();
        
        return "Emplacement inconnu";
    }

    @Override
    public String toString() {
        String type;
        /*if(this instanceof CD)
            type = "CD: ";
        else if(this instanceof Livre)
           type = "Livre: ";
        else 
            type = "N.C. : ";
        */
        
        type = this.getClass().getSimpleName();
        
        
        
        
        return  type + ": " + titre + " ("+ getEmplacement() +  ")";
    }
    
    
}
