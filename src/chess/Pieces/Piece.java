
package chess.Pieces;

import chess.Square;

public abstract class Piece {

    protected String name;
    protected Color pieceColor;
    protected Square currentSquare;


    public Piece(Color pieceColor) {
        this.pieceColor = pieceColor;


    }

    public String getName() {
        return name;
    }


    public Color getPieceColor() {
        return pieceColor;
    }

    public void setPieceColor(Color pieceColor) {
        this.pieceColor = pieceColor;
    }

    public Square getCurrentSquare() {
        return currentSquare;
    }

    public void setCurrentSquare(Square currentSquare) {
        this.currentSquare = currentSquare;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "name='" + name + '\'' +
                ", pieceColor=" + pieceColor +
                ", currentSquare=" + currentSquare +
                '}';
    }

    /*  private boolean white = false;
    private boolean destroyed = false;
    public abstract boolean viableMove(Square start, Square end, Board board);

    public boolean isDestroyed() {
        return this.destroyed;
    }
    public boolean isWhite() {
        return this.white;
    }
    public void setWhite(boolean white) {
        this.white = white;
    }
    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }

    public Piece(boolean white) {
        this.setWhite(white);*/
    }

