package dev.aman.productservice.inheritanceTypes.tablePerClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "TPC_Student")
public class Student extends User {

    private String batch;
}
