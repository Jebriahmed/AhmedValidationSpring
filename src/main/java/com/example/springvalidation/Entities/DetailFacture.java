package com.example.springvalidation.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class DetailFacture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFacture ;
    private Integer qte ;
    private float prixTotal ;
    private Integer pourcentageRemise ;
    private Integer montantRemise ;

    @ManyToOne
    private Produit produit;

    @ManyToOne
    private Facture facture;
}
