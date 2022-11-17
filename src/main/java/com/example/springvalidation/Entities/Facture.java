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
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFacture ;
    private float montantRemise ;
    private float montantFacture ;
    private boolean active ;
    @Temporal(TemporalType.DATE)
    private Date dateFacture ;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "facture")
    private List<DetailFacture> detailFactureList;

}
