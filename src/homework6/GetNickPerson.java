package homework6;


import java.util.Random;


public class GetNickPerson {

    private static String filePath = "src"+ File.separator+"names.txt";
    private static String[] txt = Utils.readText(filePath);
    private static final Random random = new Random();
    public static String getNickPerson(){
        return txt[random.nextInt(txt.length)];
    }
}
