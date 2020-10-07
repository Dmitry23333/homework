package homework6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class Utils {

    public static  final char[] tmp=("qwertyuiopasdfghjklzxcvbnm" +
            "QWERTYUIOPASDFGHJKLZXCVBNM" +
            "йцукенгшщзхфывапролджэячсмитьбю" +
            "ЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ"+
            "1234567890").toCharArray();
    private static  final Random random=new Random();

    public static String randomPassword(){
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i <=  5 + random.nextInt(5); i++) {
            builder.append(tmp[random.nextInt(tmp.length)]);
        }
        return builder.toString();
    }

    static int randomAge(){
        return random.nextInt(15)+1;
    }
    public static String[] readText(String filePath)
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
        return content.replaceAll("\\p{Punct}"," ").split("\\s+");
    }
}

