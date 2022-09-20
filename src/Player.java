public class Player {
    ///////////////////////////////////////////////////////////////////
    // instance variables
    private int playerCounts; // number of players
    private String uniqueChars; // String of unique characters

    ///////////////////////////////////////////////////////////////////
    // Constructor
    public Player() {
        playerCounts = 0;
        uniqueChars = "";
    }

    ///////////////////////////////////////////////////////////////////
    // methods for playerCounts
    /**
     * this method will see if the number of players is eligible to play or not
     *
     * @param num - integer
     * @return true or false
     */
    public boolean eligibleNum(int num) {
        return num >= 3 && num <= 10; // it will return true if the num is not less than 3 and not greater than 10
    }

    /**
     * this method will set the number of players
     *
     * @param number - integer
     */
    public void setPlayerCounts(int number) {
        playerCounts = number;
    }

    /**
     * this method will return the number of players
     *
     * @return playerCounts
     */
    public int getPlayerCounts() {
        return playerCounts;
    }

    ///////////////////////////////////////////////////////////////////
    // methods for uniqueChars
    /**
     * this method will add a new char to uniqueChars string
     *
     * @param symbol - character
     */
    public void append(char symbol) {
        uniqueChars = uniqueChars + symbol;
    }

    /**
     * this method will get a char from uniqueChars string at the index
     *
     * @param index - integer
     * @return a unique Character
     */
    public char getChar(int index) {
        return uniqueChars.charAt(index);
    }


    /**
     * this method will search if the char is already in the uniqueChars string or
     * not
     *
     * @param symbol - character
     * @return true if there is already or false if there is not
     */
    public boolean search(char symbol) {
        for (int i = 0; i < uniqueChars.length(); i++) {
            if (symbol == getChar(i))
                return true;
        }
        return false;
    }
}
