package com.maryanto.dimas.example.kelasplatformengineer.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Products {

    @Id
    @GenericGenerator(name = "gen_uuid", strategy = "uuid2")
    @GeneratedValue(generator = "gen_uuid")
    @Column(name = "product_id")
    private String productId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_description")
    private String productDesc;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "stock")
    private Long stock;
    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;
}
