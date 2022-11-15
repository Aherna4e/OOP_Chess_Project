public class Board {
    Square [][] gameBoard = new Square[8][8];
    //commment to push smth

    public Board(){
        for(int i = 0; i < gameBoard.length; i++){
            int temp = 0;
            SquareColor currColor = (i % 2==0) ? SquareColor.white : SquareColor.brown;
            for(Enum column: Enum.values()){
                Square newSquare = new Square(currColor, new Location(column,i)); //cahnge to stupider
                gameBoard[i][temp] = newSquare;
                currColor = (currColor == SquareColor.brown) ? SquareColor.white : SquareColor.brown;
                temp++
            }
        }
    }



}
