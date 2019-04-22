/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KiK;

/**
 *
 * @author student
 */
public class Gracz {
    String imie;
    char znak;

    public Gracz(String imie, char znak) {
        this.imie = imie;
        this.znak = znak;
    }
    
    String getImie() {
        return imie;
    }
    
    char getZnak() {
        return znak;
    }
}
