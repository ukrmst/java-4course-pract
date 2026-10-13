package edu.uu.project.pract3;

public class Main {
    public static void main(String[] args) {
        //CoffeeDrink coffeeDrink = new CoffeeDrink("Latte", 450,85.75, 80);
        //System.out.println(coffeeDrink.getDescription());

//        Latte latte = new Latte("Latte", 450, 85.75, 80, 400);
//        System.out.println(latte.getDescription());
//
//        Cappuccino cappuccino = new Cappuccino("Cappuccino", 400, 90, 90, "1/4");
//        System.out.println(cappuccino.getDescription());
//
//        Americano americano = new Americano("Americano", 300, 50, 95, 200);
//        System.out.println(americano.getDescription());

        CoffeeDrink[] drinks = {
                new Latte("Latte", 450, 85.75, 80, 400),
                new Cappuccino("Cappuccino", 400, 90, 90, "1/4"),
                new Americano("Americano", 300, 50, 95, 200)
        };
        for (CoffeeDrink drink : drinks) {
            System.out.println(drink.getDescription());
            System.out.println("----------------------");
        }
    }
}
