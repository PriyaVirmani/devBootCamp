import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    @Test
    public void shouldReturnScoreIfBothPlayersCoop(){
        int[] scores =  new Game().getScoreOfPlayers();
        assertEquals(2,scores[0]);
        assertEquals(2,scores[1]);
    }
}
