package ema.week1;

public class oddOrEven {
    public static void main(String[] args) {
        //Write  a method which can identifies given number is even or odd


        int number = 17; // Example number

        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    }


