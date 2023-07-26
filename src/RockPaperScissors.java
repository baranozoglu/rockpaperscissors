import java.util.Scanner;

import static service.GameService.play;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        play(scanner);
    }

}