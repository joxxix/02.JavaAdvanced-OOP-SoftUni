package itsInTheBlood.abstractions;

import java.util.ArrayList;
import java.util.List;

public class Cluster{
    private String id;
    private int rows;
    private int cols;
    private List<Cell> cells;

    public Cluster(String id, int rows, int cols) {
        this.id = id;
        this.rows = rows;
        this.cols = cols;
        this.cells = new ArrayList<>();
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("----Cluster %s",this.id))
                .append(System.lineSeparator());

        for (Cell cell : cells) {
            sb.append(cell);
        }
        return sb.toString();
    }
}
