    package stocks;

import java.util.Random;

public class Stock {
    private double price;
    String name;    
    double change;
    double amountBought = 0;

    Random rand = new Random();

    Stock(double price) {
        System.out.println("Creating a new stock with a price of " + price);
        setPrice(price);
    }

    Stock() {
        this(10);
        System.out.println("Creating stock with default price.");
    }

    void changePrice() {
        change = rand.nextDouble() *  5 - 2.5;
        price = price + change;
    }

    double buyStock(int amount) {
        amountBought = amountBought + price * amount;
        System.out.println("You now own " + amountBought + " stock.");
        return amountBought;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {    
            System.out.println("Stock prices must be a positive number.");
        }
    }

    @Override
    public String toString() {
        return name + " Stock price: " + price + " Last change: " + change;
    }
}
