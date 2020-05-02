package com.home.parkingLot;

import java.util.ArrayList;
import java.util.List;

public class Row {
    private int RowNo;
    private int LevelNo;
    private List<Slot> slotList;

    public Row(int rowNo, int levelNo) {
        //check if levelNo is null to throw illegal argument exception
        RowNo = rowNo;
        LevelNo = levelNo;
        this.slotList=new ArrayList<>();
    }

    public int getRowNo() {
        return RowNo;
    }

    public int getLevelNo() {
        return LevelNo;
    }

    public List<Slot> getSlotList() {
        return slotList;
    }
}
