package dev.aman.productservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
@Setter
@Entity
public class Product extends BaseModel {
    private String title;
    private String description;
    private int qty;
    private double price;
    @ManyToOne
    private Category category;
}
