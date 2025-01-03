package Day7;

import java.util.ArrayList;
import java.util.List;

class CompanyShares {
    private String stockSymbol;
    private int numberOfShares;

    public CompanyShares(String stockSymbol, int numberOfShares) {
        this.stockSymbol = stockSymbol;
        this.numberOfShares = numberOfShares;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void updateShares(int shares) {
        this.numberOfShares += shares;
    }
}

class StockAccount {
    private List<CompanyShares> shares;

    public StockAccount() {
        shares = new ArrayList<>();
    }

    public void buy(String stockSymbol, int sharesToBuy) {
        for (CompanyShares share : shares) {
            if (share.getStockSymbol().equals(stockSymbol)) {
                share.updateShares(sharesToBuy);
                return;
            }
        }
        shares.add(new CompanyShares(stockSymbol, sharesToBuy));
    }

    public void sell(String stockSymbol, int sharesToSell) {
        for (CompanyShares share : shares) {
            if (share.getStockSymbol().equals(stockSymbol) && share.getNumberOfShares() >= sharesToSell) {
                share.updateShares(-sharesToSell);
                return;
            }
        }
        System.out.println("Insufficient shares or stock not found.");
    }

    public void printShares() {
        System.out.println("Shares in Account:");
        for (CompanyShares share : shares) {
            System.out.printf("Stock Symbol: %s, Number of Shares: %d%n", share.getStockSymbol(), share.getNumberOfShares());
        }
    }
}

public class StockAccountManagement {
    public static void main(String[] args) {
        StockAccount account = new StockAccount();
        account.buy("AAPL", 10);
        account.buy("GOOGL", 5);
        account.sell("AAPL", 2);
        account.printShares();
    }
}
