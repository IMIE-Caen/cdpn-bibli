/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblidb;

import bibli.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Observer;

/**
 *
 * @author clement
 */
public class BibliDB implements IBibliotheque{
    // Pseudo-decorator !
    
    private Bibliotheque bibli ;
    private Connection conn = null;
    
    public BibliDB(Bibliotheque bibli) throws Exception{
        this.bibli = bibli;
        //try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn =
               DriverManager.getConnection("jdbc:mysql://localhost/bibli?" +
                                           "user=root&password=root");
           

        //} catch (Exception ex) {
            // handle any errors
          //  System.out.println("Exception: " + ex.getMessage());
        //}
        
    }
    @Override
    public boolean add( Media element) {
        return bibli.add(element);
    }
    @Override
    public void remove(int index) {
        bibli.remove(index);
    }
    public int size(){
        return bibli.size();
    }
    @Override
    public Media get(int index) {
        return bibli.get(index);
    }
    public void add(String type, char nEtagere, int nRangee, String titre, int id){
        bibli.add(type, nEtagere, nRangee, titre, 0);
    }
    
    public String toString(){
        return "BibliDB !\n"+bibli.toString();
    }

    @Override
    public void addObserver(Observer o) {
        bibli.addObserver(o);
    }
    
    
    
}
