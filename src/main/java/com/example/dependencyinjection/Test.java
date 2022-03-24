package com.example.dependencyinjection;

public class Test {

    public static void main(String[] args) {

        SpellCheckerUtilty.isValid("heyecan");

        SpellCheckerSingleton.instance.isValid("heyecan");

        SpellCheckerDependencyInjection spellCheckerDependencyInjection = new SpellCheckerDependencyInjection(new Dictionary("Türkçe"));
        spellCheckerDependencyInjection.isValid();
    }
}
