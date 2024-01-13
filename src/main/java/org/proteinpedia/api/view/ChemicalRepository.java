package org.proteinpedia.api.view;

import java.util.ArrayList;

import org.proteinpedia.api.model.Chemical;
import org.springframework.data.repository.CrudRepository;

public interface ChemicalRepository extends CrudRepository<Chemical, Long> {
    public ArrayList<Chemical> findAllByName(String name);
}
