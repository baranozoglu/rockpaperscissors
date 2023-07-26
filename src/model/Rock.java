package model;

import common.Gestures;
import gesture.Gesture;

public class Rock implements Gesture {

    @Override
    public String getEmoji() {
        return "✊";
    }

    @Override
    public String getName() {
        return Gestures.ROCK.name();
    }

    @Override
    public boolean beats(Gesture gesture) {
        return Gestures.SCISSORS.name().equals(gesture.getName());
    }
}
