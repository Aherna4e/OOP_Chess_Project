package Pieces;

public class Bishop {
    public class Bishop extends Piece{
        @Override
        public boolean validMove(Square start, Square end, Board board) {
            // checks if move is to a piece of the same color
            if (end.getPiece().isWhite() == this.isWhite()) {
                return false;
            }
            // returns true if the bishop has a valid move
            return (Math.abs(start.getX() - start.getY()) == Math.abs(start.getX() - start.getY()));
        }
        public Bishop(boolean white) {
            super(white);
        }
    }
}
