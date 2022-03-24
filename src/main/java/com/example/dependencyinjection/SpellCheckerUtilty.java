package com.example.dependencyinjection;

public class SpellCheckerUtilty {

    public static Dictionary turkish = new Dictionary("Turkish");

    private SpellCheckerUtilty() {
    }

    public static void isValid(String word){
        //burada yukarıda hangi dil tanımlıysa sadece onu kullanabiliriz.
    }
}
