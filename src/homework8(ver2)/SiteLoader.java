package homework8(ver2);

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 * Реализация загрузчика сайтов
 */
public abstract class SiteLoader {
    public enum Currency{
        USD("145"),
        EUR("292"),
        RUB("298");

        private String id;

        Currency(String id) {
            this.id = id;
        }

        public String getId(){
            return this.id;
        }
    }

    public enum Bank{
        NBRB,
        BelAPB;
    }

    /**
     * Метод для запуска загрузки курса валют
     * @param urlToSite урл по которому надо постучаться
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    protected final String load(String urlToSite, SiteLoader.Currency currencyName){
        StringBuilder content;
        boolean error;
        int retryCount = 0;
        do{
            content = new StringBuilder();
            error = false;
            try {
                // create a url object
                HttpURLConnection con = (HttpURLConnection) new URL(urlToSite).openConnection();

                con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0");
                con.setConnectTimeout(50000); //set timeout to 50 seconds
                con.setReadTimeout(50000); //set timeout to 50 seconds

                try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()))){
                    String line;
                    while ((line = bufferedReader.readLine()) != null)
                    {
                        content.append(line).append("\n");
                    }
                }
            }
            catch(Exception e)
            {
                error = true;
                retryCount++;
                System.err.println("При соединении что-то пошло не так. "  + e.getMessage());
            }
        } while (error && retryCount < 5);

        if(error){
            throw new RuntimeException("Неполучилось загрузить курсы валют");
        }
        return handle(content.toString(), currencyName);
    }

    protected final void saveRate(String saveRate, Currency currency,Bank bank ) {
        String nameFile = "CurrentRate"+bank;
        System.out.println("Введите путь сохранения файла");
        Scanner in=new Scanner(System.in);
        String path = in.nextLine()+File.separator+nameFile;
        File dir = new File(path);
        String pathDefault = File.separator + nameFile;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(dir, true))) {
            if(pathDefault.equals(dir.getPath())){ /*проверка на введение пустой строки(по умолчанию
                                                         сохранит на диск C, а нам нужно поумолчанию */
                saveDefault(String.valueOf(saveRate),currency,bank);
            }
            else { writer.write(currency+" "+saveRate+"\n"); }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            saveDefault(saveRate,currency, bank);
        }
    }

    public static void saveDefault(String saveRate, Currency currency, Bank bank){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("CurrentRate"+bank, true))) {
            writer.write(currency+" "+saveRate + "\n");
            System.out.println("Файл записан по умолчанию ");
        } catch (IOException r) {
            System.out.println(r.getMessage());
        }
    }

    public abstract String load(SiteLoader.Currency currencyName);
    /**
     * Метод который будет дёрнут после успешной загрузки сайта
     * @param content содержимое сайта
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    protected abstract String handle(String content, SiteLoader.Currency currencyName);
}

