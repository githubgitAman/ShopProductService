package dev.aman.productservice.inheritanceTypes.tablePerClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "TPC_Instructor")
public class Instructor extends User {

    private String subject;
}
