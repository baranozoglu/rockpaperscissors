package model;

import common.Gestures;
import gesture.Gesture;

import java.util.Objects;

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
        return Objects.equals(Gestures.PAPER.name(), gesture.getName());
    }
}
