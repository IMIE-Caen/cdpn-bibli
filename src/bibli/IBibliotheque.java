/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibli;

import java.util.Observer;

/**
 *
 * @author clement
 */
public interface IBibliotheque{
    public void addObserver(Observer o); // feinte impl observable
    public boolean add( Media element) ;
    public void add(String type, char nEtagere, int nRangee, String titre, int id);
    public void remove(int index);
    public Media get(int index);
    public int size();
}
