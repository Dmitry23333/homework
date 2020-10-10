
public class PhoneNumberNew {
    public static void main (String [] arg) {
        Integer[] integers ={0,1,2,3,4,5,6,7,8,9,};
        System.out.println(createNumber(integers));
    }
    public static String createNumber (Integer [] phone){
        StringBuilder phoneFormat = new StringBuilder();
        for (Integer integer : phone) {
            phoneFormat.append(integer.toString());
        }
        return  phoneFormat.toString().replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3");
    }
}
