import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = greetUser(sc);
        String repeatedName = askToRepeatName(sc);

        int age = guessUserAge(sc, repeatedName);
        countToNumber(sc);
        testProgrammingKnowledge(sc, repeatedName);

        sc.close();
    }

    public static String greetUser(Scanner sc) {
        System.out.println("Hi there! ヾ(＾∇＾)  I'm a ChatBot. What's your name?");
        return sc.nextLine();
    }

    public static String askToRepeatName(Scanner sc) {
        System.out.println("Can you please repeat your name for me?");
        String repeatedName;
        repeatedName = sc.nextLine();
        return repeatedName;
    }


    public static int guessUserAge(Scanner sc, String repeatedName) {
        System.out.println("Thanks, " + repeatedName + "! Let's try to guess your age. What year were you born? (or you can type 'no')");
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
            return age;
        }

        return 0;
    }

    public static void countToNumber(Scanner sc) {
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
        sc.nextLine();
    }

    public static void testProgrammingKnowledge(Scanner sc, String repeatedName) {
        String answer = "";
        System.out.println("That was fun! Now let's test your programming knowledge. (^_^ ) ");

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
        System.out.println("I had a lot of fun! Thanks for chatting with me, " + repeatedName + ". See ya later!");
    }
}
