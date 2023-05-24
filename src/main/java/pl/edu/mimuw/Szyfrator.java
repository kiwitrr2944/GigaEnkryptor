package pl.edu.mimuw;

public class Szyfrator {
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
            kod %= 26;
            kod += baza;
            char x = (char) kod;
            wynik += x;
        }
        return wynik;
    }
    static public String deSzyfróiCezar() { return null; }
    static public String szyfróiMors() { return null; }
    static public String deSzyfróiMors() { return null; }

}
