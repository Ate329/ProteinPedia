package org.proteinpedia.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Chemical {
    @Id
    @GeneratedValue
    @Getter
    private Long id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private ChemicalType type;
    @Getter
    @Setter
    private String fullChemicalFormula;
    public Chemical() {

    }
    public Chemical(Long id, String name, ChemicalType type, String fullChemicalFormula) {
        super();
        this.id = id;
        this.name = name;
        this.type = type;
        this.fullChemicalFormula = fullChemicalFormula;
    }
}
