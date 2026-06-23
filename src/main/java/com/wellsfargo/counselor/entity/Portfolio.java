package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import com.wellsfargo.counselor.entity.Client;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private Long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
