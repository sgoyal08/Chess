public class Piece {
    private boolean isWhite;
    private boolean isTaken;

    public Piece(boolean isWhite)
    {
        this.isWhite = isWhite;
    }

    public void setTaken() {
        isTaken = true;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public boolean isValidMove()
    {
        return false;
    }
}
