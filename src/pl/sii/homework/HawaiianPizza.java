package pl.sii.homework;

public class HawaiianPizza extends Pizza {
    public HawaiianPizza(int size) {

        this.size = size;
    }

    public void doCake() {
        System.out.println("Ciasto hawajskie");
    }

    public void addSauce() {
        System.out.println("Sos TysiącaWysp");
    }

    public void addAdditionals() {
        System.out.println("Ananas, Pomidory, Szynka");
    }

    public void bake() {
        if (size < 50) {
            System.out.println("pieczemy 15 min w 200C");
        } else {
            System.out.println("pieczemy 20 min w 230");
        }
    }
}
