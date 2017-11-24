package itsInTheBlood;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HealthManager hm = new HealthManager();

        String line;

        while (!"BEER IS COMING".equals(line = scan.nextLine())){
            String[] cellInfo = line.split(" ");
            switch (cellInfo[0]){
                case "checkCondition" :
                    System.out.println(hm.checkCondition(cellInfo[1]));
                    break;

                case "createOrganism" :
                    System.out.println(hm.createOrganism(cellInfo[1]));
                    break;

                case "addCluster" :
                    System.out.println(hm.addCluster(cellInfo[1]
                            , cellInfo[2]
                            , Integer.parseInt(cellInfo[3])
                            , Integer.parseInt(cellInfo[4])));
                    break;

                case "addCell" :
                    System.out.println(hm.addCell(cellInfo[1]
                            , cellInfo[2]
                            , cellInfo[3]
                            , cellInfo[4]
                            , Integer.parseInt(cellInfo[5])
                            , Integer.parseInt(cellInfo[6])
                            , Integer.parseInt(cellInfo[7])
                            , Integer.parseInt(cellInfo[8])));
                    break;
                case "activateCluster" : hm.activateCluster(cellInfo[1]);
                    break;
            }
        }
    }
}
