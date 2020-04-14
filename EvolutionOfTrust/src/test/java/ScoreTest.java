import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ScoreTest {
    @Test
    public void shouldUpdateTheScore() {
        Score initialScore = new Score(0, 0);


        Score updatedScore = initialScore.updateScore(-1, 3);

        assertEquals(new Score(-1, 3), updatedScore);
    }
}