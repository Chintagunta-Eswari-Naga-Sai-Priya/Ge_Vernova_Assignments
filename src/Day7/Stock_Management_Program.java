package Day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Stock {
    private String name;
    private int numberOfShares;
    private double sharePrice;

    public Stock(String name, int numberOfShares, double sharePrice) {
        this.name = name;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    public double value() {
        return numberOfShares * sharePrice;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public double getSharePrice() {
        return sharePrice;
    }
}

class StockPortfolio {
    private List<Stock> stocks;

    public StockPortfolio() {
        stocks = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void printReport() {
        double totalValue = 0;
        System.out.printf("%-20s %-15s %-15s %-15s%n", "Stock Name", "No. of Shares", "Share Price", "Value");
        System.out.println("-------------------------------------------------------------");
        for (Stock stock : stocks) {
            double stockValue = stock.value();
            totalValue += stockValue;
            System.out.printf("%-20s %-15d %-15.2f %-15.2f%n", stock.getName(), stock.getNumberOfShares(), stock.getSharePrice(), stockValue);
        }
        System.out.println("-------------------------------------------------------------");
        System.out.printf("Total Portfolio Value: %.2f%n", totalValue);
    }
}

public class Stock_Management_Program {
    public static void main(String[] args) {
        StockPortfolio portfolio = new StockPortfolio();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of stocks: ");
        int N = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        for (int i = 0; i < N; i++) {
            System.out.print("Enter stock name, number of shares and share price: ");
            String name = scanner.nextLine();
            int numberOfShares = scanner.nextInt();
            double sharePrice = scanner.nextDouble();
            scanner.nextLine(); // consume the newline
            portfolio.addStock(new Stock(name, numberOfShares, sharePrice));
        }

        portfolio.printReport();
        scanner.close();
    }
}

