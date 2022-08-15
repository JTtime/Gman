package com.example.geektrust;

import java.lang.Math;

public class Gman {
    public int powerInitial;
    private int turns;
    public int powRemaining;
    public int powConsumedTot;
    public int powConsumedGrid;

    public int powInXCoordinate;
    public int powInYCoordinate;

    public Gman() {
        this.powerInitial = 200;
        this.turns = 0;

    }

    public int powGrid(int src, int dest) {
        int diff_coordinate = dest - src;
        return Math.abs(diff_coordinate);

    }


    public int powTurns(int sX, int sY, int dX, int dY, String dir){

        if (dX==sX && dY > sY) {
            switch (dir) {
                case "E", "W" :
                    turns++;
                    break;
                case "N" :
                    break;
                case "S" :
                    turns += 2;
                    break;
            }

        }
        else if (dX==sX && dY < sY) {
            switch (dir) {
                case "E", "W" :
                    turns++;
                    break;
                case "N":
                    turns += 2;
                    break;
                case "S":
                    break;
            }
        }

        else if (dY == sY && dX > sX) {
            switch (dir) {
                case "N", "S":
                    turns++;
                    break;
                case "W":
                    turns +=2;
                    break;
                case "E":
                    break;
            }
        }

        else if (dY == sY && dX < sX) {
            switch (dir) {
                case "N", "S":
                    turns++;
                    break;
                case "E":
                    turns +=2;
                    break;
                case "W":
                    break;
            }
        }


        else if (dX > sX && dY > sY){
            switch (dir) {
                case "N", "E" :
                    turns++;
                    break;
                case "S", "W" :
                    turns +=2;

                    break;

            }

        }

        else if (dX < sX && dY > sY) {
            switch (dir) {
                case "N", "W":
                    turns++;
                    break;
                case "S", "E":
                    turns +=2;

                    break;
            }

        }

        else if (dX > sX && dY < sY) {
            switch (dir) {
                case "S", "E":
                    turns++;
                    break;
                case "N", "W":
                    turns += 2;
                    break;
            }
        }

        else if (dX < sX && dY < sY)
        {
            switch (dir) {
                case "S","W":
                    turns++;
                    break;
                case "N","E":
                    turns += 2;
            }
        }


        return turns;
    }



}
