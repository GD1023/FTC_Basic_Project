
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] choices = {"rock", "paper", "scissor"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Hey! Let's Play Rock, Paper, Scissors!");
        System.out.println("Start by typing either rock, paper, or scissor");

        while (true){
            System.out.print("Your Choice:");
            String user_choice = scanner.nextLine().toLowerCase();

            if (
                    user_choice.equals("rock") ||
                            user_choice.equals("paper") ||
                            user_choice.equals("scissor")
            ) {
                ;
            } else {
                System.out.println("Please input a valid choice");
                continue;
            }

            String computer = choices[random.nextInt(3)];

            if (user_choice.equals(computer)) {
                System.out.println("It's a tie!");
            } else if (
                    (user_choice.equals("rock") && computer.equals("scissor")) ||
                            (user_choice.equals("paper") && computer.equals("rock")) ||
                            (user_choice.equals("scissor") && computer.equals("paper"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
            System.out.print("The computer chose: ");
            System.out.println(computer);
            break;
        }



    }
}
