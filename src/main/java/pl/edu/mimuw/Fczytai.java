package pl.edu.mimuw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Fczytai {
    //tu cos sie dzieje
    public ArrayList<String> fczytai(String nazwaPliku)  {
        ArrayList<String> wynik = new ArrayList<>();
        //wczytuje dane i oddaje je w postaci tablicy stringow
        try {
            Scanner skaner = new Scanner(new File(nazwaPliku));
            while (skaner.hasNext()) {
                wynik.add(skaner.next());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("chyba nei znalazl pliku");
            e.printStackTrace();
        }
        return wynik;
    }

    public void fpisz(ArrayList<String> zwracanaLista, String nazwaPliku) {
        //wpisuje do podanego pliku zmieniamy cos
        //powinien utworzyc nowy plik, a jesli juz istnial to go usunac i stworzyc nowy
        try {
            File plik = new File(nazwaPliku);
            plik.delete();
            plik.createNewFile();
            FileWriter wpisywacz = new FileWriter(plik);
            Iterator<String> it = zwracanaLista.iterator();
            while (it.hasNext()) {
                wpisywacz.write(it.next() + " ");
            }
            wpisywacz.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("chyba nei znalazl pliku");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("eeee cos nie dziala");
            e.printStackTrace();
        }
    }
}
