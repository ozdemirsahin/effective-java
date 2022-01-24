package dependencyinjection;

public class Test {

    public static void main(String[] args) {
       SpellChecker spellChecker= new SpellChecker(new Dictionary("Türkçe"));
       spellChecker.isValid();
    }
}
