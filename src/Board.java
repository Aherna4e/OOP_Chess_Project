public class Board {
    square [][] gameBoard;
    public void resetBoard()
    {
        // initialize white pieces
        gameBoard[0][0] = new square(0, 0, new Rook(true));
        gameBoard[0][1] = new square(0, 1, new Knight(true));
        gameBoard[0][2] = new square(0, 2, new Bishop(true));
        //...
        gameBoard[1][0] = new square(1, 0, new Pawn(true));
        gameBoard[1][1] = new square(1, 1, new Pawn(true));
        //...

        // initialize black pieces
        gameBoard[7][0] = new square(7, 0, new Rook(false));
        gameBoard[7][1] = new square(7, 1, new Knight(false));
        gameBoard[7][2] = new square(7, 2, new Bishop(false));
        //...
        gameBoard[6][0] = new square(6, 0, new Pawn(false));
        gameBoard[6][1] = new square(6, 1, new Pawn(false));
        //...

        // initialize remaining boxes without any piece
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                square[i][j] = new square(i, j, null);
            }
        }
    }
}
