package homework6;

import java.util.Random;

public class GetNickAnimal {
    private static String filePath = "C:/Users/user/IdeaProjects/JD50/src/homework6/pets.txt";
    private static String[] txt = Utils.readText(filePath);
    private static final Random random = new Random();

    public static String getNickAnimal(){
        return txt[random.nextInt(txt.length)];
    }
}
