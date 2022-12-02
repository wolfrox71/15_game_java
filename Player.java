import java.util.Scanner;

public class Player {
    public String username;
    public Boolean winner;
    public void won() {
        if (winner) {
            System.out.println(username + " won!");
        }
    }
    public Player(String _username) {
        winner = true;
        username = _username;
    }
    public int round(int value) {
        Scanner sc = new Scanner(System.in); 
        int number = 0;
        int max_number = 3;
        int min_number = 1;
        System.out.println("\n"+username+"'s turn");
        System.out.println("The current value is " + value);
        do {
            System.out.println("Enter a number between " + min_number + " and " + max_number);
            number = sc.nextInt();
        } while (number > max_number || number < min_number);
        //sc.close();
        System.out.println("Numbers:");
        for (int i = 0; i < number; i++) {
            System.out.println(value+i);
        }
        System.out.println();
        return number;
    }
}
