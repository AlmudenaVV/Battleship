package battleship;

import java.util.Scanner;

class Ship {
    public static void enterShips(){

        Scanner sc = new Scanner(System.in);
        // put boolean, when the condition is met, change boolean so it stops looping

        boolean flag = true;
        // loop through enums of all ships

        for (typeShips ships : typeShips.values()){
            System.out.printf("Enter the coordinates of the %s (%d cells): \n", ships.name, ships.length);
            flag = true;
            while (flag){
                Coordinates SHIP = new Coordinates(sc.nextLine());
                if (SHIP.lengthShip == ships.length){
                    placeShip(SHIP, Gamefield.field);
                    Gamefield.printGameField();
                    flag = false;
                } else {
                    System.out.printf("Error! Wrong length of the %s! Try again: \n", ships.name);
                }
            }
        }

    }
    public static void placeShip(Coordinates SHIP, char[][] array){
        int startLetter = SHIP.firstCoordinate.charAt(0) - 'A'; // the letter
        int startNum = Integer.parseInt(SHIP.firstCoordinate.substring(1)) - 1; // the number


        int endLetter = SHIP.secondCoordinate.charAt(0) - 'A'; // the letter
        int endNum = Integer.parseInt(SHIP.secondCoordinate.substring(1)) - 1; // the number
        for (int i = startLetter; i <= endLetter; i++){
            for (int j = startNum; j <= endNum; j++) {
                array[i][j] = 'O';
            }
        }
    }


}
