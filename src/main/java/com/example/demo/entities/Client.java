package com.example.demo.entities;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@Setter
@Getter
@Data
@ToString
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClient")
    private Long idClient;

    @Column(name = "client_reference")
    private String  clientReference;

    @Column(name = "client_name")
    private String name;

    @Column(name = "client_email")
    private String email ;

    @Column(name = "categorie")
    private String categorie;



    //Mapping d'une relation client fournisseur
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idFournisseur")
    private Fournisseur fournisseur;

    //entre client et commande
    // @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    // private List<Commande> commande_cl = new ArrayList<>();

    public Client() {

    }

    public Client(String clientReference, String name, String email, String categorie) {
        this.clientReference = clientReference;
        this.name = name;
        this.email = email;
        this.categorie = categorie;

    }


}
