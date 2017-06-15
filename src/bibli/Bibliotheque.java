/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibli;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author clement
 */
public class Bibliotheque extends Observable implements IBibliotheque{
    
    
    public ArrayList<Media> maListe = new ArrayList();
    
    
    public boolean add( Media element) {
        
        boolean b = maListe.add(element);
        this.setChanged();
        this.notifyObservers();
        return b;
    }
    
    public void add(String type, char nEtagere, int nRangee, String titre, int id){
        Media m = null ;
        if(type.equals("CD"))
            m = Media.cd(nEtagere, nRangee, titre);
        else if(type.equals("Livre"))
            m = Media.livre(nEtagere, nRangee, titre);
        this.add(m); 
    }
    
    
    
    @Override
    public String toString() {
        String str = "";
        for(Media mkjgdgzsghd : maListe){
            str += mkjgdgzsghd + "\n";
        }

        return "Je suis une bibliotheque\n-----Je contiens: -----\n" + str;
    }       

    @Override
    public void remove(int index) {
        maListe.remove(index);
        this.setChanged();
        this.notifyObservers();
    }
    
    public Media get(int index){
        return maListe.get(index);
    }
    public int size(){
        return maListe.size();
    }
}
