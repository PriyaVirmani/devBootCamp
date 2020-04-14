public class Game {

    RuleEngine ruleEngine = new RuleEngine();
    Player playerOne = new Player();
    Player playerTwo= new Player();
    public int [] getScoreOfPlayers(){
         return ruleEngine.calculateScoreBasedOnMOve(playerOne.getMove(),playerTwo.getMove());
    }

}
