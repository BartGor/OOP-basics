package pl.sii.homework2;

public class CarShop {
    public static void main(String[] args) {
        Car car1 = new Car("Audi","A5",2010,55000);
        Car car2 = new Car("BMW","123M", 2008, 32000);

        car1.carInfo();
        car2.carInfo();
    }
}
