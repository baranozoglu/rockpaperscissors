package model;

import common.Gestures;

public class Paper implements Gesture {

    @Override
    public String getEmoji() {
        return "✋🏻";
    }

    @Override
    public String getName() {
        return Gestures.PAPER.name();
    }

    @Override
    public boolean beats(Gesture gesture) {
        return Gestures.ROCK.name().equals(gesture.getName());
    }
}
