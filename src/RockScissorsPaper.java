import common.Gestures;
import model.Gesture;

import java.util.Scanner;

import static service.DecisionService.determineAndPrintWinner;
import static service.DecisionService.generateComputerChoice;
import static service.GestureFactory.createGesture;
import static service.MenuService.*;
import static service.UserService.*;

public class RockScissorsPaper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logic(scanner);
    }

    private static void logic(Scanner scanner) {
        showMenu();
        showPlayerMakeDecision();
        String userInput = scanner.nextLine().trim();

        if (wantToQuit(userInput)) {
            return;
        }

        if (!isUserChoiceValid(userInput)) {
            warnUserForValidInput();
            logic(scanner);
            return;
        }

        Gestures userChoice = getUserChoice(userInput);
        Gestures computerChoice = generateComputerChoice();

        Gesture computerGesture = createGesture(computerChoice);
        Gesture userGesture = createGesture(userChoice);

        showHandShake();
        determineAndPrintWinner(computerGesture, userGesture);

        sleepAndRecallMethod(scanner);
    }

    private static void sleepAndRecallMethod(Scanner scanner) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        logic(scanner);
    }
}