import model.Gesture;
import model.Paper;
import model.Rock;
import model.Scissors;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static common.MessageProperties.*;
import static service.DecisionService.determineAndPrintWinner;

public class DecisionServiceTest {
    private Paper paper;
    private Rock rock;
    private Scissors scissors;

    @Before
    public void setUp() {
        paper = new Paper();
        rock = new Rock();
        scissors = new Scissors();
    }

    @Test
    public void test_determineWinner_Tie() {
        String rockTie = determineAndPrintWinner(rock, rock);
        String paperTie = determineAndPrintWinner(paper, paper);
        String scissorsTie = determineAndPrintWinner(scissors, scissors);

        Assert.assertEquals(rockTie, getStringOutput(TIE, rock, rock));
        Assert.assertEquals(paperTie, getStringOutput(TIE, paper, paper));
        Assert.assertEquals(scissorsTie, getStringOutput(TIE, scissors, scissors));
    }

    @Test
    public void test_determineWinner_RockWin() {
        String rockWin = determineAndPrintWinner(rock, scissors);
        String rockWin2 = determineAndPrintWinner(scissors, rock);

        Assert.assertEquals(rockWin, getStringOutput(YOU_LOST, rock, scissors));
        Assert.assertEquals(rockWin2, getStringOutput(YOU_WON, scissors, rock));
    }

    @Test
    public void test_determineWinner_PaperWin() {
        String paperWin = determineAndPrintWinner(paper, rock);
        String paperWin2 = determineAndPrintWinner(rock, paper);

        Assert.assertEquals(paperWin, getStringOutput(YOU_LOST, paper, rock));
        Assert.assertEquals(paperWin2, getStringOutput(YOU_WON, rock, paper));
    }

    @Test
    public void test_determineWinner_ScissorsWin() {
        String scissorsWin = determineAndPrintWinner(scissors, paper);
        String scissorsWin2 = determineAndPrintWinner(paper, scissors);

        Assert.assertEquals(scissorsWin, getStringOutput(YOU_LOST, scissors, paper));
        Assert.assertEquals(scissorsWin2, getStringOutput(YOU_WON, paper, scissors));
    }

    private String getStringOutput(String message, Gesture computerChoice, Gesture userChoice) {
        return String.format(message,
                computerChoice.getName(),
                computerChoice.getEmoji(),
                userChoice.getName(),
                userChoice.getEmoji()
        );
    }
}
