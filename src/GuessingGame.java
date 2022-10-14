import java.util.Scanner;

public class GuessingGame {
    static Scanner sc = new Scanner(System.in);
    static boolean keepPlaying = true; // static variable is a Class variable, all methods in the class can access it

    public static void main(String[] args) {
        System.out.println("\nLet's play a guessing name!");
        while (keepPlaying) {
                playAround();
        }
        System.out.println("\nThank you for playing!");
    }

    public static void playAround () {
        boolean validInput;
        int number, guess;
        String answer;

        number = (int)(Math.random() * 10) +1; // we have to cast bc Math method returns floating-point between 0 and 1
        System.out.println("\nI am thinking of a number between 1 and 10...What do you think it is?");

        do {
            guess = sc.nextInt();
            validInput = true;

            if (guess < 1 || guess > 10) {

                System.out.println("The number should be between 1 and 10. Please try again!");
                validInput = false;

            }
        } while (!validInput);

        if (guess == number) {
            System.out.println("You're right!");
        } else {
            System.err.println("You're wrong! The number was " + number + "!");
        }

        do {

            System.out.println("Would you like to play again? (Y or N): ");
            answer = sc.next();
            validInput = true;

            if (answer.equalsIgnoreCase("Y")) {
                keepPlaying = true;
            } else if (answer.equalsIgnoreCase("N")) {
                keepPlaying = false;
            } else validInput = false;

        } while (!validInput);
    }
}
