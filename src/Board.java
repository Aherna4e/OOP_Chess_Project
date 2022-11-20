public class Board {
    private static final int BOARD_LENGTH = 8;
    Square [][] gameBoard = new Square[BOARD_LENGTH][BOARD_LENGTH];
    //commment to push smth

    public Board(){
        for(int i = 0; i < gameBoard.length; i++){
            int temp = 0;
            SquareColor currColor = (i % 2==0) ? SquareColor.white : SquareColor.brown;
            for(Enum column: Enum.values()){
                Square newSquare = new Square(currColor, new Location(column,BOARD_LENGTH- i)); //cahnge to stupider
                gameBoard[i][temp] = newSquare;
                currColor = (currColor == SquareColor.brown) ? SquareColor.white : SquareColor.brown;
                temp++;
            }
        }
    }

    public void displayBoard(){
        for(Square[] row :gameBoard){
            for (Square square : row){
                System.out.print(square);
            }
            System.out.println();
        }
    }

}
