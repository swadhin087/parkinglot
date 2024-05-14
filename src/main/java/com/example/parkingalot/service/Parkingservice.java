package com.example.parkingalot.service;


import com.example.parkingalot.Repository.ParkingRepo;
import com.example.parkingalot.model.Vehicle;
import org.springframework.stereotype.Service;

@Service
public class Parkingservice {


    private final ParkingRepo parkingRepo;

    public Parkingservice(ParkingRepo parkingRepo) {
        this.parkingRepo = parkingRepo;
    }

    public Vehicle createEntry(Vehicle vehicle){
        return this.parkingRepo.save(vehicle);
    }

    public void exitEntry(Vehicle vehicle){
        this.parkingRepo.delete(vehicle);
    }

}

