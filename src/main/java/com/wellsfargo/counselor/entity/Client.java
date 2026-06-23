package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import com.wellsfargo.counselor.entity.Advisor;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long clientId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private Advisor advisor;
}
