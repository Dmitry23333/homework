package workwithstrings;


public class LinesMain {
    public static void main(String[] args) {
        Lines a = new Lines();
        System.out.println(a.toString(1));
        System.out.println(a.toString(891));
        System.out.println(a.toString(891.81));
        System.out.println(a.toString(-999999999));

        System.out.println(a.toWeek(1));
        System.out.println(a.toWeek(14));
        System.out.println(a.toWeek(7));
        System.out.println(a.toHoursMinuteSecondMillisecond(7789001,true));
        System.out.println(a.toHoursMinuteSecondMillisecond(7789001,false));

    }
}

