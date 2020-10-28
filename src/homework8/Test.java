package homework8;

import java.io.*;

import static homework8.SiteLoader.Currency.*;

public class Test {
    public static void main(String[] args) {
        NBRBLoader nbrbLoader = new NBRBLoader();
        BelAPB belAPB = new BelAPB();
        printRatesNBRB(nbrbLoader);
        printRatesBelAPB(belAPB);
        saveRUBRatesBelAPB(belAPB);
        saveUSDRatesNBRB(nbrbLoader);
        // saveRUBRates(nbrbLoader);
        // saveEURRates(nbrbLoader);
    }

    public static void printRatesNBRB(SiteLoader loader) {
        System.out.println(loader.load(USD));
        System.out.println(loader.load(EUR));
        System.out.println(loader.load(USD));
    }

    public static void printRatesBelAPB(SiteLoader loader) {
        System.out.println(loader.load(USD));
        System.out.println(loader.load(EUR));
        System.out.println(loader.load(RUB));
    }

    public static void saveUSDRatesNBRB(SiteLoader loader) {
        loader.saveRate(loader.load(SiteLoader.Currency.USD), SiteLoader.Currency.USD, SiteLoader.Bank.NBRB);
    }

    public static void saveRUBRatesNBRB(SiteLoader loader) {
        loader.saveRate(loader.load(SiteLoader.Currency.RUB), SiteLoader.Currency.RUB, SiteLoader.Bank.NBRB);
    }

    public static void saveEURRatesNBRB(SiteLoader loader) {
        loader.saveRate(loader.load(SiteLoader.Currency.EUR), SiteLoader.Currency.EUR, SiteLoader.Bank.NBRB);
    }

    public static void saveUSDRatesBelAPB(SiteLoader loader) {
        loader.saveRate(loader.load(SiteLoader.Currency.USD), SiteLoader.Currency.USD, SiteLoader.Bank.BelAPB);
    }

    public static void saveRUBRatesBelAPB(SiteLoader loader) {
        loader.saveRate(loader.load(SiteLoader.Currency.RUB), SiteLoader.Currency.RUB, SiteLoader.Bank.BelAPB);
    }

    public static void saveEURRatesBelAPB(SiteLoader loader) {
        loader.saveRate(loader.load(SiteLoader.Currency.EUR), SiteLoader.Currency.EUR, SiteLoader.Bank.BelAPB);
    }
}
