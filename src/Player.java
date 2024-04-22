import java.util.ArrayList;
public class Player {
    private String name;
    private String side;
    private ArrayList<Piece> pieces;

    public Player(String name, String side, ArrayList<Piece> pieces)
    {
        this.name = name;
        this.side = side;
        // add all pieces to arraylist depending on which ones havent been taken yet.
    }

    public String getName() {
        return name;
    }

    public String getSide() {
        return side;
    }
}
