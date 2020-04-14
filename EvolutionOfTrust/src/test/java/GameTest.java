import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    @Test
    public void shouldReturnScoreIfBothPlayersCooperate() {
        Player playerOne = new Player();
        Player playerTwo = new Player();

        int[] scores = new Game(playerOne, playerTwo).getScore();

        assertEquals(2, scores[0]);
        assertEquals(2, scores[1]);
    }

    @Test
    public void shouldReturnOutputOfAllRounds() {
        Player playerOne = new Player();
        Player playerTwo = new Player();
        Game game   = new Game(playerOne,playerTwo);

        int[] roundOne = game.getScore();
        game.printScoreForEachRound();
        int [] roundTwo = game.getScore();
        game.printScoreForEachRound();
        int [] roundThree = game.getScore();
        game.printScoreForEachRound();
        int[] roundFour = game.getScore();
        game.printScoreForEachRound();


        assertEquals(2, roundOne[0]);
        assertEquals(2, roundOne[1]);
        assertEquals(4, roundTwo[0]);
        assertEquals(4, roundTwo[1]);
        assertEquals(6, roundThree[0]);
        assertEquals(6, roundThree[1]);
        assertEquals(8, roundFour[0]);
        assertEquals(8, roundFour[1]);

    }
}
