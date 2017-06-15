/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bliblinterface;

import bibli.*;

/**
 *
 * @author clement
 */
public class Main {
    public static void main(String[] args) {
        
        IBibliotheque bibli = new Bibliotheque();
        
        

        Media livre1 = new Livre("Design Patterns");
        Media livre2 = new Livre('B', 9, "Zaratoustra");
        Media livre3 = new Livre("Apprendre à lire pour les nuls");
  
        bibli.add(livre1);
        bibli.add(livre2);
        bibli.add(livre3);
               
        
        Fenetre fenetre = new Fenetre(bibli);
        
        
    
    }
}
