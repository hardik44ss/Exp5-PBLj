import java.util.ArrayList;
import java.util.Scanner;

public class partA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers separated by space (type 'done' and press enter to finish):");

        while (true) {
            String input = sc.next();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                Integer num = Integer.parseInt(input);
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        int sum = 0;
        for (Integer num : numbers)
            sum += num;
        System.out.println("Sum of entered integers: " + sum);
        sc.close();
    }
}
