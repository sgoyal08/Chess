import java.util.ArrayList;
public class Player {
    private String name;
    private boolean isWhite;
    private ArrayList<Piece> piecesTaken;

    public Player(String name, Boolean isWhite, ArrayList<Piece> piecesTaken)
    {
        this.name = name;
        this.isWhite = isWhite;
    }

    public String getName() {
        return name;
    }

    public Boolean getSide() {
        return isWhite;
    }
}
