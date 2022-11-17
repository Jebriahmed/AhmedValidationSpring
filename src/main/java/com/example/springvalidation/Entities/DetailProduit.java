package com.example.springvalidation.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class DetailProduit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit ;

    @Enumerated(EnumType.STRING)
    private CategorieProduit categorieProduit ;

    @Temporal(TemporalType.DATE)
    private Date dateCreation ;

    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification ;

    @OneToOne
    private Produit produit;
}
