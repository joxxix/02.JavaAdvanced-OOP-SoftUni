package itsInTheBlood;

import itsInTheBlood.abstractions.Cell;
import itsInTheBlood.implementations.*;

public class CellFactroy {
    public Cell getCell(String organismName
            , String clusterId
            , String cellType
            , String cellId
            , int health
            , int positionRow
            , int positionCol
            , int additionalProperty){
        switch (cellType){
            case "RedBloodCell":return new RedBloodCell(
                    cellId
                    ,health
                    ,positionRow
                    ,positionCol
                    ,additionalProperty);
            case "WhiteBloodCell":return new WhiteBloodCell(
                    cellId
                    ,health
                    ,positionRow
                    ,positionCol
                    ,additionalProperty);
            case "Virus":return new Virus(
                    cellId
                    ,health
                    ,positionRow
                    ,positionCol
                    ,additionalProperty);
            case "Fungi":return new Fungi(
                    cellId
                    ,health
                    ,positionRow
                    ,positionCol
                    ,additionalProperty);
            case "Bacteria":return new Bacteria(
                    cellId
                    ,health
                    ,positionRow
                    ,positionCol
                    ,additionalProperty);
                default: return null;

        }
    }
}
