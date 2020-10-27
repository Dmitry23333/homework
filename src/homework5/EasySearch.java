package homework5;

public class EasySearch implements ISearchEngine {

    public long search(String text, String word) {
        text=text.toLowerCase();
        word=" "+word.toLowerCase()+" ";
        int count=0;
        int index = 0;
        int wordLength=0;
        while(index != -1){
            index = text.indexOf(word, index + wordLength);
            if (index != -1) {
                count++;
            }
            wordLength = word.length();
        }
        return count;
    }
}
