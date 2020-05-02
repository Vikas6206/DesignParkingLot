package com.home.parkingLot;

import java.util.ArrayList;
import java.util.List;

public class Row {
    private int rowNo;
    private int levelNo;
    private List<Slot> slotList;

    public Row(int rowNo, int levelNo) {
        //check if levelNo is null to throw illegal argument exception
        this.rowNo = rowNo;
        this.levelNo = levelNo;
        this.slotList=new ArrayList<>();
    }

    public int getRowNo() {
        return rowNo;
    }

    public int getLevelNo() {
        return levelNo;
    }

    public List<Slot> getSlotList() {
        return slotList;
    }
}
