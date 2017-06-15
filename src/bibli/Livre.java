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
public class Livre extends Media{
    int nbPages;

    public Livre(String titre) {
        super(titre);
    }

    public Livre(char nEtagere, int nRangee, String titre) {
        super(nEtagere, nRangee, titre);
    }
    
}
