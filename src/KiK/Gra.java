/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KiK;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Gra {
    Gracz gracz1, gracz2;
    ArrayList<Ruch> ruchy;
    char plansza[][];

    public Gra(Gracz gracz1, Gracz gracz2) {
        this.gracz1 = gracz1;
        this.gracz2 = gracz2;
        ruchy = new ArrayList<>();
        plansza = new char[3][3];
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                plansza[i][j] = '-';
            }
        }
    }
    
    public void main() {
        Plansza p = new Plansza();
        Komentator k = new Komentator();
        Scanner sc;
        int x, y;
        char zn_wygr = '-';
        boolean remis = false;
        
        for(int i = 1; i <= 9; i++) {
            if(i % 2 == 0) {
                System.out.println("Ruch gracza "+gracz2.getImie()+" znak '"+gracz2.getZnak()+"':");
            } else {
                System.out.println("Ruch gracza "+gracz1.getImie()+" znak '"+gracz1.getZnak()+"':");
            }
            
            sc = new Scanner(System.in);
            System.out.print("Podaj wsp x: ");
            x = Integer.parseInt(sc.nextLine());
                
            sc = new Scanner(System.in);
            System.out.print("Podaj wsp y: ");
            y = Integer.parseInt(sc.nextLine());
            
            if((x >= 0 && x <= 2) && (y >= 0 && y <= 2)) {
                if(plansza[x][y] == '-') {
                    if(i % 2 == 0) {
                        ruchy.add(new Ruch(2, x, y, gracz2));
                        plansza[x][y] = gracz2.getZnak();
                    } else {
                        ruchy.add(new Ruch(1, x, y, gracz1));
                        plansza[x][y] = gracz1.getZnak();
                    }

                    k.drukuj(ruchy, plansza);
                    p.drukuj(ruchy, plansza);

                    zn_wygr = sprawdz(plansza);

                    if(zn_wygr == 'X') {
                        System.out.println("Koniec!!!\nWygrał gracz "+gracz1.getImie()+"!\n");
                        break;
                    } else if(zn_wygr == 'O') {
                        System.out.println("Koniec!!!\nWygrał gracz "+gracz2.getImie()+"!\n");
                        break;
                    }

                    if(i == 9) {
                        remis = true;
                    }
                } else {
                    System.out.println("Jest juz znak gracza na tym polu, wybierz inne...\n");
                    i -= 1;
                }
            } else {
                System.out.println("Wspolrzedne podane sa poza polem gry, podaj wlasciwe pole...\n");
                i -= 1;
            }
        }
        
        if(remis && zn_wygr == '-') {
            System.out.println("Koniec!!!\nRemis!\n");
        }
    }
    
    Gracz getGracz1() {
        return gracz1;
    }
    
    Gracz getGracz2() {
        return gracz2;
    }
    
    char sprawdz(char tab[][]) {
        if((tab[0][0] == tab[1][0] && tab[1][0] == tab[2][0] && tab[2][0] != '-')) {
            return tab[0][0];
        } else if((tab[0][1] == tab[1][1] && tab[1][1] == tab[2][1] && tab[2][1] != '-')) {
            return tab[0][1];
        } else if((tab[0][2] == tab[1][2] && tab[1][2] == tab[2][2] && tab[2][2] != '-')) {
            return tab[0][2];
        } else if((tab[0][0] == tab[0][1] && tab[0][1] == tab[0][2] && tab[0][2] != '-')) {
            return tab[0][0];
        } else if((tab[1][0] == tab[1][1] && tab[1][1] == tab[1][2] && tab[1][2] != '-')) {
            return tab[1][0];
        } else if((tab[2][0] == tab[2][1] && tab[2][1] == tab[2][2] && tab[2][2] != '-')) {
            return tab[2][0];
        } else if((tab[0][0] == tab[1][1] && tab[1][1] == tab[2][2] && tab[2][2] != '-')) {
            return tab[0][0];
        } else if((tab[0][2] == tab[1][1] && tab[1][1] == tab[2][0] && tab[2][0] != '-')) {
            return tab[0][2];
        }
        
        return '-';
    }
}
