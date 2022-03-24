package com.example.dependencyinjection;

public class SpellCheckerDependencyInjection {
    private Dictionary dictionary;

    public SpellCheckerDependencyInjection(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public boolean isValid(){
       return true;
    }
}
