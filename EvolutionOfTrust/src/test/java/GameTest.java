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
}
