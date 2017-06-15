/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bliblinterface;

import bibli.IBibliotheque;
import bibli.Media;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author clement
 */

public class TableModelBibliotheque extends AbstractTableModel{

    public static final String[] entetes = {"Titre", "Type", "Étage", "Rangée"};
    private IBibliotheque bibliotheque;    
    
    public String getColumnName(int columnIndex){
        return entetes[columnIndex];
    }
    
    public TableModelBibliotheque(IBibliotheque bibliotheque){
        this.bibliotheque = bibliotheque;
        
    }
    
    
    @Override
    public int getRowCount() {
        return bibliotheque.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Media m = bibliotheque.get(rowIndex);
        
        String titre = m.getTitre();
        Object etagere = m.getnEtagere();
        Object rangee = m.getnRangee();
        String type =  m.getClass().getSimpleName();
        
        switch(columnIndex){
            case 0:
                return titre;
            case 1:
                return type;
            case 2:
                return etagere;
            case 3:
                return rangee;
            default:
                return "N/C";
        }
        
        
        
    }
   
}
