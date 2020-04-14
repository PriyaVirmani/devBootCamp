

public class RuleEngine {

    private  Score playerScoreBoard = new Score(0,0);
    private final static int POINTS_WHEN_ONE_COOP = 1;
    private final static int POINTS_WHEN_ONE_CHEAT = 3;
    private final static int POINTS_WHEN_BOTH_COOP =2;
    public Score calculateScoreBasedOnMOve(PlayerMove playerOneMove , PlayerMove playerTwoMove) {

         if (playerOneMove==PlayerMove.COOPERATE && playerTwoMove == PlayerMove.CHEAT){
             playerScoreBoard=playerScoreBoard.updateScore(-POINTS_WHEN_ONE_COOP, POINTS_WHEN_ONE_CHEAT);


        }
         else if(playerOneMove==PlayerMove.CHEAT && playerTwoMove == PlayerMove.COOPERATE){
             playerScoreBoard=playerScoreBoard.updateScore(POINTS_WHEN_ONE_CHEAT,-POINTS_WHEN_ONE_COOP);

         }

        else if (playerOneMove==PlayerMove.COOPERATE && playerTwoMove == PlayerMove.COOPERATE){
            playerScoreBoard=playerScoreBoard.updateScore(POINTS_WHEN_BOTH_COOP,POINTS_WHEN_BOTH_COOP);

        }
        return playerScoreBoard;
    }


}
