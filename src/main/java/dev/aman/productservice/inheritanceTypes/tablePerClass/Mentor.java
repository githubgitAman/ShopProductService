package dev.aman.productservice.inheritanceTypes.tablePerClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "TPC_Mentor")
public class Mentor extends User {

    private String company;
}
