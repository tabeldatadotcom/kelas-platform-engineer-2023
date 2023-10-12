package com.maryanto.dimas.example.kelasplatformengineer.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class Products {

    private String productId;
    private String productName;
    private String productDesc;
    private BigDecimal price;
    private Long stock;
    private LocalDateTime lastUpdated;
}
