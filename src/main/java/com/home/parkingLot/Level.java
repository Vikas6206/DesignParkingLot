package com.home.parkingLot;

import java.util.ArrayList;
import java.util.List;

public class Level {
    private int LevelNo;
    private ParkingLot parkingLot;
    private List<Row> rowList;

    public Level(int levelNo, ParkingLot parkingLot) {

        if(parkingLot == null){
            throw new IllegalArgumentException("Parking not is null");
        }
        LevelNo = levelNo;
        this.parkingLot = parkingLot;
        rowList=new ArrayList<>();
    }

    public int getLevelNo() {
        return LevelNo;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public List<Row> getRowList() {
        return rowList;
    }
}
