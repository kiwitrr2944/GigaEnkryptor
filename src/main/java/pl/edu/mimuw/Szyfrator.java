package pl.edu.mimuw;

import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Szyfrator {
    public static HashMap<Character, String> morse;
    public static HashMap<String, Character> esrom;
    Szyfrator () {
        morse = new HashMap<Character, String>();
        esrom = new HashMap<String, Character>()
        morse.put('a', ".-");
        morse.put('b', "-...");
        morse.put('c',  "-.-");
        morse.put('d',  "-..");
        morse.put('e',    ".");
        morse.put('f', "..-.");
        morse.put('g',  "--.");
        morse.put('h', "....");
        morse.put('i',   "..");
        morse.put('j', ".---");
        morse.put('k',   "-.");
        morse.put('l', ".-..");
        morse.put('m',   "--");
        morse.put('n',   "-.");
        morse.put('o',  "---");
        morse.put('p', ".--.");
        morse.put('q', "--.-");
        morse.put('r', ".-.");
        morse.put('s',  "...");
        morse.put('t',   "-");
        morse.put('u',  "..-");
        morse.put('v', "...-");
        morse.put('w',  ".--");
        morse.put('x', "-..-");
        morse.put('y', "-.--");
        morse.put('z', "--..");

        esrom.put(".-", 'a');
        esrom.put("-...", 'b');
        esrom.put("-.-.", 'c');
        esrom.put("-..", 'd');
        esrom.put(".", 'e');
        esrom.put("..-.", 'f');
        esrom.put("--.", 'g');
        esrom.put("....", 'h');
        esrom.put("..", 'i');
        esrom.put(".---", 'j');
        esrom.put("-.-", 'k');
        esrom.put(".-..", 'l');
        esrom.put("--", 'm');
        esrom.put("-.", 'n');
        esrom.put("---", 'o');
        esrom.put(".--.", 'p');
        esrom.put("--.-", 'q');
        esrom.put(".-.", 'r');
        esrom.put("...", 's');
        esrom.put("-", 't');
        esrom.put("..-", 'u');
        esrom.put("...-", 'v');
        esrom.put(".--", 'w');
        esrom.put("-..-", 'x');
        esrom.put("-.--", 'y');
        esrom.put("--..", 'z');
    }
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
    static public String szyfróiMors(String napis) {
        String wynik = new String();
        for (int i=0; i<napis.length(); ++i) {
            wynik.concat((morse.get(napis.charAt(i))+" "));
        }
        return wynik;
    }
    static public String deSzyfróiMors(String napis) {
        Scanner scanner = new Scanner(napis);
        String wynik = new String();
        while (scanner.hasNext()) {
            String morsekod = scanner.next();
            wynik += esrom.get(morsekod);
        }
        return wynik;
    }

}
