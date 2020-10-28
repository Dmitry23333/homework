package homework8;

import java.io.*;

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
    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected String handle(String content, SiteLoader.Currency currencyName) {
        double currencyRates=0;
        try {
            currencyRates = Double.parseDouble(content.substring(content.indexOf("Cur_OfficialRate") + 18, content.indexOf('}')));
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return String.valueOf(currencyRates);
    }
}
