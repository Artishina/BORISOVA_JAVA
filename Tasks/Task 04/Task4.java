import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sumOfNums = 0;
        int lengthOfTheSequence = 1000;
        int sumOfTheSequence = (lengthOfTheSequence * (lengthOfTheSequence + 1)) / 2;
        int missingNum = 0;

        while (num != -1) {
            sumOfNums += num;
            num = scanner.nextInt();
            missingNum = sumOfTheSequence - sumOfNums;
        }

        System.out.println("The sum of entered numbers = " + sumOfNums);
        System.out.println("The missing number = " + missingNum);
    }
}