import service.GameService;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        GameService game = new GameService();
        game.play(new Scanner(System.in));
    }

}