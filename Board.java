public Class Board {
    private String[][] board;
    private Scanner scanner = new Scanner(System.in);
    private static int rows = 0;
    private static int columns = 0;


    public void boardSetUp() {
        System.out.println("Enter number of rows for the game board: ");
        rows = scanner.nextInt();
        System.out.println("Great! " + rows + " rows was selected. Now please enter number of columns for the game board: ");
        columns = scanner.nextInt();
        String[][] board;
        board = new String [rows][columns];

        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[0].length; col++) {
                board[row][col] = "-";
            }
        }
        printBoard(board);
    }

    public void printBoard(String[][] array) {
        System.out.println(array);
        }

        public boolean boardFull() {
        // returns true if board is full else returns false
        }

        public boolean addToken(int colToAddToken, String playerName) {
        /* This method takes in a column number and a player name and adds a token to that column for that player.
        It also checks for invalid moves or full columns and throws appropriate exceptions. */
        }

        public boolean checkIfPlayerIsTheWinner(String playerNumber) {
        /* This method checks if a player has won by calling other methods that check for horizontal, vertical, right diagonal,
        and left diagonal wins and returns a boolean indicating if the player has won or not. */
        }

    public boolean checkVertical(String playerNumber) {
        /*This method checks if a player has won vertically by
        iterating through the board array and comparing four consecutive rows in a column.
         */
        }

    public boolean checkHorizontal(String playerNumber) {
        /*This method checks if a player has won horizontally by iterating through the
        board array and comparing four consecutive columns in a row.
         */
        }

    public boolean checkRightDiagonal(String playerNumber) {
        /*This method checks if a player has won diagonally from left to right by iterating through the board
        array and comparing four consecutive diagonal elements starting from the top-left corner.
         */
        }

    public boolean checkLeftDiagonal(String playerNumber) {
        /*This method checks if a player has won diagonally from right to left by iterating through the board array
        and comparing four consecutive diagonal elements starting from the top-right corner.
         */
        }
}