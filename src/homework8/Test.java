package homework8;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static homework8.SiteLoader.Currency.*;

public class Test {
    public static void main(String[] args) {
        BelAPB belAPB = new BelAPB();
        printRatesBelAPB(belAPB, USD,"10/28/2019" );
        saveRatesBelAPB(belAPB,USD,"10/28/2020");

        NBRBLoader nbrbLoader = new NBRBLoader();
        printRatesNBRB(nbrbLoader, USD,"2020-10-20","2020-10-28");
        saveRatesNBRB(nbrbLoader,USD,"2020-10-20","2020-10-28");
    }

    public static void printRatesNBRB(SiteLoader loader, SiteLoader.Currency name, String dateStart , String dateEnd) {
        System.out.println("Курс валют "+name+" на сегодня");
        System.out.println(loader.load(name));
        System.out.println("Курс валют "+name+" по дате:");
        System.out.println(loader.loadData(name,dateStart));
        System.out.println("Курс валют "+name+" по дате от " + dateStart+" до " +dateEnd);
        System.out.println(loader.loadDynamicDate(name,dateStart,dateEnd));
    }

    public static void printRatesBelAPB(SiteLoader loader,SiteLoader.Currency name,String dateStart) {
        System.out.println("Курс валют "+name+" на сегодня");
        System.out.println(loader.load(name));
        System.out.println("Курс валют "+name+" по дате:");
        System.out.println(loader.loadData(name,dateStart));
    }

    public static void saveRatesNBRB(SiteLoader loader,SiteLoader.Currency name,String dateStart , String dateEnd) {
        System.out.println("Сохраняем курс валют "+name+" на сегодня");
        loader.saveRate(loader.load(name),name, SiteLoader.Bank.NBRB);
        System.out.println("Сохраняем курс валют "+name+" по дате: " + dateStart);
        loader.saveRate(loader.loadData(name,dateStart),name, SiteLoader.Bank.NBRB);
        System.out.println("Сохраняем курс валют "+name+" по дате от " + dateStart+" до " +dateEnd);
        loader.saveRate(loader.loadDynamicDate(name,dateStart,dateEnd),name, SiteLoader.Bank.NBRB);
    }
    public static void saveRatesBelAPB(SiteLoader loader,SiteLoader.Currency name,String dateStart) {
        System.out.println("Сохраняем курс валют "+name+" на сегодня");
        loader.saveRate(loader.load(name),name, SiteLoader.Bank.BelAPB);
        System.out.println("Сохраняем курс валют "+name+" по дате: " + dateStart);
        loader.saveRate(loader.loadData(name,dateStart),name, SiteLoader.Bank.BelAPB);
    }
}
