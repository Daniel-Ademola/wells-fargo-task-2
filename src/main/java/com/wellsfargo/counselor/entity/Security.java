package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import com.wellsfargo.counselor.entity.Portfolio;

@Entity
public class Security {

    @Id
    @GeneratedValue
    private Long securityId;

    @Column
    private String name;

    @Column
    private String category;

    @Column
    private LocalDate purchaseDate;

    @Column
    private double purchasePrice;

    @Column
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;
}
