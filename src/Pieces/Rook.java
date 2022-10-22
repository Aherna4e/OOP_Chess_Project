package Pieces;
public class Rook extends Piece{
    @Override
    public boolean validMove(Square start, Square end, Board board) {
        // checks if move is to a piece of the same color
        if (end.getPiece().isWhite() == this.isWhite()) {
            return false;
        }
        // returns true if the rook has a valid move
        return (start.getX() == end.getX() || start.getY() == end.getY());
    }
    public Rook(boolean white) {
        super(white);
    }
}