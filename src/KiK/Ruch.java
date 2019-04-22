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
public class Ruch {
    int nr, x, y;
    Gracz gracz;

    public Ruch(int nr, int x, int y, Gracz gracz) {
        this.nr = nr;
        this.x = x;
        this.y = y;
        this.gracz = gracz;
    }
    
    int getNr() {
        return nr;
    }
    
    Gracz getGracz() {
        return gracz;
    }
    
    int getX() {
        return x;
    }
    
    int getY() {
        return y;
    }
}
