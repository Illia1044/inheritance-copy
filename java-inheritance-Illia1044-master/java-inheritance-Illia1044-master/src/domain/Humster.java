package domain;

public class Humster extends Rodent {

    private String poroda;

    public Humster(String name, int weight, String poroda) {
        this.name=name;
        this.weight=weight;
        this.poroda=poroda;
    }

    public  Humster() {
        this("Aboba",1,"just humster");
    }

    public Humster(String name) {
        this(name,1,"just humster");
    }
    
    public void Gnaw(){
       System.out.println("humster is gnawing your furniture");
    }

    @Override
    public String toString() {
        return super.toString()+"\nPoroda:\t"+this.poroda+"\n\nThis is a humster!"; 
    }

    @Override
    public void speak() {
       System.out.println("pe pe pe pe");
    }

    @Override
    public void eat() {
        System.out.println("humster eats seeds");
    }
    
}
