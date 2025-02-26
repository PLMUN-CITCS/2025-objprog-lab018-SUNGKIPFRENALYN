import java.util.Scanner;

public class EvenOddChecker {
  
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        while (true) {
            try {
                System.out.print("Enter an integer: ");
                number = Integer.parseInt(scanner.nextLine());
                break; 
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        
        return number;
    }

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
    
    
    public static void main(String[] args) {
        int number = getIntegerInput();
        String result = checkEvenOrOdd(number); 
        
       
        System.out.println(result);
        System.out.println("\nNotable Observations:");
        System.out.println("- This activity emphasizes the separation of concerns by using different methods for input and logic.\n"
                + "- Using methods makes your code more modular and easier to test and debug.");
        
        System.out.println("\nJava Programming Best Practices:");
        System.out.println("- Use meaningful method names that clearly describe their purpose.");
        System.out.println("- Keep your methods concise and focused on a single task.");
        System.out.println("- Add comments to your code to explain the logic and purpose of each method.");
        System.out.println("- Validate user input to prevent unexpected errors.");
    }
}
