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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author clement
 */
public class FenetreSaisie extends JFrame{
    
    TableModelBibliotheque tm ;
    
    public FenetreSaisie(IBibliotheque bibli, TableModelBibliotheque tm){
        super("Saisie");
        this.tm = tm;
        setVisible(true);
        setSize(500, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        Container container = getContentPane();
        
        container.setLayout(new BorderLayout()); 
        
               
        Container formContainer = new Container();
        formContainer.setLayout(new GridLayout(4,2));
        
        formContainer.add(new JLabel("Titre"));
        JTextField titreTF = new JTextField();
        formContainer.add(titreTF);
        
        formContainer.add(new JLabel("Type"));
        
        
        String[] mediaTypes = {"CD", "Livre"};
        
        JComboBox typeCB = new JComboBox(mediaTypes);
        formContainer.add(typeCB);
        
        
        formContainer.add(new JLabel("Etagere"));
        JTextField etagereTF = new JTextField();
        formContainer.add(etagereTF);
        
        formContainer.add(new JLabel("Rangee"));
        JTextField rangeeTF = new JTextField();
        formContainer.add(rangeeTF);
        
        container.add( formContainer            
                , BorderLayout.CENTER   );
        
       
        
        JButton monBouton = new JButton("Ajouter");
        
       
        monBouton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                bibli.add(typeCB.getSelectedItem().toString(),
                    etagereTF.getText().charAt(0),
                    Integer.parseInt(rangeeTF.getText()),
                    titreTF.getText(), 0
                );
                tm.fireTableDataChanged();
                dispose();
            }
        
        });
        
        
        container.add(monBouton, BorderLayout.SOUTH);
        
        revalidate();
      
    }
    
}
