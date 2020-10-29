package homework8;

import java.io.*;

import static homework8.SiteLoader.Currency.EUR;
import static homework8.SiteLoader.Currency.USD;
import static homework8.SiteLoader.Currency.RUB;

public class Test {
    public static void main(String[] args) {
        NBRBLoader nbrbLoader=new NBRBLoader();
        printRates(nbrbLoader);
        saveUSDRates(nbrbLoader);
        saveRUBRates(nbrbLoader);
        saveEURRates(nbrbLoader);
    }
    public static void printRates(SiteLoader loader) {
        System.out.println(loader.load(USD));
        System.out.println(loader.load(EUR));
        System.out.println(loader.load(RUB));
    }
    public static void saveUSDRates(SiteLoader loader){
        loader.saveRate(loader.load(SiteLoader.Currency.USD),SiteLoader.Currency.USD);
    }
    public static void saveRUBRates(SiteLoader loader){
        loader.saveRate(loader.load(SiteLoader.Currency.RUB),SiteLoader.Currency.RUB);
    }
    public static void saveEURRates(SiteLoader loader){
        loader.saveRate(loader.load(SiteLoader.Currency.EUR),SiteLoader.Currency.EUR);
    }
}
