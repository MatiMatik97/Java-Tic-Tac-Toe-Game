/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KiK;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author student
 */
public class Komentator implements Drukowalny {

    @Override
    public void drukuj(ArrayList<Ruch> ruchy, char[][] plansza) {
        Iterator it = ruchy.iterator();
        
        Ruch ruch = null;
        
        while(it.hasNext()) {
            ruch = (Ruch) it.next();
        }
        
        System.out.print("Gracz "+ruch.getGracz().getImie()+" postawil znak '"+ruch.getGracz().getZnak());
        System.out.println("' na polu "+ruch.getX()+","+ruch.getY()+"\n");
    }
    
}
