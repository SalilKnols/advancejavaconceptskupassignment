package question4;
import java.util.*;
import java.util.stream.Collectors;

public class DistinctList
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of strings separated by spaces:");
        String input = scanner.nextLine();
        List<String> inputList = Arrays.asList(input.split(" "));
        List<String> distinctList = inputList.stream().distinct().sorted().collect(Collectors.toList());

        //List<String> distinctList = inputList.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct strings: " + distinctList);
    }
}