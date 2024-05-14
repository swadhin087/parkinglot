package com.example.parkingalot.controller;

import com.example.parkingalot.ParkingLotCreation.ParkingLot;
import com.example.parkingalot.model.Vehicle;
import com.example.parkingalot.service.Parkingservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class parkingLotController {

    private final Parkingservice parkingservice;

    public parkingLotController(Parkingservice parkingservice) {
        this.parkingservice = parkingservice;
    }

@PostMapping("/entry")
    public ResponseEntity<Vehicle> createEntry(@RequestBody Vehicle vehicle) {
    ParkingLot parkingLot =ParkingLot.parkingLot.getParkingLot();
    vehicle.setParkingLotId(parkingLot.getParkingLot().getId());
       Vehicle vehicle1= parkingservice.createEntry(vehicle);
       return new ResponseEntity<>(vehicle1, HttpStatus.CREATED);

    }
@PostMapping("/exit")
    public ResponseEntity<Vehicle> exitEntry(@RequestBody Vehicle vehicle) {
        parkingservice.exitEntry(vehicle);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
