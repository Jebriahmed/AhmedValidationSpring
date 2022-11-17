package com.example.springvalidation.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit ;
    private String codeProduit ;
    private String libelleProduit ;
    private float prixUnitaire ;

    @ManyToMany
    private List<Fournisseur> fournisseurList;

    @ManyToOne
    private Rayon rayon;

    @ManyToOne
    private Stock stock;

    @OneToOne(mappedBy = "produit")
    private DetailProduit detailProduit;

    @OneToMany(mappedBy = "produit")
    private List<DetailFacture> detailFactureList;
}
