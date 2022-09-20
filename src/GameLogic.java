public class GameLogic {
    ///////////////////////////////////////////////////////////////////
    // static methods
    /**
     * This method checks the win condition for vertical, horizontal, leftDiagonal
     * and rightDiagonal
     *
     * @param board - 2D char array
     * @param winRow - integer
     * @return true or false
     */
    public static Boolean winCondition(char[][] board, int winRow) {
        // For vertical win condition
        boolean vertical = false;
        for (int i = 0; i < board.length; i++) { // column
            for (int j = 0; j <= board[i].length - winRow; j++) { // row
                if(board[j][i] != 0) { // if the element at position is not empty, it will check
                    int count = 0;
                    for (int k = 0; k < winRow; k++) { // winRow check
                        if (board[j + k][i] != 0 && board[j][i] == board[j + k][i]) // if the element at that position is not empty and equal to the next element in vertical position
                            count++;
                        else
                            break;
                    }
                    if (count == winRow) // if there are same element for winRow times
                        vertical = true;
                }
            }
        }

        // For horizontal win condition
        boolean horizontal = false;
        for (int i = 0; i < board.length; i++) { // row
            for (int j = 0; j <= board[i].length - winRow; j++) { // column
                if(board[i][j] != 0) { // if the element at position is not empty, it will check
                    int count = 0;
                    for (int k = 0; k < winRow; k++) { // winRow check
                        if (board[i][j + k] != 0 && board[i][j] == board[i][j + k]) // if the element at that position is not empty and equal to the next element in horizontal position
                            count++;
                        else
                            break;
                    }
                    if (count == winRow) // if there are same element for winRow times
                        horizontal = true;
                }
            }
        }

        // For leftDiagonal win condition
        boolean leftDiagonal = false;
        for (int i = 0; i <= board.length - winRow; i++) { // row
            for (int j = board[i].length - 1; j >= winRow - 1; j--) { // column
                if(board[i][j] != 0) { // if the element at position is not empty, it will check
                    int count = 0;
                    for (int k = 0; k < winRow; k++) { // winRow check
                        if (board[i + k][j - k] != 0 && board[i][j] == board[i + k][j - k]) // if the element at that position is not empty and equal to the next element in left diagonal position
                            count++;
                        else
                            break;
                    }
                    if (count == winRow) // if there are same element for winRow times
                        leftDiagonal = true;
                }
            }
        }

        // For rightDiagonal win condition
        boolean rightDiagonal = false;
        for (int i = 0; i <= board.length - winRow; i++) {// row
            for (int j = 0; j <= board[i].length - winRow; j++) { // column
                if(board[i][j] != 0) { // if the element at position is not empty, it will check
                    int count = 0;
                    for (int k = 0; k < winRow; k++) { // winRow check
                        if (board[i][j] == board[i + k][j + k] && board[i + k][j + k] != 0) // if the element at that position is not empty and equal to the next element in right diagonal position
                            count++;
                        else
                            break;
                    }
                    if (count == winRow) // if there are same element for winRow times
                        rightDiagonal = true;
                }
            }
        }

        return vertical || horizontal || leftDiagonal || rightDiagonal; //if one of these boolean is true it will return true
    }
}