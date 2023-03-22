package question2;
import java.util.Scanner;

interface NextEvenInterface {
    long nextEven(long n);
}

public class NextEvenNumber
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long inputNumber = input.nextLong();

        NextEvenInterface nextEvenInterface = (number) -> {
            if(number % 2 == 0) {
                return number + 2;
            } else {
                return number + 1;
            }
        };
        long nextEven = nextEvenInterface.nextEven(inputNumber);
        System.out.println("Next even number after " + inputNumber + " is " + nextEven);
    }
}
