package com.example.demo.entities;

import lombok.*;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Setter
@Getter
@AllArgsConstructor
@ToString
public class OrderLine implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "line_id")
    private Long id;


    @Column(name = "ligne_reference")
    private String unitReference;

    @Column(name = "unit_price")
    private float unitPrice;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "itemName")
    private String itemName;

    @Column(name = "ligne_statut")
    private String statut;


    //entre ligneCommande et fournisseur
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idFournisseur")
    private Fournisseur fournisseur_id;

    // mappping d'une relation commande et orderLine
   // @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //@JoinColumn(name = "Order_Id")
    //private Commande Order_Id;

    public OrderLine() {

    }

    public OrderLine(String unitReference, float unitPrice, int quantity, String itemName, String statut ) {
        this.unitReference = unitReference;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.itemName = itemName;
        this.statut = statut;

    }
}

