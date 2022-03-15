package Test;

import domain.Humster;
public class TestAnimal {

    public static void main(String[] args) {
        Humster humster = new Humster ("Rocky");
        System.out.println(humster);
        humster.eat();
        humster.WC();
        humster.Gnaw();
        humster.speak();
    }
    
}
