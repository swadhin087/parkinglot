package com.example.parkingalot.Repository;

import com.example.parkingalot.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ParkingRepo extends JpaRepository<Vehicle,Long> {
}
