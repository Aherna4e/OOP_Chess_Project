
package chess.Pieces;

public class Bishop extends Piece{
        public Bishop(Color color){
            super(color);
            this.name = "Bishop";
        }



/*        @Override
        public boolean validMove(Square start, Square end, Board board) {
            // checks if move is to a piece of the same color
            if (end.getPiece().isWhite() == this.isWhite()) {
                return false;
            }
            // returns true if the bishop has a valid move
            return (Math.abs(start.getX() - end.getX()) == Math.abs(start.getY() - end.getY()));
        }
        public Bishop(boolean white) {
            super(white);
        }
    }*/
}
