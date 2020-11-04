package homework9.random;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class GetRandom {
        private static Random random=new Random();
        public static int getGrade(){
            return random.nextInt(10)+1;
        }

        public static String getFirstName() {
            String filepath = "src"+ File.separator+"names1.txt";
            String[] txt = readText(filepath);
            return txt[random.nextInt(txt.length)];
        }

    public static String getSurname() {
        String filepath = "src"+File.separator+"surnames.txt";
        String[] txt = readText(filepath);
        return txt[random.nextInt(txt.length)];
    }

    public static String getSecondName() {
        String filepath = "src"+File.separator+"secondName.txt";
        String[] txt = readText(filepath);
        return txt[random.nextInt(txt.length)];
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
