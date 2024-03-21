package shafiq.week1;

public class divisionWithoutOperator {

//Write a method that can divide two numbers without using division operator
    public static int divide(int dividend, int divisor) {
        int quotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }
        return quotient;
    }

    public static void main(String[] args) {

        System.out.println(divide(10,2));
    }


}


