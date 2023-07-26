package service;

import common.Gestures;

import static common.MessageProperties.QUIT_CHAR;
import static common.MessageProperties.QUIT_WORD;

public class UserService {
    public static Gestures getUserChoice(String input) {
        return Gestures.getGestureByInput(input);
    }

    public static boolean isUserChoiceValid(String input) {
        return Gestures.contains(input);
    }

    public static boolean wantToQuit(String input) {
        return input.equalsIgnoreCase(QUIT_CHAR) || input.equalsIgnoreCase(QUIT_WORD);
    }
}
