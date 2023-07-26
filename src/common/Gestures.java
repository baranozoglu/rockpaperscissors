package common;

import exceptions.IllegalGestureException;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Predicate;

public enum Gestures {
    ROCK(1L), PAPER(2L), SCISSORS(3L);
    private static final Random rand = new Random();
    private Long id;

    Gestures(Long id) {
        this.id = id;
    }

    public static Gestures getGestureByInput(String input) {
        return Arrays.stream(Gestures.values())
                .filter(getGesturesPredicate(input))
                .findFirst()
                .orElseThrow(() -> new IllegalGestureException(input));
    }

    public static boolean contains(String input) {
        return Arrays.stream(Gestures.values())
                .anyMatch(getGesturesPredicate(input));
    }

    public static Gestures determineComputerChoice() {
        return Gestures.values()[rand.nextInt(Gestures.values().length)];
    }

    private static Predicate<Gestures> getGesturesPredicate(String input) {
        return option -> option.name().equalsIgnoreCase(input) ||
                option.getId().toString().equals(input);
    }

    public Long getId() {
        return id;
    }
}
