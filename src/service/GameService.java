package service;

import common.Gestures;
import gesture.Gesture;

import java.util.Scanner;

import static gesture.GestureFactory.createGesture;
import static service.DecisionService.determineAndPrintWinner;
import static service.DecisionService.generateComputerChoice;
import static service.MenuService.*;
import static service.UserService.*;

public class GameService {

    public void play(Scanner scanner) {
        showMenu();
        showPlayerMakeDecision();
        String userInput = scanner.nextLine().trim();

        if (wantToQuit(userInput)) {
            return;
        }

        if (!isUserChoiceValid(userInput)) {
            warnUserForValidInput();
            play(scanner);
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

    private void sleepAndRecallMethod(Scanner scanner) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        play(scanner);
    }
}
