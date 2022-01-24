package dependencyinjection;

public class SpellChecker {
    private Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public boolean isValid(){
       return true;
    }
}
