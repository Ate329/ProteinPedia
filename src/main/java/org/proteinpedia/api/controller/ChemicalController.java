package org.proteinpedia.api.controller;

import java.util.ArrayList;

import org.proteinpedia.api.model.Chemical;
import org.proteinpedia.api.view.ChemicalRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api/v1")
public class ChemicalController {

    private ChemicalRepository chemicalRepository;
    @GetMapping("/chemical/{id}")
    // Fully qualified: /api/v1/chemical/{id} where id is an integer
    public Chemical getChemicalById(@PathVariable Long id) {
        return chemicalRepository.findById(id).get();
    }
    @GetMapping("/chemical/search")
    // Fully qualified: /api/v1/chemical/search?name={name}
    public ArrayList<Chemical> getAllChemicalsByName(@RequestParam(value = "name") String targetName) {
        return chemicalRepository.findAllByName(targetName);
    }
    @PostMapping("/chemical")
    public void saveNewChemical(@RequestBody Chemical chemical) {
        chemicalRepository.save(chemical);
    }
    @DeleteMapping("/chemical/{id}")
    public void deleteChemical(@PathVariable Long id) {
        chemicalRepository.deleteById(id);
    }
}
