package startAtGoogle.javaBestPracties.ch2_generalProgramming;

import java.io.*;

public class Files {
    public static void main(String[] args) {
//        sumOddEvenNum
        int [] numbers = {0,1,2,3,4};
//        System.out.println("the arr: "+ Arrays.toString(numbers));
//        sumOddEvenNum(numbers);

//       file read / write
        writeLinesContaining("/Users/ana/IdeaProjects/google/src/main/java/startAtGoogle/week1/day2/textFile.txt", "newText.txt", "story");
    }

    private static void writeLinesContaining(String fileToRead, String newFile, String story) {

        try (FileInputStream fis = new FileInputStream(new File(fileToRead))) {
            System.out.println("boom");

            int content;
            // reads a byte at a time, if it reached end of the file, returns -1
            while ((content = fis.read()) != -1) {
                System.out.println((char)content);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sumOddEvenNum(int[] numbers) {
        System.out.println("sum even of odd numbers start ");

        int oddSum=0, evenSum=0;
        for (int num:numbers) {
            if (num %2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("sum odd numbers: " + oddSum);
        System.out.println("sum even numbers: " + evenSum);

    }

}