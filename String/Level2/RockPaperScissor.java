package com.gla.String.Level2;
import java.util.Scanner;
public class RockPaperScissor {
    public static String computerChoice() {
        int n = (int) (Math.random() * 3);
        if (n == 0)
            return "rock";
        else if (n == 1)
            return "paper";
        else
            return "scissors";
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp))
            return "Draw";

        if ((user.equals("rock") && comp.equals("scissors")) ||
                (user.equals("paper") && comp.equals("rock")) ||
                (user.equals("scissors") && comp.equals("paper")))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = sc.next();
        String comp = computerChoice();

        System.out.println("Computer: " + comp);
        System.out.println("Winner: " + findWinner(user, comp));
    }
}
