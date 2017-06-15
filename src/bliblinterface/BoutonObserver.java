/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bliblinterface;

import bibli.IBibliotheque;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;

/**
 *
 * @author clement
 */
public class BoutonObserver extends JButton implements Observer{
    public BoutonObserver(String s){
        super(s);
        update(null, null);
        
    }
    @Override
    public void update(Observable o, Object arg) {
        
        setEnabled(o != null && ((IBibliotheque)o).size() > 0);
        
    }
    
}
