package battleship;

public enum typeShips{
    AIRCRAFT("Aircraft Carrier", 5),
    BATTLESHIP("Battleship", 4),
    SUBMARINE("Submarine", 3),
    CRUISER("Cruiser", 3),
    DESTROYER("Destroyer", 2);

    public final String name;
    public final int length;

    typeShips(String name, int length) {
        this.name = name;
        this.length = length;
    }
}

