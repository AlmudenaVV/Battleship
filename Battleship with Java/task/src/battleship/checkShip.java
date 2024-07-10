package battleship;

import java.util.Scanner;

public class checkShip {

    public static void enterShip() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates of the ship:");
        // enter first and last coordinate of ship
        // use .toUpperCase() so the computer always reads the letter as a capital letter
        String inputShip = sc.nextLine();
        String[] coordinates = inputShip.split(" ");
        String firstCoordinate = coordinates[0].toUpperCase();
        String secondCoordinate = coordinates[1].toUpperCase();

        // separate the letter from the number in the ship
        // use substring instead of char because 10 is a valid coordinate
        int startLetter = firstCoordinate.charAt(0) - 'A'; // the letter
        int startNum = Integer.parseInt(firstCoordinate.substring(1)) - 1; // the number


        int endLetter = secondCoordinate.charAt(0) - 'A'; // the letter
        int endNum = Integer.parseInt(secondCoordinate.substring(1)) - 1; // the number


        // check if ship is correct

        // print out length and parts of ship
        int length = 0;
        if (startLetter > 9 || startLetter < 0 || startNum > 9 || startNum < 0
                || endLetter > 9 || endLetter < 0 || endNum > 9 || endNum < 0) { // if value is different than 10 (so 9 in arrays) it's an error
            System.out.println("Error!");

        } else if (startLetter != endLetter && startNum != endNum) { // if they are in different letters and columns, it is an error
            System.out.println("Error!");

        } else if (startLetter == endLetter && startNum > endNum){ // same letter, calculate length when first is bigger than second
            length = startNum - endNum + 1;
            System.out.println("Length: " + length);
            System.out.print("Parts: "); // print out parts
            for (int i = startNum; i >= endNum; i--) {
                System.out.print((char) (startLetter + 'A') + "" + (i + 1) + " ");
            }

        } else if (startLetter == endLetter && startNum < endNum) { // same letter, calculate length when second is bigger than first
            length = endNum - startNum + 1;
            System.out.println("Length: " + length);
            System.out.print("Parts: "); // print out parts
            for (int i = startNum; i <= endNum; i++) {
                System.out.print((char) (startLetter + 'A') + "" + (i + 1) + " ");
            }

        } else if (startNum == endNum && startLetter > endLetter){ // same number, calculate height when first letter is bigger than second
            length =  startLetter - endLetter + 1;
            System.out.println("Length: " + length);
            System.out.print("Parts: "); // print out parts
            for (int i = startLetter; i >= endLetter; i--) {
                System.out.print((char) (i + 'A') + "" + (startNum + 1) + " ");
            }

        } else if (startNum == endNum && startLetter < endLetter) { // same number, calculate height when first letter is smaller than second
            length = endLetter - startLetter + 1;
            System.out.println("Length: " + length);
            System.out.print("Parts: "); // print out parts
            for (int i = startLetter; i <= endLetter; i++) {
                System.out.print((char) (i + 'A') + "" + (startNum + 1) + " ");
            }

        }



    }
}
