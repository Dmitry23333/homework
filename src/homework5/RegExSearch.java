package homework5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    public long search(String text, String word){
        text=text.toLowerCase();
        int count=0;
        Pattern p = Pattern.compile(" "+word.toLowerCase()+" ");
        Matcher m = p.matcher(text);
        while(m.find()) {
            count++;
        }
        return count;
    }
}
