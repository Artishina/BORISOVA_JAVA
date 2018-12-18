import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digitsSum = 0;
        int currentDigit;
        int currentPosition;
        int productOfNumbers = 1;
        int position = 0;

        while (number != -1) {

            while (number != 0) {
                currentDigit = number % 10;
                digitsSum = digitsSum + currentDigit;
                number = number / 10;

            }
            System.out.println("The digits sum = " + digitsSum);

            for (int divider = 2; divider * divider <= digitsSum; divider++) {

                if (digitsSum % divider == 0) {
                    System.out.println("The number is not prime");
                    digitsSum = 0;
                    break;

                } else {
                    System.out.println("The number is prime");
                    digitsSum = 0;
                    
                    if (position != 0) {
                        currentPosition = position;
                        System.out.println("The current position = " + currentPosition);
                        productOfNumbers *= currentPosition;
                        System.out.println("The product of numbers = " + productOfNumbers);
                    }
                }
            }
            number = scanner.nextInt();
            position++;
        }
    }
}