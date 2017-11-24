package itsInTheBlood.abstractions;

import java.util.ArrayList;
import java.util.List;

public class Organism {
    private String name;
    private List<Cluster> clusters;
    private List<Cell> cells;

    public Organism(String name) {
        this.name = name;
        this.clusters = new ArrayList<>();
        this.cells = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setClusters(List<Cluster> clusters) {
        this.clusters = clusters;
    }

    public List<Cluster> getClusters() {
        return this.clusters;
    }

    public List<Cell> getCells() {
        return cells;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Organism - %s", getName()))
                .append(System.lineSeparator())
                .append(String.format("--Clusters: %s",clusters.size()))
                .append(System.lineSeparator())
                .append(String.format("--Cells: %s%n",cells.size()));

        for (Cluster cluster : clusters) {
            sb.append(cluster);
        }
        return sb.toString();
    }
}
