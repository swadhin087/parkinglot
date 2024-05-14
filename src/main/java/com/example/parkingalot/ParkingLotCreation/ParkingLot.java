package com.example.parkingalot.ParkingLotCreation;

public class ParkingLot {

    public int getCapacity() {
        return capacity;
    }

    int capacity;
    private ParkingLot(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    private String name;
    private long id ;

    public static ParkingLot parkingLot;

    private ParkingLot() {
    }

    public ParkingLot getParkingLot(){

        if(parkingLot==null){
            return new ParkingLot(name,id);
        }
        return parkingLot;
    }
}
