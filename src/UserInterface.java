import java.util.Scanner;

public class UserInterface {
    ///////////////////////////////////////////////////////////////////
    // static methods
    /**
     * This method will ask the user input for the number of players
     *
     * @return integer
     */
    public static int askPlayerCounts() {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        int playerCounts = 0;

        System.out.print("How many players are playing? Enter any number from minimum of 3 to maximum of 10 players: ");
        while (!valid) {
            while (!scan.hasNextInt()) {
                System.out.print("Not a number! Enter any number from minimum of 3 to maximum of 10 players: ");
                scan.nextLine();
            }
            playerCounts = scan.nextInt();
            //scan.nextLine();

            if (playerCounts >= 3 && playerCounts <= 10)
                valid = true;
            else {
                System.out.print("Invalid number! Enter any number from minimum of 3 to maximum of 10 players: ");
            }
        }
        return playerCounts;
    }

    /**
     * this method will ask the user input for unique character
     *
     * @param playerNumber - integer
     * @return character
     */
    public static char askUniqueCharacter(int playerNumber) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Player " + playerNumber
                + ". Please choose your unique character(if string first character will be taken): ");

        return scan.nextLine().charAt(0);
    }

    /**
     * this method will ask the user input for how many pieces in a row have to be
     * to win the game
     *
     * @param playerCounts - integer
     * @return integer
     */
    public static int askWinRow(int playerCounts) {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        int winRow = 0;

        System.out.print("How many pieces in a row have to be to win the game? Enter any number between 3-"
                + (playerCounts + 1) + ": ");
        while (!valid) {
            while (!scan.hasNextInt()) {
                System.out.print("Not a number! Enter any number between 3-"
                        + (playerCounts + 1) + ": ");
                scan.nextLine();
            }

            winRow = scan.nextInt();
            scan.nextLine();

            if (winRow >= 3 && winRow <= playerCounts+1)
                valid = true;
            else
                System.out.print("Invalid number! Enter any number between 3-"
                        + (playerCounts + 1) + ": ");
        }
        return winRow;
    }

    /**
     * this method will ask the user input for the row number that the player
     * want to place
     *
     * @param player - character
     * @param playerCounts - integer
     * @return integer
     */
    public static int askRow(char player, int playerCounts) {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        int row = 0;

        System.out.print("Player '" + player + "'. Please enter row number you want to place: ");
        while (!valid) {
            while (!scan.hasNextInt()) {
                System.out.print("Not a number! Please enter row number you want to place: ");
                scan.nextLine();
            }

            row = scan.nextInt();
            scan.nextLine();

            if (row >= 0 && row <= playerCounts)
                valid = true;
            else
                System.out.print("Invalid number! Please enter row number you want to place: ");
        }
        return row;
    }

    /**
     * this method will ask the user input for the column number that the player
     * want to place
     *
     * @param player - character
     * @param playerCounts - integer
     * @return integer
     */
    public static int askCol(char player, int playerCounts) {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        int col = 0;

        System.out.print("Player '" + player + "'. Please enter col number you want to place: ");
        while (!valid) {
            while (!scan.hasNextInt()) {
                System.out.print("Not a number! Please enter col number you want to place: ");
                scan.nextLine();
            }

            col = scan.nextInt();
            scan.nextLine();

            if (col >= 0 && col <= playerCounts)
                valid = true;
            else
                System.out.print("Invalid number! Please enter col number you want to place: ");
        }
        return col;
    }
}
