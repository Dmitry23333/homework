package homework8(ver2);

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class BelAPB extends SiteLoader {
    @Override
    public String load(Currency currencyName) {
        return load("https://www.belapb.by/ExCardsDaily.php?oneDate",currencyName);
    }

    @Override
    protected String handle(String content, Currency currencyName) {
        content=content.replace("\n","");
        content=content.replaceAll("\\s+","");
        String[] arrSplit = content.split("</Currency>");// USD - [0], EUR - [1], RUB [2];
        int i = 0;
        switch (currencyName){
            case EUR -> {
                i=1;
                break;
            }
            case RUB -> {
                i = 2;
                break;
            }
        }
       String currency="";
        try {
             currency =  " RateBuy " + (arrSplit[i].substring(arrSplit[i].indexOf("RateBuy") + 8, arrSplit[i].indexOf("</RateBu"))) +
            " RateSell " + (arrSplit[i].substring(arrSplit[i].indexOf("RateSell") + 9, arrSplit[i].indexOf("</RateSell")));
        }catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return currency;
    }
}
