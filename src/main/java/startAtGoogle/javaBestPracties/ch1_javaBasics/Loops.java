package startAtGoogle.javaBestPracties.ch1_javaBasics;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
        int [] numbers = {0,1,2,3,4,5,6,7,8,9};
        int myNum = 3;

        System.out.println("the arr: "+ Arrays.toString(numbers));
        System.out.println("the num to modulu: "+ myNum);

        loopEx(numbers, myNum);
    }

    private static void loopEx(int[] numbers, int myNum) {
        System.out.println("\nfor i");
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i]%myNum == 0 ) {
                System.out.print(numbers[i] + ", ");
            }
        }

        System.out.println("\n\nfor each");
        for ( int number:numbers) {
            if (number%myNum == 0 ) {
                System.out.print(number + ", ");
            }
        }

        System.out.println("\n\nwhile");
        int i = 0;
        while( i < numbers.length) {
            if (numbers[i]%myNum == 0 ) {
                System.out.print(numbers[i] + ", ");
            }
            i++;
        }

    }

}