package question2;

import java.util.Scanner;

interface MaxInterface {
    int max(int a, int b);
}

public class MaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
        input.close();

        MaxInterface maxInterface = (firstinteger, secondinteger) -> firstinteger > secondinteger ? firstinteger : secondinteger;
        int maximumNumber = maxInterface.max(firstNumber, secondNumber);
        System.out.println("Max of " + firstNumber + " and " + secondNumber + " is " + maximumNumber);
    }
}
