package hu.progmasters.javaintro.week1.day2;

import java.util.Locale;

public class Presentation_2022_07_26 {
    // PRIMITÍVEK - 8 db van belőle

// egész számok
    // a RANGE mehet mínuszba is -127-tól +127-ig
    // byte-ot csak akkor használunk, ha tudom, hogy
    // nagyon kicsi szám lesz; 0 vagy 1 pl.
    byte myByte = 1;

    // 16 biten tárolódik
    // -32768-tól +32767-ig tart a range-e
    short myShort = 10;

    // 32 biten tárolódik
    // milliárdos range -2milliárttól +2milliárd
    int myInt = 100;

    // 64 biten tárolódik
    long myLong = 1000;

// lebegőpontos számok
    // floatnál kell egy f betű a végére, különben
    // double értékként érzékeli
    // float 32biten tárolódik
    // range 7 decimális értékig tud felmenni
    float myFloat = 1.1f;

    // nem float, mert nincs a végén f betű
    double myDouble = 1.1;

// karakter
    // nem idézőjelek közé tesszük, csak aposztróf közé
    char myChar = 'a';

    // igaz vagy hamis
    // 1 biten tárolódik
    boolean myBoolean = true;

    public static void main(String[] args) {

        // OPERÁTOROK

        int x = 10;
        int y = 3;

    // aritmetikai
        // +,-,/,*
        // % modulo osztás, maradékos osztás
        // ++ increment
        // -- decrement

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        System.out.println(x % y);
        // x++ - először kiírja az x értékét és utána növeli
        // ++x - megnöveli az értéket egyel és utána kiírja
        System.out.println(x++);
        // x-- - először kiírja az x értékét és utána csökkenti
        // --x - csökkenti az értéket egyetl és utána kiírja
        System.out.println(x--);
        System.out.println("-----------------");

    // assignment - összevonunk több aritmetikait
        int numberTwo = 42;
        System.out.println(numberTwo += 8);
        System.out.println(numberTwo -= 8);
        System.out.println(numberTwo *= 8);
        System.out.println(numberTwo /= 8);
        System.out.println(numberTwo %= 8);
        System.out.println("----------------------------");

        // osztásnál int-et ad vissza, hiába float/double jönne ki
        // de ha a két szám közül valamelyik double akkor már double
        // lesz az eredmény type-ja.
        double asd1 = 10;
        int asd2 = 3;
        System.out.println(asd1 / asd2);
        // típusos a nyelv, itt kijön, mert integert várunk
        // eredményként, de double jön ki, MEGADJUK ELŐRE A TYPE-ot!
        // int result = asd1 / asd2; ez hibára fut emiatt!
        System.out.println("-----------------");

    // Comparison == , > , < , >= , <= , !=
        // boolean
        boolean isSmaller = x < y;
        System.out.println(isSmaller);
        boolean isHigher = x > y;
        System.out.println(isHigher);
        boolean areEqual = x == y;
        System.out.println(areEqual);
        boolean notEqual = x != y;
        System.out.println(notEqual);
        System.out.println("-----------------");

    // logikai &&(és) , ||(vagy) , !(negálás)
        if (x % 2 == 0 && y % 2 != 0) {
            System.out.println("code to run");
        }
        if (x % 2 == 0 || y % 2 != 0) {
            System.out.println("code to run");
        }
        if (!(x % 2 == 0 || y % 2 != 0)) {
            System.out.println("code to run");
        }
        System.out.println("-------------");
    // string - karakterlánc
    // EZ MÁR ÖSSZETETT ADATTÍPUS, NEM PRIMITÍV
    String greeting = "Hello PROGMasters";
    int myStringlength = greeting.length();
        System.out.println(myStringlength);
        // substring : attól az indextől kiírja a szöveget
        // megadhatom a végét is, ameddig ki kell írnia
        System.out.println(greeting.substring(6));
        System.out.println(greeting.substring(6,11));
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting);

        // átcastolom az int-et stringgé
        int szam01 = 20;
        String szam01STR = String.valueOf(szam01);
        System.out.println(szam01STR);
        System.out.println(greeting + " " + szam01STR);
        System.out.println(szam01 + szam01 + greeting);
        System.out.println(greeting + szam01 + szam01);
        System.out.println((szam01 + szam01) + greeting);
        // concatenate - szövegek összefűzése
        // javában leszarja, hogy az egyik integer, hozzáadja str-ként

        System.out.println(greeting.indexOf("H"));
        System.out.println(greeting.indexOf("l"));
        System.out.println(greeting.lastIndexOf("l"));
        // ha olyat kérek ki, ami nincs benne, -1 gyel tér vissza
        System.out.println(greeting.indexOf("x"));
        // case-sensitive, nem mindegy hogy upper v lowercase
        System.out.println(greeting.indexOf("h"));

        String szoveg01 = "Hello ";
        String szoveg02 = "PROGMasters";
        String myResultSzoveg = szoveg01 + szoveg02;
        System.out.println(greeting.equals(myResultSzoveg));
        // equals methoddal true lesz, mert az értéke megegyezik
        // == logikai operátorral false lesz, mert nem pontosan
        // ugyanaz, nem ugyanarra a memóriarészre utal, ahol a
        // két string van.
        System.out.println(greeting == myResultSzoveg);
        // PRIMITÍVEKNÉL == használunk
        // NEM PRIMITÍVEKNÉL .equals-t használunk
        System.out.println("----------------");


    }
}
