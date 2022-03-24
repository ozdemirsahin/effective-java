package com.example.dependencyinjection;

public class SpellCheckerSingleton {
    public static Dictionary turkish = new Dictionary("Turkish");
    public static SpellCheckerSingleton instance=new SpellCheckerSingleton();

    private SpellCheckerSingleton() {
    }

    public void isValid(String word){
        //burada yukarıda hangi dil tanımlıysa sadece onu kullanabiliriz.
    }
}
