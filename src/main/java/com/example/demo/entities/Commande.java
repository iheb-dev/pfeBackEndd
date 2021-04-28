package com.example.demo.entities;

import ch.qos.logback.core.joran.spi.NoAutoStart;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.criterion.Order;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoAutoStart
@Data
@ToString
 @JsonIgnoreProperties()
public class Commande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Order_Id")
    private long id;

    @Column(name = "reference")
    private String reference;

    @Column(name = "status")
    private String statuscheck;


    @Column(name = "totale")
    private float total;

    // mappping d'une relation commande et client
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idClient")
    private Client client;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_orderid" ,referencedColumnName = "Order_Id")
    private  List<OrderLine> orderLines;
    @Column(name = "customerReference")
   private String  customerReference;

    // mappping d'une relation commande et fournisseur
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idFournisseur")
    private Fournisseur fournisseur;

    public Commande() {

    }

    public Commande(String reference, float total, Client client, List<OrderLine> orderLines, Fournisseur fournisseur) {
        this.reference = reference;

        this.total = total;
        this.client = client;
        this.orderLines = orderLines;
        this.fournisseur = fournisseur;
    }
}
