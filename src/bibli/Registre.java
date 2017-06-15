/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibli;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author clement
 *//**
 *
 * @author clement
 */
public class Registre extends HashMap implements Observer{
    Bibliotheque source; 
    
    public Registre(/*List<Media>*/ Bibliotheque source){
        this.source = source;
        source.addObserver(this);
        
    }
    

    @Override
    public void update(Observable o, Object arg) {
        //clear();
        for(Media m : source.maListe){
            put(m.getTitre(), m);
        }
        
        
    }
    
}
