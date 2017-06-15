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
public class CD extends Media{
    int nbPistes ;

    public CD(String titre) {
        super(titre);
    }
    

   /*
@Override
    public String toString() {
        return "CD : " + super.toString();
    }
    */

    public CD(char nEtagere, int nRangee, String titre) {
        super(nEtagere, nRangee, titre);
    }
    
    
}
