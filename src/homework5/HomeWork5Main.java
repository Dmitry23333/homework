package homework5;

import java.util.*;

public class HomeWork5Main {
    public static void main(String[] args) {
        ReadFile text = new ReadFile();
        String filePath = "src"+ File.separator+"Война и мир_книга.txt";
        String txt = text.readText(filePath);
        Set<String> set = text.getSetUnique(txt);
        text.getTop(txt, 10);
        ISearchEngine text1=new EasySearch();
        System.out.println(text1.search(txt,"война")+" упоминаний слова 'война'");
        System.out.println(text1.search(txt,"и")+" упоминаний слова 'и'");
        System.out.println(text1.search(txt,"мир")+" упоминаний слова 'мир'");
        ISearchEngine text2=new RegExSearch();
        System.out.println(text2.search(txt,"война")+" упоминаний слова 'война'");
        System.out.println(text2.search(txt,"и")+" упоминаний слова 'и'");
        System.out.println(text2.search(txt,"мир")+" упоминаний слова 'мир'");
    }
}
