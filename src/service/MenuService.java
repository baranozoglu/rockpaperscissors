package service;

import common.Gestures;

import static common.MessageProperties.*;


public class MenuService {
    private MenuService() {
    }

    public static void showMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append(SEPARATOR + OPTIONS);
        for (Gestures option : Gestures.values()) {
            appendOption(sb, option);
        }
        System.out.println(sb.append(SEPARATOR + EXPLANATION));
    }


    public static void warnUserForValidInput() {
        System.out.println(WARN);
    }

    public static void showHandShake() {
        System.out.print(HAND_SHAKE);
        for (int x = 3; x >= 1; x--) {
            System.out.print(x + THREE_DOTS);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
        System.out.println(EXCLAMATION_MARK);
    }

    public static void showPlayerMakeDecision() {
        System.out.print(PLAYER_MAKE);
    }

    private static void appendOption(StringBuilder sb, Gestures option) {
        sb.append(option.getId()).append(".").append(option.name()).append("\n");
    }
}
