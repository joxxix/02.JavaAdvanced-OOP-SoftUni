package itsInTheBlood.abstractions;

public abstract class Cell{
    private String id;
    private int health;
    private int positionRow;
    private int positionCol;

    public String getId() {
        return id;
    }

    public int getHealth() {
        return health;
    }

    public int getPositionRow() {
        return positionRow;
    }

    public int getPositionCol() {
        return positionCol;
    }

    public Cell(String id, int health, int positionRow, int positionCol) {
        this.id = id;
        this.health = health;
        this.positionRow = positionRow;
        this.positionCol = positionCol;
    }

    @Override
    public abstract String toString();
}
