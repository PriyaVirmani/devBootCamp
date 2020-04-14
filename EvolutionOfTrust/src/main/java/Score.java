import java.util.Objects;

public class Score {
    private final int playerOneScore ,playerTwoScore;

    public Score(int playerOneScore, int playerTwoScore) {
        this.playerOneScore = playerOneScore;
        this.playerTwoScore = playerTwoScore;
    }

    public Score updateScore(int updatedPlayerOneScore, int updatedPlayerTwoScore) {

        return new Score(this.playerOneScore + updatedPlayerOneScore,this.playerTwoScore + updatedPlayerTwoScore);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Score score = (Score) o;
        return playerOneScore == score.playerOneScore &&
                playerTwoScore == score.playerTwoScore;
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerOneScore, playerTwoScore);
    }

    @Override
    public String toString() {
        return "Score{" +
                "playerOneScore=" + playerOneScore +
                ", playerTwoScore=" + playerTwoScore +
                '}';
    }
}
