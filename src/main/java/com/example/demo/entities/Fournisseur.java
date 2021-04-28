package com.example.demo.entities;


import lombok.*;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Setter
@Getter
@AllArgsConstructor
@Data
@ToString
public class Fournisseur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFournisseur")
    private Long idFournisseur;


    @Column(name = "nameFournisseur")
    private String nameFournisseur;

    @Column(name = "reference")
    private String reference;

    @Column(name = "mail")
    private String mail;


    public Fournisseur() {

    }

    public Fournisseur(String nameFournisseur, String mail,String reference) {
        this.nameFournisseur = nameFournisseur;
        this.reference =reference;
        this.mail = mail;

    }


}
