

public class Players {
    private final static int CHEAT=0;
    private final static int COOPERATE=1;
    private  int playerScoreBoard[] = new int[2];
    private final static int POINTS_WHEN_ONE_COOP = 1;
    private final static int POINTS_WHEN_ONE_CHEAT = 3;
    private final static int POINTS_WHEN_BOTH_COOP =2;
    public void calculateScoreBasedOnMOve(int playerOneMove , int playerTwoMove) {

         if (playerOneMove==COOPERATE && playerTwoMove == CHEAT){
                 playerScoreBoard[0] = playerScoreBoard[0] - POINTS_WHEN_ONE_COOP;
                 playerScoreBoard[1] = playerScoreBoard[1] + POINTS_WHEN_ONE_CHEAT;
        }
         else if(playerOneMove==CHEAT && playerTwoMove == COOPERATE){
             playerScoreBoard[0] = playerScoreBoard[0] + POINTS_WHEN_ONE_CHEAT;
             playerScoreBoard[1] = playerScoreBoard[1] - POINTS_WHEN_ONE_COOP;
         }

        else if (playerOneMove==COOPERATE && playerTwoMove == COOPERATE){
             playerScoreBoard[0] = playerScoreBoard[0] + POINTS_WHEN_BOTH_COOP;
             playerScoreBoard[1] = playerScoreBoard[1] + POINTS_WHEN_BOTH_COOP;
        }
    }

    public int[] getScoreBoard(){
        return playerScoreBoard;
    }
}
