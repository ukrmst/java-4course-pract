package edu.uu.project.pract3;

public class CoffeeDrink {

    private String name;
    private int volumeMl;
    private double price;
    private int temperatureC;

    public CoffeeDrink(String name, int volumeMl, double price, int temperatureC) {
        // тут має бути ваш код (у т.ч. виклик сеттерів для валідації значень)
        this.name = name;
        this.volumeMl = volumeMl;
        setPrice(price);
        setTemperatureC(temperatureC);

    }
    // тут мають бути геттери та сеттери з валідацією
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolumeMl() {
        return volumeMl;
    }

    public void setVolumeMl(int volumeMl) {
        if (volumeMl < 0) {
            System.out.println("Invalid volume. Volume may not be negative.");
        } else  {
            this.volumeMl = volumeMl;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Invalid volume. Volume may not be negative.");
        } else  {
            this.price = price;
        }
    }

    public int getTemperatureC() {
        return temperatureC;
    }

    public void setTemperatureC(int temperatureC) {
        if (temperatureC < 0 || temperatureC > 100) {
            System.out.println("Invalid volume. Temperature may not be negative or bigger than 100.");
        } else   {
            this.temperatureC = temperatureC;
        }
    }


    public String getDescription() {
        // тут має бути ваш код: поверніть рядок з описом напою
        return "Drink name: " + name +
                "\nvolume: " + volumeMl +
                "\nprice: " + price +
                "\ntemperature: " + temperatureC;
    }

}

class Latte extends CoffeeDrink {
    private int milkVolumeML;

    public Latte(String name, int volumeMl, double price, int temperatureC,  int milkVolumeML) {
        super(name, volumeMl, price, temperatureC);
        this.milkVolumeML = milkVolumeML;
    }
    @Override
    public String getDescription() {
        return super.getDescription()
                + "\nmilk volume ml: " + milkVolumeML;
    }

}

class Cappuccino extends CoffeeDrink {
    private String foamLevel;

    public Cappuccino(String name, int volumeMl, double price, int temperatureC, String foamLevel) {
        super(name, volumeMl, price, temperatureC);
        this.foamLevel = foamLevel;
    }

    @Override
    public String getDescription() {
        return super.getDescription()
                + "\nfoam level (proportion): " + foamLevel;
    }
}

class Americano extends CoffeeDrink {
    private int waterVolumeML;

    public Americano(String name, int volumeMl, double price, int temperatureC, int waterVolumeML) {
        super(name, volumeMl, price, temperatureC);
        this.waterVolumeML = waterVolumeML;
    }

    @Override
    public String getDescription() {
        return super.getDescription()
                + "\nwater volume (ML): " + waterVolumeML;
    }
}