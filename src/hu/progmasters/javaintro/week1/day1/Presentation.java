package hu.progmasters.javaintro.week1.day1;

import java.util.Scanner;

public class Presentation {
    // psvm alias :
    public static void main(String[] args) {
        // sout alias:
        System.out.println("hello world");
        // inputhoz létre kell hozzak
        // egy Scanner objektumot, amiben definiálom a
        // scan változót
        // ha nem enterezem le az auto kitöltést a Scannernél,
        // akkor rákattintok arra amit nem importált be és
        // ALT + ENTER-rel beimportálja ami kell class hozzá.
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name?");
        String userName = scan.nextLine();
        System.out.println("your name is: " + userName);
    }
    /*
    TÖBBSOROS KOMMENT
     */
}
