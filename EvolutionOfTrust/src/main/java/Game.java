public class Game {

    private  RuleEngine ruleEngine ;
    private Player playerOne;
    private Player playerTwo;

    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        ruleEngine = new RuleEngine();
    }

    public int [] getScore(){
         return ruleEngine.calculateScoreBasedOnMOve(this.playerOne.getMove(),this.playerTwo.getMove());
    }

}
