package service;

import common.Gestures;
import gesture.Gesture;

import static common.MessageProperties.*;

public class DecisionService {
    private DecisionService() {
    }

    public static Gestures generateComputerChoice() {
        return Gestures.determineComputerChoice();
    }

    public static String determineAndPrintWinner(Gesture computerChoice, Gesture userChoice) {
        String output = determineWinner(computerChoice, userChoice);
        System.out.println(output);
        return output;
    }

    private static String determineWinner(Gesture computerChoice, Gesture userChoice) {
        if (computerChoice.getName().equals(userChoice.getName())) {
            return getFormat(TIE, computerChoice, userChoice);
        } else if (computerChoice.beats(userChoice)) {
            return getFormat(YOU_LOST, computerChoice, userChoice);
        } else {
            return getFormat(YOU_WON, computerChoice, userChoice);
        }
    }

    private static String getFormat(String message, Gesture computerChoice, Gesture userChoice) {
        return String.format(message,
                computerChoice.getName(),
                computerChoice.getEmoji(),
                userChoice.getName(),
                userChoice.getEmoji()
        );
    }

}
