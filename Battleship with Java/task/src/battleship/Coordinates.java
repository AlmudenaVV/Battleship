package battleship;

import java.util.Scanner;

// check teh coordinates, later scan in the other class
public class Coordinates {
    String firstCoordinate;
    String secondCoordinate;
    int lengthShip = 0;

    public Coordinates(String inputShip){
        Scanner sc = new Scanner(System.in);

        // enter first and last coordinate of ship
        // use .toUpperCase() so the computer always reads the letter as a capital letter
        String[] coordinates = inputShip.split(" ");
        this.firstCoordinate = coordinates[0].toUpperCase();
        this.secondCoordinate = coordinates[1].toUpperCase();

        // separate the letter from the number in the ship
        // use substring instead of char because 10 is a valid coordinate
        int startLetter = firstCoordinate.charAt(0) - 'A'; // the letter
        int startNum = Integer.parseInt(firstCoordinate.substring(1)) - 1; // the number


        int endLetter = secondCoordinate.charAt(0) - 'A'; // the letter
        int endNum = Integer.parseInt(secondCoordinate.substring(1)) - 1; // the number

        // calculate length
        if (startLetter == endLetter){
            this.lengthShip = Math.abs(startNum - endNum) + 1;
        } else if (startNum == endNum){
            this.lengthShip = Math.abs(startLetter - endLetter) + 1;
        }


        // checks it is inside the board
        if (startLetter > 9 || startLetter < 0 || startNum > 9 || startNum < 0
                || endLetter > 9 || endLetter < 0 || endNum > 9 || endNum < 0) { // if value is different than 10 (so 9 in arrays) it's an error
            System.out.println("Error!");

        } else if (startLetter != endLetter && startNum != endNum) { // if they are in different letters and columns, it is an error
            System.out.println("Error!");
        }

    }


}
