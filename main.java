import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        List<Player> players = new ArrayList<Player>();

        Scanner players_sc = new Scanner(System.in);
        System.out.println("Enter the number of players");
        int number_of_players = players_sc.nextInt();

        for (int i = 1; i < number_of_players+1; i++) {
            System.out.print("Enter user " + i + "'s name:\n");
            Scanner sc = new Scanner(System.in); 
            String _name = sc.next();
            players.add(new Player(_name));
        }


        int score = 1;
        int end_val = 15;
        Boolean over = false;
        while (score < end_val) {
            for (Player player: players) {
                score += player.round(score);
                if (over) {
                    System.out.println(player.name);
                    break;
                }
                if (score >= end_val) {
                    player.winner = false;
                    over = true;
                    continue;
                    break;
                }
               
            }
        }
        System.out.println("\n\n\n");
        for (Player player: players) {
            player.won();
        }
    }
}
