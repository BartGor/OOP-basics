package pl.sii.homework;

public class MargharitaPizza extends Pizza{
    public MargharitaPizza(int size) {
        this.size = size;
    }

    public void doCake() {
        System.out.println("Ciasto cienkie do margherity");
    }

    public void addSauce() {
        System.out.println("Sos pomidorowy");
    }

    public void addAdditionals() {
        System.out.println("Mozzarella, Bazylia i Pomidory");
    }

    public void bake() {
        if (size < 50) {
            System.out.println("pieczemy 15 min w 200C");
        } else {
            System.out.println("pieczemy 20 min w 230");
        }
    }
}
