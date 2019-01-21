import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Sticks sticks = new Sticks(21);
        int input;

        do {

            System.out.print("Amount of sticks left: " + sticks.getSticks());
            System.out.print("\nPlayer1, choose how many sticks you want to take: ");
            input = scanner.nextInt();
            sticks.setSticks(sticks.getSticks() - input);
            if (sticks.getSticks() == 0) {
                System.out.println("We are out of sticks, player1 wins!");
                System.exit(0);
            }
            System.out.print("Amount of sticks left: " + sticks.getSticks());
            System.out.print("\nPlayer2, choose how many sticks you want to take: ");
            input = scanner.nextInt();
            sticks.setSticks(sticks.getSticks() - input);

            if (sticks.getSticks() == 0) {
                System.out.println("We are out of sticks, player2 wins!");
                System.exit(0);
            }

        } while (sticks.getSticks() >= 0);
    }


}


