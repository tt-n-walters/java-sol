
package stocks;

import java.util.Scanner;

public class StockMarket {
    Stock[] allStocks = new Stock[3];
    int dayNumber = 1;
    
    Scanner input = new Scanner(System.in);


    StockMarket() {
        allStocks[0] = new Stock(100);
        allStocks[0].name = "Amazon";
        allStocks[1] = new Stock(120);
        allStocks[1].name = "Apple";
        allStocks[2] = new Stock(10000);
        allStocks[2].name = "GME";
    }

    public void simulateDays(int amount) {
        for (int i = 0; i < amount; i++) {
            simulateDay();
        }
    }

    public void simulateDay() {
        for (int j = 0; j < allStocks.length; j++) {
            System.out.println("Day " + dayNumber + " -- Current stock price: " + allStocks[j].getPrice());
            allStocks[j].changePrice();
            System.out.println("Daily change: " + allStocks[j].change);
            System.out.println(allStocks[j]);

            System.out.println("Do you want to buy a stock?   yes/no");
            String response = input.nextLine();
            if (response.equals("yes")) {
                boolean hasBought = false;
                while (!hasBought) {
                    System.out.println("How much would you like to buy?");
                    String amountString = input.nextLine();
                    try {
                        int amount = Integer.parseInt(amountString);
                        System.out.println("Buying stock.");
                        allStocks[j].buyStock(amount);
                        hasBought = true;
                    } catch(Exception e) {
                        System.out.println("That is not a whole number. Try again");
                    }
                }
            }
        }
        dayNumber++;
    }
}
