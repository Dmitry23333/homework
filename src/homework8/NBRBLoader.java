package homework8;

import java.io.*;
import java.util.Date;

/**
 * Загрузчик курса с сайта Нац. Банка
 */
public class NBRBLoader extends SiteLoader{
    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public String load(SiteLoader.Currency currencyName) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName).toString();
    }
    @Override
    public String loaddata(SiteLoader.Currency currencyName, String date) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId()+"?ondate="+date, currencyName).toString();
    }
    @Override
    public String loadDynamicDate(SiteLoader.Currency currencyName, String startDate, String endDate) {
        return load("https://www.nbrb.by/api/exrates/rates/dynamics/" + currencyName.getId()+"?startDate="+ startDate+"&endDate="+endDate, currencyName).toString();
    }
    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected String handle(String content, SiteLoader.Currency currencyName) {
        content=content.replace("\n","");
        content=content.replaceAll("\\s+","");
        String[] arrSplit = content.split("},");
        String result ="";
        try {
            for (int i=0;i<arrSplit.length;i++){
                result+= content.substring(content.indexOf("Date")+ 7, content.indexOf("T00:"))+" ";
                result+= arrSplit[i].substring(arrSplit[i].indexOf("Cur_OfficialRate") + 18, arrSplit[i].indexOf("Cur_OfficialRate") + 24)+" ";
            }
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
