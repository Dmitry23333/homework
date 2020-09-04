package homework2.repeats;

public class repeatHome2 {
    public static void main(String[] b) {
        String regex = "\\d+";
        StringBuilder builder = new StringBuilder();
        for(String s : b) {
            builder.append(s);
        }
        String str = builder.toString();
        if (!str.matches(regex) ) {
            System.out.println("Введен не числовой символ");
            return;
        }
        if(str.length()==1){
            System.out.print(str);
            return;
        }
        char[] numbers=new char[str.length()];
        for(int i=0; i<str.length();i++){
             numbers[i] = str.charAt(i);
        }
        System.out.print(numbers[0]);
        long result = Character.getNumericValue(numbers[0]);
        for (int i=1;i< numbers.length;i++) {
            System.out.print("*" + numbers[i]);
            result *= Character.getNumericValue(numbers[i]);
        }
        System.out.print("="+result);
    }
}
