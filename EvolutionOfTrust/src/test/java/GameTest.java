import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    @Test
    public void shouldReturnScoreIfBothPlayersCooperate() {
        Player playerOne = new Player(PlayerMove.COOPERATE);
        Player playerTwo = new Player(PlayerMove.COOPERATE);

        Score playerScoreBoard = new Game(playerOne, playerTwo).getScore();

        assertEquals(new Score(2,2), playerScoreBoard);

    }

    @Test
    public void shouldReturnOutputOfAllRounds() {
        Player playerOne = new Player(PlayerMove.COOPERATE);
        Player playerTwo = new Player(PlayerMove.COOPERATE);
        Game game   = new Game(playerOne,playerTwo);


        Score roundOne = game.getScore();
        game.printScoreForEachRound();
        Score roundTwo = game.getScore();
        game.printScoreForEachRound();
        Score roundThree = game.getScore();
        game.printScoreForEachRound();
        Score roundFour = game.getScore();
        game.printScoreForEachRound();


        assertEquals(new Score(2,2), roundOne);
        assertEquals(new Score(4,4), roundTwo);
        assertEquals(new Score(6,6), roundThree);
        assertEquals(new Score(8,8), roundFour);

    }
    @Test
    public void shouldReturnOutputCheatAndCooperate(){

        Player cheater = new Player(PlayerMove.CHEAT);
        Player coOperate = new Player(PlayerMove.COOPERATE);
        Game game   = new Game(coOperate,cheater);


        Score roundOne = game.getScore();
        game.printScoreForEachRound();
        Score roundTwo = game.getScore();
        game.printScoreForEachRound();
        Score roundThree = game.getScore();
        game.printScoreForEachRound();
        Score roundFour = game.getScore();
        game.printScoreForEachRound();


        assertEquals(new Score(-1,3), roundOne);
        assertEquals(new Score(-2,6), roundTwo);
        assertEquals(new Score(-3,9), roundThree);
        assertEquals(new Score(-4,12), roundFour);









    }
}
