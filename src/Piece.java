public class Piece {
    private boolean isWhite;
    private String typePiece;

    public Piece(String typePiece)
    {
        this.typePiece = typePiece;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public boolean isValidMove()
    {
        return false;
    }
}
