package task.random;


import java.util.Random;

public class AnyRandom {
        static  final char[] tmp=("qwertyuiopasdfghjklzxcvbnm" +
                "QWERTYUIOPASDFGHJKLZXCVBNM").toCharArray();
        static  final Random random=new Random();
        public static String randomNameProduct(){
            StringBuilder builder=new StringBuilder();
            for (int i = 0; i < 5+ random.nextInt(5); i++) {
                builder.append(tmp[random.nextInt(tmp.length)]);
            }
            return builder.toString();
        }


        public static int randomDiscount(){
            return 1+random.nextInt(25);
        }
        public static double randomPriceProduct(){
            return random.nextInt(100)+Math.ceil(random.nextDouble()*100)/100;
        }

        public static boolean randomBoolean(){
            return random.nextBoolean();
        }
    }

