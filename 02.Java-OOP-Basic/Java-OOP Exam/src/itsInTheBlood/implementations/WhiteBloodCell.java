package itsInTheBlood.implementations;

import itsInTheBlood.abstractions.BloodCell;
import itsInTheBlood.abstractions.Cell;

public class WhiteBloodCell extends BloodCell {
    private int size;

    public WhiteBloodCell(String id, int health, int positionRow, int positionCol, int size) {
        super(id, health, positionRow, positionCol);
        this.size = size;
    }

    @Override
    public String toString() {
        int energy = (super.getHealth()+this.size)*2;

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("------Cell %s [%d,%d]"
                ,this.getId()
                ,this.getPositionRow()
                ,this.getPositionRow()))
                .append(System.lineSeparator())
                .append(String.format("--------Health %d | Size %d | Energy %d%n"
                        ,super.getHealth()
                        ,this.size
                        ,energy));
                //o	--------Health {health} | Size {size} | Energy {energy}
        return null;
    }
}
