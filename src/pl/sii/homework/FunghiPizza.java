package pl.sii.homework;

public class FunghiPizza extends Pizza {
    public FunghiPizza(int size) {
        this.size = size;
    }

    @Override
    public void doCake() {
        System.out.println("Gdube ciasto");
    }

    @Override
    public void addSauce() {
        System.out.println("Grzybowy");
    }

    @Override
    public void addAdditionals() {
        System.out.println("Pieczarki i Kiełbasa");
    }

    @Override
    public void bake() {
        if (size < 50) {
            System.out.println("pieczemy 15 min w 200C");
        } else {
            System.out.println("pieczemy 5 min w 330");
        }
    }
}
