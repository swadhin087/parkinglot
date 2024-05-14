package com.example.parkingalot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
@Table(name="vehicle")
public class Vehicle {
    @Id
    private Long id;
    private Long parkingLotId;
    Date entryTime;
    Date exitTime;

}
