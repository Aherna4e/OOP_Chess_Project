package chess;

import chess.Pieces.Piece;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private static final int BOARD_LENGTH = 8;
    private final Map<Location, Square> locationSquareMap;
    Square [][] gameBoard = new Square[BOARD_LENGTH][BOARD_LENGTH];
    //commment to push smth

    public Board(){
        locationSquareMap = new HashMap<>();
        for(int i = 0; i < gameBoard.length; i++){
            int temp = 0;
            SquareColor currColor = (i % 2==0) ? SquareColor.white : SquareColor.brown;
            for(Enum column: Enum.values()){
                Square newSquare = new Square(currColor, new Location(column,BOARD_LENGTH- i)); //cahnge to stupider
                locationSquareMap.put(newSquare.getLocation(), newSquare);
                gameBoard[i][temp] = newSquare;
                currColor = (currColor == SquareColor.brown) ? SquareColor.white : SquareColor.brown;
                temp++;
            }
        }
    }
    public Map<Location, Square>getLocationSquareMap(){
        return locationSquareMap;
    }
    public void displayBoard(){
        for(Square[] row :gameBoard){
            for (Square square : row){
                System.out.print(square);
            }
            System.out.println();
        }
    }
    public void printBoard() {
        for(int i = 0; i < gameBoard.length; i++) {
            System.out.print(BOARD_LENGTH - i + " ");
            for(int j = 0; j < gameBoard[i].length; j++) {
                if (gameBoard[i][j].isTaken()) {
                    Piece piece = gameBoard[i][j].getCurrentPiece();
                    System.out.print(piece.getName().charAt(0) + " ");
                } else {
                    // empty square
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.print("  ");
        for(Enum file : Enum.values()) {
            System.out.print(file.name() + " ");
        }
        System.out.println();
    }

}
