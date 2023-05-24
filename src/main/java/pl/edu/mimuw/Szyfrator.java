package pl.edu.mimuw;

import java.util.HashMap;

public class Szyfrator {
    public HashMap <Character, String>
    static public String szyfróiCezar(String napis, int pszesuniencie) {
        String wynik = new String();
        for (int i=0; i<napis.length(); ++i) {
            int kod = (int) napis.charAt(i);
            int baza = 65;
            if (kod >= 97) {
                baza = 97;
            }
            kod -= baza;
            kod += pszesuniencie;
            kod = (kod+26)%26;
            kod += baza;
            char x = (char) kod;
            wynik += x;
        }
        return wynik;
    }
    static public String deSzyfróiCezar(String napis, int pszesuniencie) {
        return szyfróiCezar(napis, -pszesuniencie);
    }
    static public String szyfróiMors() {

    }
    static public String deSzyfróiMors() { return null; }

}
