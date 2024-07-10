package battleship;

public class Gamefield {

    static int rows = 10;
    static int columns = 10;
    static char[][] field = new char[rows][columns];

    public static void printGameField() {
        for (int rows = 1; rows < 11; rows++) {
            System.out.print(" " + rows);
        }
        System.out.println();
        char rowLetter = 'A';
        for (int i = 0; i < field.length; i++) {
            System.out.print(rowLetter + " ");
            rowLetter++;
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void initializeField(){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = '~';
            }
        }
    }
}
