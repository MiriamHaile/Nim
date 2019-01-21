import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Sticks sticks = new Sticks(21);
        int input;

        while (!(sticks.getSticks() == 0)) {

            System.out.print("Amount of sticks left: " + sticks.getSticks());
            System.out.print("\nChoose how many sticks you want to take: ");
            input = scanner.nextInt();

            sticks.getSticks() - input;
        }





    }

}
