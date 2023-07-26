package model;

import common.Gestures;

public class Scissors implements Gesture {

    @Override
    public String getEmoji() {
        return "✌️";
    }

    @Override
    public String getName() {
        return Gestures.SCISSORS.name();
    }

    @Override
    public boolean beats(Gesture gesture) {
        return Gestures.PAPER.name().equals(gesture.getName());
    }
}
