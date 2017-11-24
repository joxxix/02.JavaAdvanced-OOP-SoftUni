package itsInTheBlood.implementations;

import itsInTheBlood.abstractions.Cell;

public class RedBloodCell extends Cell {
    private int velocity;

    public RedBloodCell(String id, int health, int positionRow, int positionCol, int velocity) {
        super(id, health, positionRow, positionCol);
        this.velocity = velocity;
    }

    @Override
    public String toString() {
        int energy = this.getHealth() + this.velocity;

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("------Cell %s [%d,%d]"
                ,this.getId()
                ,this.getPositionRow()
                ,this.getPositionRow()))
                .append(System.lineSeparator())
                .append(String.format("--------Health: %d | Virulence: %d | Energy: %d%n"
                        ,super.getHealth()
                        ,this.velocity
                        ,energy));

                //--------Health: 10 | Virulence: 10 | Energy: 20
        return sb.toString();
    }
}
