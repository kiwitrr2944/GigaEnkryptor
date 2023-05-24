package pl.edu.mimuw;

public class Main {
    //args[0] - plik; args[1] - jaki jest wejsciowy {0, 1, 2}; args[2] jaki jest wyjsciowy;
    // args[3] - nazwa wyjsciowego
    public static void main(String[] args) {
        int pszesóniencie = 69;
        var myFczytai = new Fczytai();
        var mySzyfrator = new Szyfrator();
        var sluwka = myFczytai.fczytai(args[0]);
        if(args[1].equals("1")) {
            for(int i=0; i<sluwka.size(); i++) {
                var wyras = sluwka.get(i);
                sluwka.set(i, Szyfrator.deSzyfróiCezar(wyras, pszesóniencie));
            }
        }
        if(args[1].equals("2")) {
            for(int i=0; i<sluwka.size(); i++) {
                var wyras = sluwka.get(i);
                sluwka.set(i, Szyfrator.deSzyfróiMors(wyras));
            }
        }
        //now sluwka są normalne
        if(args[2].equals("1")) {
            for (int i = 0; i < sluwka.size(); i++) {
                var wyras = sluwka.get(i);
                sluwka.set(i, Szyfrator.szyfróiCezar(wyras, pszesóniencie));
            }
        }
        if(args[2].equals("2")) {
            for(int i=0; i<sluwka.size(); i++) {
                var wyras = sluwka.get(i);
                sluwka.set(i, Szyfrator.szyfróiMors(wyras));
                //System.out.println(Szyfrator.szyfróiMors(wyras));
            }
        }
        myFczytai.fpisz(sluwka, args[3]);
    }
}
