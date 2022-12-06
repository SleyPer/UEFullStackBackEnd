package com.example.UEFullStackProject;

import com.example.UEFullStackProject.model.Boutique;
import com.example.UEFullStackProject.service.BoutiqueService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boutique")
public class BoutiqueController {

    private final BoutiqueService boutiqueService;

    public BoutiqueController(BoutiqueService boutiqueService) {
        this.boutiqueService = boutiqueService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Boutique>> getAllBoutiques() {
        List<Boutique> boutiques = boutiqueService.findAllBoutiques();
        return new ResponseEntity<>(boutiques, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Boutique> getBoutiqueById(@PathVariable("id") Long id) {
        Boutique boutique = boutiqueService.findBoutiqueById(id);
        return new ResponseEntity<>(boutique, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Boutique> addBoutique(@RequestBody Boutique boutique) {
        Boutique newBoutique = boutiqueService.addBoutique(boutique);
        return new ResponseEntity<>(newBoutique, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Boutique> updateBoutique(@RequestBody Boutique boutique) {
        Boutique updateBoutique = boutiqueService.updateBoutique(boutique);
        return new ResponseEntity<>(updateBoutique, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBoutique(@PathVariable("id") Long id) {
        boutiqueService.deleteBoutique(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
