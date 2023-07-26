package service;

import common.Gestures;
import model.Gesture;
import model.Paper;
import model.Rock;
import model.Scissors;

public class GestureFactory {
    private GestureFactory() {
    }

    public static Gesture createGesture(String input) {
        return determineAndCreate(Gestures.getGestureByInput(input));
    }

    public static Gesture createGesture(Gestures input) {
        return determineAndCreate(input);
    }

    private static Gesture determineAndCreate(Gestures gesture) {
        return switch (gesture) {
            case ROCK -> new Rock();
            case PAPER -> new Paper();
            case SCISSORS -> new Scissors();
        };
    }
}
