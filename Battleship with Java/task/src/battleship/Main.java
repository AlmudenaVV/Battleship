package battleship;

import java.util.Scanner;

public class Main {
    static int rows = 10;
    static int columns = 10;
    static int[][] field = new int[rows][columns];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // call out class that prints the game field
        Gamefield.initializeField();
        Gamefield.printGameField();


        Ship.enterShips();
        // call class and method to enter the 5 different ships

    }

}

