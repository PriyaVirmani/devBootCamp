public class Player {

    private PlayerMove moveType;

    public Player(PlayerMove moveType) {

        this.moveType = moveType;
    }

    public PlayerMove getMove() {
         return moveType;

    }
}

