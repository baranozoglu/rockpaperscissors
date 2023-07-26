package model;

import common.Gestures;
import gesture.Gesture;

import java.util.Objects;

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
        return Objects.equals(Gestures.SCISSORS.name(), gesture.getName());

    }
}
