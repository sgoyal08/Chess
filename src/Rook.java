//public class Rook extends Piece{
//    public Rook(boolean isWhite)
//    {
//        super(isWhite);
//    }
//
//    @Override
//    public boolean isValidMove(Board board, Square start, Square end)
//    {
//        // BEFORE ALL, if am in check, DONT MOVE
//
//
//        if ((start == end) || (Math.abs(end.getRow() - start.getRow()) != Math.abs(start.getCol() - end.getCol()))) {
//            return false;
//        }
//        int incrementRow = (end.getRow() > start.getRow()) ? 1 : -1;
//        int incrementCol = (end.getCol() > start.getCol()) ? 1 : -1;
//        int r = incrementRow + start.getRow();
//        int c = incrementCol + start.getCol();
//        while (board.getSquare(r, c) != end)
//        {
//            if (board.getSquare(r,c).getPiece() != null)
//            {
//                return false;
//            }
//            r = r + incrementRow;
//            c = c + incrementCol;
//        }
//        if (end.getPiece() != null)
//        {
//            if ((end.getPiece().isWhite() && this.isWhite()) || (!end.getPiece().isWhite() && !this.isWhite()))
//            {
//                return false;
//            }
//            end.getPiece().setTaken();
//            end.setPiece(this);
//
//        }
//        return true;
//    }
//}
