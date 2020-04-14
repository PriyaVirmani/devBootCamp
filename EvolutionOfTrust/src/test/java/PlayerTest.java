import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    @Test
    public void shouldReturnCooperateAlways() {

        PlayerMove playerMove = new Player().getMove();

        assertEquals(PlayerMove.COOPERATE, playerMove);
    }

}
