package pl.sii.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pizza margharita = new MargharitaPizza(50);

        Pizza hawaiian = new HawaiianPizza(30);

        Pizza funghi = new FunghiPizza(58);

     /*   List<Pizza> pizzaList = new ArrayList<>();
        pizzaList.add(margharita);
        pizzaList.add(hawaiian);
        pizzaList.add(funghi);
        pizzaList.size();

        for (Pizza pizza : pizzaList) {
            pizza.prepare();
        }*/

        margharita.prepare();
        System.out.println();
        hawaiian.prepare();
        System.out.println();
        funghi.prepare();
    }
}
