package com.example.springvalidation.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit ;
    private String nom ;
    private String prenom ;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance ;
    private String email ;
    private String password ;

    @Enumerated(EnumType.STRING)
    private CategorieClient categorieClient ;

    @Enumerated(EnumType.STRING)
    private Profession profession;

    @OneToMany(mappedBy = "client")
    private List<Facture> factureList;
}
