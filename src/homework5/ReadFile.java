package homework5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ReadFile {
    public  String readText(String filePath)
    {
        String content = "";
        try
        {
            content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return content.replaceAll("\\p{Punct}"," ");
    }
    public Set <String> getSetUnique(String txt){
        Set<String> set = new HashSet<>();
        String[] words = txt.split("\\s+");  // Разбиение строки на слова
        for (String subStr : words) {
            set.add(subStr);
        }
        return set;
    }
    public void getTop(String txt, int value){
        Map<String, Integer> occurrences = new HashMap<String, Integer>();
        String[] words = txt.split("\\s+");  // Разбиение строки на слова
        for (String word : words) {
            Integer oldCount = occurrences.get(word);
            if (oldCount == null) {
                oldCount = 0;
            }
            occurrences.put(word, oldCount + 1);
        }
        List list = new ArrayList(occurrences.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });
        for (int i = 0; i < value; i++) {
            System.out.println((i + 1) + " место занимает слово " + list.get(i) + " упоминаний");
        }
    }
}
