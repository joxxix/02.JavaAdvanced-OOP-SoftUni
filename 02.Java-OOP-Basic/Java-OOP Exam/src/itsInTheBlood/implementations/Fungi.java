package itsInTheBlood.implementations;

import itsInTheBlood.abstractions.Microbe;

public class Fungi extends Microbe {
    public Fungi(String id, int health, int positionRow, int positionCol, int virulence) {
        super(id, health, positionRow, positionCol, virulence);
    }

    @Override
    public String toString() {
        int energy = (super.getHealth() + super.getVirulence()) / 4;
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("------Cell %s [%d,%d]"
                ,this.getId()
                ,this.getPositionRow()
                ,this.getPositionRow()))
                .append(System.lineSeparator())
                .append(String.format("--------Health %d | Virulence %d | Energy %d%n"
                        ,super.getHealth()
                        ,super.getVirulence()
                        ,energy));
        return sb.toString();
    }
}
