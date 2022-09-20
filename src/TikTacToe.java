public class TikTacToe {
    public static void main(String[] args) {
        //variables and class declaration
        Player player = new Player();
        int winRow;
        boolean end = false;

        //WELCOME
        System.out.println("WElCOME TO TICTACTOE 2.0~~~");

        // ask user number of players
        int playerCount = UserInterface.askPlayerCounts();
        if (player.eligibleNum(playerCount)) // check if it is eligible number or not
            player.setPlayerCounts(playerCount);

        // ask for unique characters for each player
        for (int i = 1; i <= playerCount; i++) {
            char uniqueChar = UserInterface.askUniqueCharacter(i);

            if (!player.search(uniqueChar)) // search if the character is already in the string or not
                player.append(uniqueChar);
            else {
                System.out.println("The unique character has been taken!");
                i--;
            }
        }

        //ask user for how many pieces in a row have to win
        winRow = UserInterface.askWinRow(player.getPlayerCounts());

        //Create the board and print
        Board board = new Board(player.getPlayerCounts());
        board.print();

        //Ask user input for row and col until the game ends
        while(!end)
        {
            innerloop: for(int i = 0; i < player.getPlayerCounts(); i++) // innerloop is the label of for loop
            {
                int row = UserInterface.askRow(player.getChar(i), player.getPlayerCounts());
                int col = UserInterface.askCol(player.getChar(i), player.getPlayerCounts());
                while(board.getBoard()[row][col] != 0) // check if the element at row and col is placed or not
                {
                    System.out.println("This position have been placed! Choose another one.");
                    row = UserInterface.askRow(player.getChar(i), player.getPlayerCounts());
                    col = UserInterface.askCol(player.getChar(i), player.getPlayerCounts());
                }
                board.set(row,col,player.getChar(i));
                board.print();

                if(GameLogic.winCondition(board.getBoard(), winRow)){
                    System.out.println("CONGRATULATION Player '" + player.getChar(i) + "'! YOU WIN THE GAME.");
                    end = true;
                    break innerloop; // break the for loop
                }

                if(!GameLogic.winCondition(board.getBoard(), winRow) && board.isFullyFilled())
                {
                    System.out.println("TIE! THERE IS NO WINNER");
                    end = true;
                    break innerloop; // break the for loop
                }
            }
        }
    }
}