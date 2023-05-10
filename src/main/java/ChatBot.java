import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";

        // Method 1: Greet the user
        System.out.println("Hi there! ヾ(＾∇＾)  I'm a ChatBot. What's your name?");

        // Method 2: Ask the user to repeat their name
        name = sc.nextLine();
        System.out.println("Nice to meet you, " + name + "! Can you please repeat your name for me?");
        String repeatedName = sc.nextLine();

        // Method 3: Guess the user's age
        System.out.println("Thanks, " + name + "! Let's try to guess your age. What year were you born?(or you can type 'no')");
        // Check if the user entered 'no'
        String birthYearInput = sc.nextLine();
        if (birthYearInput.equals("no")) {
            System.out.println("Alright! Let's try some different questions to guess your age.");
            System.out.println("What is your favorite color?");
            String color = sc.nextLine();
            System.out.println("What is your favorite food?");
            String food = sc.nextLine();
            System.out.println("What is your favorite animal?");
            String animal = sc.nextLine();
            int ageGuess = color.length() + food.length() + animal.length();
            System.out.println("I'm guessing you're " + ageGuess + " years old. (・ε・`*) … ");
        } else {
            int birthYear = Integer.parseInt(birthYearInput);
            int age = 2023 - birthYear;
            System.out.println("I'm guessing you're " + age + " years old. Am I right?");
        }

        // Method 4: Count to any number the user wants
        System.out.println("Let's do something fun! Can you tell me a number to count up to?");
        int countNumber = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= countNumber; i++) {
            sb.append(i);
            if (i != countNumber) {
                sb.append(", ");
            }
        }
        System.out.println(sb.toString());

        // Resets the answer variable for stage 5
        sc.nextLine();  // consumes the remaining newline character
        String answer = "";

        System.out.println("That was fun! Now let's test your programming knowledge. d(>_･ ) ");
        // Method 5: Test the user's programming knowledge
        while (!answer.equals("4")) {
            System.out.println("Which of these are selection statements in Java?");
            System.out.println("1. break");
            System.out.println("2. continue");
            System.out.println("3. for()");
            System.out.println("4. if()");
            answer = sc.nextLine();
            if (!answer.equals("4")) {
                System.out.println(" ಠ ಠ Sorry, that's incorrect. Please try again.");
            }
        }
        System.out.println(" d(>_･ ) You got it!");
        System.out.println("Continue and break are jump statements, and for() is a looping statement.");
        System.out.println("I had a lot of fun! Thanks for chatting with me, " + name + ". See ya later!");

    }
}
