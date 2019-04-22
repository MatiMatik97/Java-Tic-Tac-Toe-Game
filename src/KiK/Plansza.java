/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KiK;

import java.util.ArrayList;

/**
 *
 * @author student
 */
public class Plansza implements Drukowalny {

    @Override
    public void drukuj(ArrayList<Ruch> ruchy, char[][] plansza) {
        System.out.println("Plansza: ");
        
        for(int i = 0; i < 3; i++) {
            System.out.println(plansza[i][0]+"|"+plansza[i][1]+"|"+plansza[i][2]);
            if(i < 2) {
                System.out.print("-----");
                System.out.println();
            }
        }
        
        System.out.println();
    }
    
}
