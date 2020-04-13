import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvalutionOfTrustTest {
    private int CHEAT=0;
    private int COOPERATE=1;
    Players player =new Players();
    @Test
    public void ifPlayerOneCooperatePlayerTwoCheat(){
        player.calculateScoreBasedOnMOve(COOPERATE,CHEAT);
        int [] scores = player.getScoreBoard();
        assertEquals(-1,scores[0]);
        assertEquals(3,scores[1]);

    }
    @Test
    public void ifPlayerOneCheatPlayerTwoCooperate(){
        player.calculateScoreBasedOnMOve(CHEAT,COOPERATE);
        int [] scores = player.getScoreBoard();
       assertEquals(3,scores[0]);
        assertEquals(-1,scores[1]);
    }
    @Test
    public void ifBothPlayersCheat(){
        player.calculateScoreBasedOnMOve(CHEAT,CHEAT);
        int [] scores = player.getScoreBoard();
        assertEquals(0,scores[0]);
        assertEquals(0,scores[1]);

    }
    @Test
    public void ifBothPlayersCooperate(){
        player.calculateScoreBasedOnMOve(COOPERATE,COOPERATE);
        int [] scores = player.getScoreBoard();
        assertEquals(2,scores[0]);
        assertEquals(2,scores[1]);
    }

    @Test
    public void afterFourMovesOfEachPlayer(){
        player.calculateScoreBasedOnMOve(COOPERATE,COOPERATE);
        player.calculateScoreBasedOnMOve(COOPERATE,CHEAT);
        player.calculateScoreBasedOnMOve(CHEAT,COOPERATE);
        player.calculateScoreBasedOnMOve(CHEAT,CHEAT);
        int [] scores = player.getScoreBoard();
        assertEquals(4,scores[0]);
        assertEquals(4,scores[1]);
    }
}
