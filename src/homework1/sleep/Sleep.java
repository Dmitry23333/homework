package homework1.sleep;

public class Sleep {
    public static void main (String[] arg){
        boolean weekday=false;
        boolean vacation=false;
       if (SleepIn(weekday,vacation)){
           System.out.println("Можем спать дальше");
       }
       else System.out.println("Пора идти на работу");
    }
    public static boolean SleepIn (boolean weekday, boolean vacation) {
        if (!weekday||vacation) {
            return true;
        }
        return false;
    }
}

