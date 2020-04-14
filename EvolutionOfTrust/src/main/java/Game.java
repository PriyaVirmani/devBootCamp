public class Game {

    private  RuleEngine ruleEngine ;
    private Player playerOne;
    private Player playerTwo;
    private int[] scoreBoard = new int[2];

    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        ruleEngine = new RuleEngine();
    }

    public int [] getScore(){
        this.scoreBoard = ruleEngine.calculateScoreBasedOnMOve(this.playerOne.getMove(),this.playerTwo.getMove());
         return scoreBoard;
    }
    public void printScoreForEachRound(){
        System.out.println("Player1: "+this.scoreBoard[0]+" Player2: "+this.scoreBoard[1]);
    }

}
