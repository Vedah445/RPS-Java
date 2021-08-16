import java.util.*;

public class RPC {
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        boolean b = true;
        while (b == true) {
            int a = rand.nextInt(3) + 1;
            System.out.println("enter number");
            input = scanner.nextLine();
            if (input.equals("q"))
                break;
            RPC2(a, input);
        }
    }

    public static void RPC2(int a, String input) {
        if (a == 1) {
            if (input == "Rock" || input == "R" || input == "1") {
                System.out.println("tie");
            }

            else if (input == "p") {
                System.out.println("you win");
            }

            else {
                System.out.println("comp wins");
            }
        }

        else if (a == 2) {
            if (input == "r") {
                System.out.println("comp wins");
            }

            else if (input == "p") {
                System.out.println("tie");
            }

            else {
                System.out.println("you win");
            }
        }

        else {
            if (input == "r") {
                System.out.println("you win");
            }

            else if (input == "p") {
                System.out.println("comp wins");
            }

            else {
                System.out.println("tie");
            }
        }
    }
}
/*
 * Important: 1 = R, 2 = P, 3 = S
 */
