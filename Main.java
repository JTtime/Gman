
package com.example.geektrust;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            int sX=0, sY=0, dX=0, dY=0;
            String dir="";

            try {
                FileInputStream fis = new FileInputStream("C:\\Users\\Pooja\\IdeaProjects\\untitled2\\src\\input.txt");
                Scanner sc = new Scanner(fis);
                while (sc.hasNextLine()) {
                    String input = sc.nextLine();
                    String[] cmd = input.split(" ");
                    switch (cmd[0]) {
                        case "SOURCE" :
                            sX = Integer.parseInt(cmd[1]);
                            sY =  Integer.parseInt(cmd[2]);
                            dir =  cmd[3];
                            break;
                        case "DESTINATION" :
                            dX = Integer.parseInt(cmd[1]);
                            dY =  Integer.parseInt(cmd[2]);
                            break;
                        case "PRINT_POWER" :
                            int p  = calculatePower(sX, sY, dX, dY, dir);
                            System.out.println("Hi how are you");
                            System.out.println("POWER "+ p);
                            break;
                    }
                }
                sc.close();
            } catch (IOException e) {
                System.out.println("IOException error is " + e);
            }
        }

        public static int calculatePower(int sourceX, int sourceY, int destinationX, int destinationY, String dir) {


            com.example.geektrust.Gman gman007 = new com.example.geektrust.Gman();
            gman007.powInXCoordinate = (gman007.powGrid(sourceX, destinationX))*10;
            gman007.powInYCoordinate = (gman007.powGrid(sourceY,destinationY))*10;
            gman007.powConsumedGrid = gman007.powInXCoordinate + gman007.powInYCoordinate;
            int powConsumedInTurns = (gman007.powTurns(sourceX, sourceY, destinationX, destinationY, dir))*5;


            gman007.powConsumedTot = (gman007.powConsumedGrid) + (powConsumedInTurns);
            gman007.powRemaining = gman007.powerInitial - gman007.powConsumedTot ;
            return gman007.powRemaining;
        }
    }



