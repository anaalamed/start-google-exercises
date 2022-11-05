package startAtGoogle.p1_javaBestPracties.ch9_generics;

import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        Callable<String> stringCallable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return generateStringName(5);
            }
        };

        Callable<Double> doubleCallable = new Callable<Double>() {
            @Override
            public Double call() throws Exception {
                return ThreadLocalRandom.current().nextDouble(1);
            }
        };


        Callable<Integer> intCallable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 10;                  // check success case
//                return getRandomId();
            }
        };

        double rnd = ThreadLocalRandom.current().nextDouble(1);

        retry(stringCallable,"aaa",10,500);
        retry(doubleCallable,rnd,10,500);
        retry(intCallable, 10,10,500);
    }


    public static <T> T retry(Callable<T> action, T expectedResult, int retryCount, int timeToSleep) {
        T res = null;
        try {
            for (int i = 0; i < retryCount; i++) {
                res=action.call();
                System.out.println(res);
                if(res.equals(expectedResult)) {                              // if Obj
                    System.out.println("the expected result found ");
                    return res;
                }
                Thread.sleep(timeToSleep);
            }
        }catch (Exception e){
            System.out.println("call e -> " + e);
        }

        System.out.println("no expectedResult:" + expectedResult + " " + res.getClass() + "\n");
        return res;
    }


    public static String generateStringName(int num){
        String AlphaNumericStr = "abcdefghijklmnopqrstuvxyz";
        StringBuilder s = new StringBuilder(num);
        for (int i=0; i<num; i++) {

            //generating a random number using math.random()

            int ch = (int)(AlphaNumericStr.length() * Math.random());

            //adding Random character one by one at the end of s
            s.append(AlphaNumericStr.charAt(ch));
        }

        return s.toString();
    }
//

    public static int getRandomId() {
        UUID uuid = UUID.randomUUID();
        return uuid.hashCode();
    }

}