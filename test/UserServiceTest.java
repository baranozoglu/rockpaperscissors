import common.Gestures;
import exceptions.IllegalGestureException;
import org.junit.Assert;
import org.junit.Test;

import static service.UserService.getUserChoice;

public class UserServiceTest {

    @Test
    public void test_getUserChoice_Rock() {
        Gestures actualGestureFromString = getUserChoice("rock");
        Gestures actualGestureFromNumber = getUserChoice("1");
        Gestures expectedGesture = Gestures.ROCK;

        Assert.assertEquals(actualGestureFromString, expectedGesture);
        Assert.assertEquals(actualGestureFromNumber, expectedGesture);
    }

    @Test
    public void test_getUserChoice_Paper() {
        Gestures actualGestureFromString = getUserChoice("paper");
        Gestures actualGestureFromNumber = getUserChoice("2");
        Gestures expectedGesture = Gestures.PAPER;

        Assert.assertEquals(actualGestureFromString, expectedGesture);
        Assert.assertEquals(actualGestureFromNumber, expectedGesture);
    }

    @Test
    public void test_getUserChoice_Scissors() {
        Gestures actualGestureFromString = getUserChoice("scissors");
        Gestures actualGestureFromNumber = getUserChoice("3");
        Gestures expectedGesture = Gestures.SCISSORS;

        Assert.assertEquals(actualGestureFromString, expectedGesture);
        Assert.assertEquals(actualGestureFromNumber, expectedGesture);
    }

    @Test(expected = IllegalGestureException.class)
    public void test_getUserChoice_Invalid() {
        getUserChoice("baran");
    }


}
