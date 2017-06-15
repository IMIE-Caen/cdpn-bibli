/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblidb;

import bibli.Bibliotheque;
import bibli.CD;
import bibli.Livre;
import bibli.Media;
import bliblinterface.Fenetre;

/**
 *
 * @author clement
 */
public class Main {
    public static void main(String[] args) throws Exception {
        
        BibliDB bibli = new BibliDB(new Bibliotheque());
        
        //bibli.load();
        
        Fenetre fenetre = new Fenetre(bibli);

        
        
    
    }
}
