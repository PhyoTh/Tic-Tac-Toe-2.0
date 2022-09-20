public class Board {
    ///////////////////////////////////////////////////////////////////
    // instance variable
    private final char[][] board; // 2D char array for the board

    ///////////////////////////////////////////////////////////////////
    // Constructor
    public Board(int playerCounts) {
        board = new char[playerCounts + 1][playerCounts + 1]; // assign the board size to player+1 x player+1
    }

    ///////////////////////////////////////////////////////////////////
    // methods for board
    /**
     * this will get the 2D char array board
     *
     * @return board[][]
     */
    public char[][] getBoard() {
        return board;
    }

    /**This method add the char of symbol at specific row and col of 2d array
     *
     * @param row - integer
     * @param col - integer
     * @param symbol - character
     */
    public void set(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    /**
     * this method check if all the positions in the board has been placed or not
     *
     * @return true or false
     */
    public Boolean isFullyFilled() {
        for (char[] chars : board) {
            for (char aChar : chars) {
                if (aChar == 0)
                    return false;
            }
        }
        return true;
    }

    /**
     * this method will print the board
     */
    public void print() {
        // print column
        System.out.print("   |");
        for (int i = 0; i < board[0].length; i++) {
            System.out.print(" " + i + " |");
        }
        System.out.println();

        // print "----" for board.length + 1 times
        for (int i = 0; i <= (board[0].length + 1); i++) {
            System.out.print("----");
        }
        System.out.println();

        // print row
        for (int i = 0; i < board.length; i++) {
            System.out.print(" " + i + " |"); // print row number
            for (int j = 0; j < board[i].length; j++) { // print element
                if(board[i][j] == 0 ) // if element is empty
                    System.out.print("   |");
                else // if the element is not empty
                    System.out.print(" " + board[i][j] + " |");
            }
            System.out.println();
            for (int k = 0; k <= (board[i].length + 1); k++) { //print "- - " for board.length + 1 times
                System.out.print("- - ");
            }
            System.out.println();
        }
    }
}