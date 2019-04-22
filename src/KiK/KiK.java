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
public class KiK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gra gra = new Gra(new Gracz("Jan", 'X'), new Gracz("Darek", 'O'));
        gra.main();
    }
    
}
