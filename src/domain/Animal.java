package domain;

public class Animal {

    protected String name;

    protected int weight;

    public Animal() {
        name="classic mouse";
        weight=1;
    }

    public void eat() {
        System.out.println("Animal eating....");
    }

    public void speak() {
        System.out.println("Animal speaking...");
    }

    public void WC() {
        System.out.println("Animal is in toilet....");
    }

    @Override
    public String toString() {
        return "Animal: " + "\nname= " + name + "\nweight= " + weight;
    }


}
