package homework1.phonenumber;

public class PhoneNumber {
    public static void main (String [] arg){
        int[] number= new int[] {0,1,2,3,4,5,6,7,8,9};
        System.out.print(createPhoneNumber(number));
    }
    public static String createPhoneNumber(int [] phone){
        char[] numberphone= new char[]{'(','0','0','0',')',' ','0','0','0','-','0','0','0','0'};
        int j=0;
        for (int i=0;i<numberphone.length;i++){
           if (numberphone[i]=='0'){
               numberphone[i]=Character.forDigit(phone[j],10);
               j++;
           }
        }
        String result = new String(numberphone);
        return result;
    }
}
