import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RuleEngineTest {

    RuleEngine ruleEngine =new RuleEngine();
    @Test
    public void testIfPlayerOneCooperatePlayerTwoCheat(){

        int [] scores=ruleEngine.calculateScoreBasedOnMOve(PlayerMove.COOPERATE,PlayerMove.CHEAT);

        assertEquals(-1,scores[0]);
        assertEquals(3,scores[1]);

    }
    @Test
    public void testIfPlayerOneCheatPlayerTwoCooperate(){

        int [] scores= ruleEngine.calculateScoreBasedOnMOve(PlayerMove.CHEAT,PlayerMove.COOPERATE);

        assertEquals(3,scores[0]);
        assertEquals(-1,scores[1]);
    }
    @Test
    public void testIfBothPlayersCheat(){

        int [] scores=ruleEngine.calculateScoreBasedOnMOve(PlayerMove.CHEAT,PlayerMove.CHEAT);

        assertEquals(0,scores[0]);
        assertEquals(0,scores[1]);

    }
    @Test
    public void testIfBothPlayersCooperate(){

        int [] scores=ruleEngine.calculateScoreBasedOnMOve(PlayerMove.COOPERATE,PlayerMove.COOPERATE);
        
        assertEquals(2, scores[0]);
        assertEquals(2, scores[1]);
    }

    @Test
    public void afterFourMovesOfEachPlayer(){
        int [] scores;
        ruleEngine.calculateScoreBasedOnMOve(PlayerMove.COOPERATE,PlayerMove.COOPERATE);
        ruleEngine.calculateScoreBasedOnMOve(PlayerMove.COOPERATE,PlayerMove.CHEAT);
        ruleEngine.calculateScoreBasedOnMOve(PlayerMove.CHEAT,PlayerMove.COOPERATE);
        scores=ruleEngine.calculateScoreBasedOnMOve(PlayerMove.CHEAT,PlayerMove.CHEAT);
        assertEquals(4,scores[0]);
        assertEquals(4,scores[1]);
    }


}
