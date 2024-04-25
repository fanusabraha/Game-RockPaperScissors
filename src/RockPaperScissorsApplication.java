import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsApplication {
    public static void main(String[] args) {
        Scanner scnanner = new Scanner(System.in);
        String[] game = {"r", "p", "s"};
        String playermove;
        while (true) {
            String computermove = game[new Random().nextInt(game.length)];
            while (true) {
                System.out.println("ENter r for rock s for scissors p paper");
                playermove = scnanner.next();
                if (playermove.equals("r") || playermove.equals("p") || playermove.equals("s")) ;
                break;
            }
            if (playermove.equals(computermove)) {
                System.out.println(" NOdbody won your move was  " + playermove + " Computermove was " + computermove);
            }
        }
    }
}
