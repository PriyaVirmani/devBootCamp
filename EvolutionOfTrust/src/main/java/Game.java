public class Game {

    private  RuleEngine ruleEngine ;
    private Player playerOne;
    private Player playerTwo;
    private Score scoreBoard = new Score(0,0);

    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        ruleEngine = new RuleEngine();
    }

    public Score getScore(){
        this.scoreBoard = ruleEngine.calculateScoreBasedOnMOve(this.playerOne.getMove(),this.playerTwo.getMove());
         return this.scoreBoard;
    }
    public void printScoreForEachRound(){
        System.out.println("Player1 and Player 2 score "+this.scoreBoard.toString());
    }

}
