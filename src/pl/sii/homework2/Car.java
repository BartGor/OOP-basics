package pl.sii.homework2;

public class Car {
    private String manufacture;
    private String model;
    private int year;
    private int price;

    public Car(String manufacture, String model, int year, int price) {
        this.manufacture = manufacture;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public void carInfo(){
        System.out.println(manufacture +"\n "+model+"\n "+ year +"\n "+ price);
    }
}
