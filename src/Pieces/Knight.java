/*package Pieces;

public class Knight extends Piece{
    @Override
    public boolean validMove(Square start, Square end, Board board) {
        // checks if move is to a piece of the same color
        if (end.getPiece().isWhite() == this.isWhite()) {
            return false;
        }
        // returns true if the knight has a valid move
        return (Math.abs(start.getX() - end.getX()) * Math.abs(start.getY() - end.getY()) == 2);
    }
    public Knight(boolean white) {
        super(white);
    }
}
*/