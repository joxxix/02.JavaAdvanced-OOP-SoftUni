package itsInTheBlood;

import itsInTheBlood.abstractions.Cell;
import itsInTheBlood.abstractions.Cluster;
import itsInTheBlood.abstractions.Organism;

import java.util.HashMap;

public class HealthManager {

    HashMap<String, Organism> organisms = new HashMap<>();

    public String checkCondition(String organismName){
       if (organisms.containsKey(organismName)){
           return organisms.get(organismName).toString();
       }else {
           return null;
       }
    }

    public String createOrganism(String name){
          Organism organism = null;
        if (organisms.containsKey(name)){
           // System.out.println("Organism "+ name +" already exists");
            return String.format("Organism %s already exists",name);
        }else {
            organism = new Organism(name);
            organisms.putIfAbsent(name,organism);
            //System.out.println("Created organism " + name);
            return String.format("Created organism %s",name);
        }
    }

    public String addCluster(String organismName, String id, int rows, int cols){
        Cluster cluster = null;
        if (organisms.containsKey(organismName)){
            cluster = new Cluster(id, rows, cols);
            if (!organisms.get(organismName).getClusters().contains(cluster)){

            organisms.get(organismName).getClusters().add(cluster);
            return String.format("Organism %s: Created cluster %s",organismName,id);

            }
        }
        return null;
    }

    public String addCell(String organismName
            , String clusterId
            , String cellType
            , String cellId
            , int health
            , int positionRow
            , int positionCol
            , int additionalProperty){
        Cell cell = null;
        CellFactroy cf = new CellFactroy();
        if (organisms.containsKey(organismName) && organisms.get(organismName).getClusters().equals(clusterId)){
            cell  = cf.getCell(organismName,clusterId,cellType,cellId,health,positionRow,positionCol,additionalProperty);
            organisms.get(organismName).getCells().add(cell);
            return String.format("Organism %s: Created cell %s in cluster %s",organismName,cellId,clusterId);
        }

        return organismName;
    }

    public String activateCluster(String organismName){
        return organismName;
    }
}
