package week1;

public class divisionWithoutOperator {
    public static void main(String[] args) {
        //Write a method that can divide two numbers without using division operator
        int dividend = 20;
        int divisor = 3;

        int result = divide(dividend, divisor);
        System.out.println("Result: " + result);
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }

        // Initialize the result
        int result = (int) Math.round((double) dividend / divisor);

        return result;

    }




}
