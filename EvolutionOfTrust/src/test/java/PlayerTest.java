import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    @Test
    public void shouldReturnCooperateAlways() {

        PlayerMove playerMove = new Player(PlayerMove.COOPERATE).getMove();

        assertEquals(PlayerMove.COOPERATE, playerMove);
    }


}
