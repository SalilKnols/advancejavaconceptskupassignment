package question3;

import java.util.Scanner;
import java.util.function.Function;

public class ConcatenateString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Function<String[], String> concatenate = (strings) -> {
            StringBuilder result = new StringBuilder();
            for (String appendedString : strings) {
                result.append(appendedString);
            }
            return result.toString().toUpperCase();
        };
        String[] inputStrings = new String[7];
        for (int index = 0; index < inputStrings.length; index++) {
            System.out.print("Enter string " + (index+1) + ": ");
            inputStrings[index] = input.nextLine();
        }
        String outputString = concatenate.apply(inputStrings);
        System.out.println(outputString);
    }
}

