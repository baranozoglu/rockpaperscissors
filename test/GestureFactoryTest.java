import exceptions.IllegalGestureException;
import gesture.Gesture;
import model.Paper;
import model.Rock;
import model.Scissors;
import org.junit.Assert;
import org.junit.Test;

import static gesture.GestureFactory.createGesture;
import static service.UserService.getUserChoice;

public class GestureFactoryTest {

    @Test
    public void test_getUserChoice_Rock() {
        Gesture actualGestureFromString = createGesture("rock");
        Gesture actualGestureFromCapitalString = createGesture("rock");
        Gesture actualGestureFromNumber = createGesture("1");
        Gesture expectedGesture = new Rock();

        Assert.assertEquals(actualGestureFromString.getClass(), expectedGesture.getClass());
        Assert.assertEquals(actualGestureFromCapitalString.getClass(), expectedGesture.getClass());
        Assert.assertEquals(actualGestureFromNumber.getClass(), expectedGesture.getClass());
    }

    @Test
    public void test_getUserChoice_Paper() {
        Gesture actualGestureFromString = createGesture("paper");
        Gesture actualGestureFromCapitalString = createGesture("paper");
        Gesture actualGestureFromNumber = createGesture("2");
        Gesture expectedGesture = new Paper();

        Assert.assertEquals(actualGestureFromString.getClass(), expectedGesture.getClass());
        Assert.assertEquals(actualGestureFromCapitalString.getClass(), expectedGesture.getClass());
        Assert.assertEquals(actualGestureFromNumber.getClass(), expectedGesture.getClass());
    }

    @Test
    public void test_getUserChoice_Scissors() {
        Gesture actualGestureFromString = createGesture("scissors");
        Gesture actualGestureFromCapitalString = createGesture("SCISSORS");
        Gesture actualGestureFromNumber = createGesture("3");
        Gesture expectedGesture = new Scissors();

        Assert.assertEquals(actualGestureFromString.getClass(), expectedGesture.getClass());
        Assert.assertEquals(actualGestureFromCapitalString.getClass(), expectedGesture.getClass());
        Assert.assertEquals(actualGestureFromNumber.getClass(), expectedGesture.getClass());
    }

    @Test(expected = IllegalGestureException.class)
    public void test_getUserChoice_Invalid() {
        getUserChoice("baran");
    }

}
