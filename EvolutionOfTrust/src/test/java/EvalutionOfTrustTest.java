import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvalutionOfTrustTest {

    RuleEngine ruleEngine =new RuleEngine();
    @Test
    public void ifPlayerOneCooperatePlayerTwoCheat(){
        ruleEngine.calculateScoreBasedOnMOve(PlayerMove.COOPERATE,PlayerMove.CHEAT);
        int [] scores = ruleEngine.getScoreBoard();
        assertEquals(-1,scores[0]);
        assertEquals(3,scores[1]);

    }
    @Test
    public void ifPlayerOneCheatPlayerTwoCooperate(){
        ruleEngine.calculateScoreBasedOnMOve(PlayerMove.CHEAT,PlayerMove.COOPERATE);
        int [] scores = ruleEngine.getScoreBoard();
       assertEquals(3,scores[0]);
        assertEquals(-1,scores[1]);
    }
    @Test
    public void ifBothPlayersCheat(){
        ruleEngine.calculateScoreBasedOnMOve(PlayerMove.CHEAT,PlayerMove.CHEAT);
        int [] scores = ruleEngine.getScoreBoard();
        assertEquals(0,scores[0]);

        assertEquals(0,scores[1]);

    }
    @Test
    public void ifBothPlayersCooperate(){
        ruleEngine.calculateScoreBasedOnMOve(PlayerMove.COOPERATE,PlayerMove.COOPERATE);
        int [] scores = ruleEngine.getScoreBoard();
        assertEquals(2,scores[0]);
        assertEquals(2,scores[1]);
    }

    @Test
    public void afterFourMovesOfEachPlayer(){
        ruleEngine.calculateScoreBasedOnMOve(PlayerMove.COOPERATE,PlayerMove.COOPERATE);
        ruleEngine.calculateScoreBasedOnMOve(PlayerMove.COOPERATE,PlayerMove.CHEAT);
        ruleEngine.calculateScoreBasedOnMOve(PlayerMove.CHEAT,PlayerMove.COOPERATE);
        ruleEngine.calculateScoreBasedOnMOve(PlayerMove.CHEAT,PlayerMove.CHEAT);
        int [] scores = ruleEngine.getScoreBoard();
        assertEquals(4,scores[0]);
        assertEquals(4,scores[1]);
    }
    @Test
    public void ifCoolPlayersCooperate(){
        Player coolPlayer1 = new Player();
        Player coolPlayer2 = new Player();
        ruleEngine.calculateScoreBasedOnMOve(coolPlayer1.getMove(),coolPlayer2.getMove());
        int [] scores = ruleEngine.getScoreBoard();
        assertEquals(2,scores[0]);
        assertEquals(2,scores[1]);


    }
}
