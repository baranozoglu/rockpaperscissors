package model;

import common.Gestures;
import gesture.Gesture;

import java.util.Objects;

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
        return Objects.equals(Gestures.ROCK.name(), gesture.getName());
    }
}
