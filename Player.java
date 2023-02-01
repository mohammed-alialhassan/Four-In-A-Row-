import java.util.Scanner;

public class Player {
    private String name;
    private int playerNumber;
    private static Scanner scanner = new Scanner(System.in);

    public Player(String name, int playerNumber) {
        this.name = name;
        this.playerNumber = playerNumber;
    }

    public String getName() {
        return name;
    }

    public String getPlayerNumber() {
        return playerNumber;
    }

    public int makeMove() {
        System.out.println("Where would you like to drop your token?");
        int columnTarget = scanner.nextInt();
        return columnTarget;
    }

    @Override
    public String toString() {
        return "Player " + playerNumber + " is " + name;
    }
}