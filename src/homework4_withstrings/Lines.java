package workwithstrings;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Lines {
    private static final String dig1[][] = {{"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"},{"одна", "две"}};
    private static final String dig10[] = {"десять","одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
    private static final String dig20[] = {"двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
    private static final String dig100[] = {"сто","двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
    private static final String leword[][] = {{"сотая", "сотые", "сотых", "1"},{"целая", "целые", "целых", "0"},{"тысяча", "тысячи", "тысяч", "0"},{"миллион", "миллиона", "миллионов", "1"}};
    private int level = 1;
    private boolean week = false;
    private boolean negative = false;

    public String toString(int number) {
        StringBuilder words = new StringBuilder(50);
        if ( number < 0 ) { //если число отрицательное помечаем через переменную negative
            negative = true;
            number=Math.abs(number); //берем число по модулю
        }
        if (number==0)
            words.append("ноль ");
        int sex = leword[level][3].indexOf("1")+1; //не красиво конечно, но работает
        int h = (int)(number%1000); //текущий трехзначный сегмент
        int d = h/100; //цифра сотен
        if (d>0) { //если в разряде сотен не ноль подставляем соответсвующее значение
            words.append(dig100[d-1]).append(" ");
        }
        int n = h%100; //остаток от деления на 100
        d = n/10; //цифра десятков в остатке
        n = n%10; //цифра единиц в остатке
        switch(d) {
            case 0: break;
            case 1: words.append(dig10[n]).append(" "); // в остатке находится от 10 до 19
                break;
            default: words.append(dig20[d-2]).append(" "); // в остатке от 20 до 99
        }
        if (d==1)
            n=0; //при двузначном остатке от 10 до 19, цифра едициц не должна учитываться т.к в dig10 прописаны все случаи
        switch(n) { // проверяем цифру единиц в остатке
            case 0: break;
            case 1:
            case 2: {
                if(week) words.append(dig1[1][n-1]).append(" "); //один или два в зависимости от рода
                else words.append(dig1[sex][n-1]).append(" ");
            }
            break;
            default: words.append(dig1[0][n-1]).append(" ");
        }
        if(level!=1) {
            switch(n) {
                case 1: words.append(leword[level][0]);
                    break;
                case 2:
                case 3:
                case 4: words.append(leword[level][1]);
                    break;
                default: if((h!=0)||((h==0)&&(level==1))) //если трехзначный сегмент = 0, то добавлять нужно только "рублей"
                    words.append(leword[level][2]);
            }
        }
        int nextnum = number/1000;
        if(nextnum>0) {
            level++;
            return (toString(nextnum) + " " + words.toString()).trim();
        } else {
            if(negative) {
                level = 1;
                negative = false;
                return ("минус " + words.toString().trim());
            }
            else {
                level=1;
                return words.toString().trim();
            }
        }
    }

    public String toString(double number) {
        DecimalFormat df = new DecimalFormat("#.00");
        df.setRoundingMode(RoundingMode.DOWN); // обрезка до 2 знаков без округления
        String numFull = df.format(number); // все число
        String numFrac = numFull.substring(numFull.length()-2, numFull.length());// забираем дробную часть
        int fullnum = (int)Math.floor(number); //забираем целую часть и делаем int
        int fracnum = Integer.parseInt(numFrac);// //забираем дробную часть и делаем int
        String result = toString(fullnum);
        level=0;
        result+=" целых " + toString(fracnum) + " " ;
        return result;
    }
    public String toWeek(int day) {
        int numbWeeks=day/7;
        week=true;
        String result = toString(numbWeeks);
        switch(numbWeeks) {
            case 1: result+=" неделя";
                break;
            case 2:
            case 3:
            case 4:result+=" недели";
                break;
            default:result+=" недель";
        }
        week=false;
        return result;
    }


    public String  toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat) {
        String result="";
        long h = millisecond/1000 / 3600;
        long m = (millisecond/1000 % 3600) / 60;
        long s = (millisecond/1000 % 3600) % 60;
        long S = (millisecond%1000);
        if (shortFormat) {
            result= String.format("%02d:%02d:%02d:%03d", h,m,s,S);
        }else {
            long h1 = h %10;
            switch((int) h1) {
                case 1: result+=h+" час ";
                    break;
                case 2:
                case 3:
                case 4: result+=h+" часа ";
                    break;
                default:result+=h+" часов ";
            }
            long m1 = m%10;
            switch((int) m1) {
                case 1: result+=m+" минута ";
                    break;
                case 2:
                case 3:
                case 4:result+=m+" минуты ";
                    break;
                default:result+=m+" минут ";
            }
            long s1 = s%10;
            switch((int) s1) {
                case 1: result+=s+" секунда ";
                    break;
                case 2:
                case 3:
                case 4:result+=s+" секунды ";
                    break;
                default:result+=s+" секунд ";
            }
            long S1 = S%1000;
            switch((int) S1) {
                case 1: result+=S+" миллисекунда ";
                    break;
                case 2:
                case 3:
                case 4:result+=S+" миллисекунды ";
                    break;
                default:result+=S+" миллисекунд ";
            }
        }
        return result;
    }

}