/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bliblinterface;

import bibli.IBibliotheque;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author clement
 */
public class Fenetre extends JFrame{
    
    private JFrame fenetreSaisie ;
    
    public Fenetre(IBibliotheque bibli){
        super("Le titre");
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Container container = getContentPane();
        
        container.setLayout(new BorderLayout()); 
        
        TableModelBibliotheque tm = new TableModelBibliotheque(bibli);
        JTable tableau = new JTable(tm );
               
        container.add(new JScrollPane(tableau), BorderLayout.CENTER   );
        
        
        
        
        Container buttonContainer = new Container();
        buttonContainer.setLayout(new GridLayout(1,2));
        
        BoutonObserver monBouton = new BoutonObserver("Supprimer");      
        bibli.addObserver(monBouton);
        
        ActionListener monActionListener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = tableau.getSelectedRow();
                bibli.remove(i);
                tm.fireTableDataChanged();
            }
            
        };
        
        monBouton.addActionListener(monActionListener);
        
        buttonContainer.add(monBouton);
        
        JButton boutonAjouter = new JButton("Ajouter");
        boutonAjouter.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new FenetreSaisie(bibli, tm);
            }
        
        
        
        });
        
        buttonContainer.add(boutonAjouter);
        
        container.add(buttonContainer, BorderLayout.SOUTH);
        
        revalidate();
      
    }
    
}
