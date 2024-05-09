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
//    REMMEBR TO PUT IN NOTES ABOUT CONTENT STANDARDAS LATER!!!!! U HAVE TO HIT AS MANY AS POSSIBLE!!!!!!!!!!!
    public boolean isWhite() {
        return isWhite;
    }

    public boolean isValidMove()
    {
        return false;
    }
}
