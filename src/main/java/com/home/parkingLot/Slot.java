package com.home.parkingLot;

public class Slot {
    private int rowNo;
    private int slotNo;
    private Boolean isOccupied;

    public Slot(int rowNo, int slotNo) {
        this.rowNo = rowNo;
        this.slotNo = slotNo;
        this.isOccupied = Boolean.FALSE;
    }

    public int getRowNo() {
        return rowNo;
    }

    public int getSlotNo() {
        return slotNo;
    }

    public Boolean getOccupied() {
        return isOccupied;
    }

    public void setRowNo(int rowNo) {
        this.rowNo = rowNo;
    }

    public void setSlotNo(int slotNo) {
        this.slotNo = slotNo;
    }

    public void setOccupied(Boolean occupied) {
        isOccupied = occupied;
    }
}
