import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RuleEngineTest {

    RuleEngine ruleEngine = new RuleEngine();

    @Test
    public void testIfPlayerOneCooperatePlayerTwoCheat() {

        Score playerScoreBoard = ruleEngine.calculateScoreBasedOnMOve(PlayerMove.COOPERATE, PlayerMove.CHEAT);

        assertEquals(new Score(-1,3), playerScoreBoard);

    }

    @Test
    public void testIfPlayerOneCheatPlayerTwoCooperate() {

        Score playerScoreBoard = ruleEngine.calculateScoreBasedOnMOve(PlayerMove.CHEAT, PlayerMove.COOPERATE);

        assertEquals(new Score(3,-1), playerScoreBoard);

    }

    @Test
    public void testIfBothPlayersCheat() {

        Score playerScoreBoard = ruleEngine.calculateScoreBasedOnMOve(PlayerMove.CHEAT, PlayerMove.CHEAT);

        assertEquals(new Score(0,0), playerScoreBoard);

    }

    @Test
    public void testIfBothPlayersCooperate() {

        Score playerScoreBoard = ruleEngine.calculateScoreBasedOnMOve(PlayerMove.COOPERATE, PlayerMove.COOPERATE);

        assertEquals(new Score(2,2), playerScoreBoard);
    }

    @Test
    public void afterFourMovesOfEachPlayer(){
        ruleEngine.calculateScoreBasedOnMOve(PlayerMove.COOPERATE,PlayerMove.COOPERATE);
        ruleEngine.calculateScoreBasedOnMOve(PlayerMove.COOPERATE,PlayerMove.COOPERATE);
        ruleEngine.calculateScoreBasedOnMOve(PlayerMove.COOPERATE,PlayerMove.COOPERATE);
        ruleEngine.calculateScoreBasedOnMOve(PlayerMove.COOPERATE,PlayerMove.COOPERATE);
        Score playerScoreBoard=ruleEngine.calculateScoreBasedOnMOve(PlayerMove.COOPERATE,PlayerMove.COOPERATE);
        assertEquals(new Score(10,10),playerScoreBoard);
    }


}
