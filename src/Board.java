public class Board {
    private Square [][] board;



    public Board(Square[][] board)
    {
        this.resetBoard();
    }


    public Square getSquare(int row, int col)
    {
        return board[row][col];
    }
    public void resetBoard()
    {
        // for every locaiton that SHOULd have a piece on boaad, set that location equal to a new swuare with a new piece.
        // do the same for rows 2-6 but give the new square a null piece to basically erase the piece that was there.
    }
    public void drawBoard()
    {

    }
}
