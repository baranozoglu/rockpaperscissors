package gesture;

public interface Gesture {
    String getEmoji();

    String getName();

    boolean beats(Gesture gesture);
}
