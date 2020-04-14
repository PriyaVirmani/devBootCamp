

public class RuleEngine {

    private  int playerScoreBoard[] = new int[2];
    private final static int POINTS_WHEN_ONE_COOP = 1;
    private final static int POINTS_WHEN_ONE_CHEAT = 3;
    private final static int POINTS_WHEN_BOTH_COOP =2;
    public void calculateScoreBasedOnMOve(PlayerMove playerOneMove , PlayerMove playerTwoMove) {

         if (playerOneMove==PlayerMove.COOPERATE && playerTwoMove == PlayerMove.CHEAT){
                 playerScoreBoard[0] = playerScoreBoard[0] - POINTS_WHEN_ONE_COOP;
                 playerScoreBoard[1] = playerScoreBoard[1] + POINTS_WHEN_ONE_CHEAT;
        }
         else if(playerOneMove==PlayerMove.CHEAT && playerTwoMove == PlayerMove.COOPERATE){
             playerScoreBoard[0] = playerScoreBoard[0] + POINTS_WHEN_ONE_CHEAT;
             playerScoreBoard[1] = playerScoreBoard[1] - POINTS_WHEN_ONE_COOP;
         }

        else if (playerOneMove==PlayerMove.COOPERATE && playerTwoMove == PlayerMove.COOPERATE){
             playerScoreBoard[0] = playerScoreBoard[0] + POINTS_WHEN_BOTH_COOP;
             playerScoreBoard[1] = playerScoreBoard[1] + POINTS_WHEN_BOTH_COOP;
        }
    }

    public int[] getScoreBoard(){
        return playerScoreBoard;
    }
}
