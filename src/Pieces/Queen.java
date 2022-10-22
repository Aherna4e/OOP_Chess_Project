package Pieces;
public class Queen extends Piece{
    @Override
    public boolean validMove(Square start, Square end, Board board) {
        // checks if move is to a piece of the same color
        if (end.getPiece().isWhite() == this.isWhite()) {
            return false;
        }
        // returns true if the queen has a valid move (bishop+rook logic combined)
        return (start.getX() == end.getX() || start.getY() == end.getY()
                || Math.abs(start.getX() - end.getX()) == Math.abs(start.getY() - end.getY()));
    }
    public Queen(boolean white) {
        super(white);
    }
}