import java.util.Random;
import java.util.Scanner;

public class HiddenNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1; 
        try (Scanner scanner = new Scanner(System.in)) {
            int guess;
            
            System.out.println("Guess the number between 1 and 100!");
            
            while (true) {
                System.out.print("Enter your guess: ");
                try {
                    guess = scanner.nextInt();
                    
                    if (guess < targetNumber) {
                        System.out.println("Too low! Try again.");
                    } else if (guess > targetNumber) {
                        System.out.println("Too high! Try again.");
                    } else {
                        System.out.println("Congratulations! You guessed the number.");
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    scanner.next(); 
                }
            }
        }
    }
}
