package chess;

import chess.Pieces.Piece;

public class Square {
    private SquareColor sColor;
    private Location location;
    private boolean isTaken;
    private Piece currentPiece;

    public Square(SquareColor sColor, Location location){
        this.sColor = sColor;
        this.location = location;
        this.isTaken = false;
    }

    public void reset()
    {
        this.isTaken = false;
        this.currentPiece = null;
    }

    public Piece getCurrentPiece() {
        return currentPiece;
    }

    public void setCurrentPiece(Piece currentPiece) {
        this.currentPiece = currentPiece;
    }

    public void setTaken(boolean taken) {
        isTaken = taken;
    }

    public SquareColor getsColor() {
        return sColor;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sColor=" + sColor +
                ", location=" + location +
                ", isTaken=" + isTaken +
                '}';
    }

    public boolean isTaken() {
        return isTaken;
    }
}
