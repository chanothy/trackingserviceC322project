package edu.iu.c322.trackingserviceC322project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Payment {

    @Id
    private int paymentId;
    private String method; // card or cash
}
