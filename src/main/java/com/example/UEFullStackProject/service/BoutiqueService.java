package com.example.UEFullStackProject.service;

import com.example.UEFullStackProject.exception.BoutiqueNotFoundException;
import com.example.UEFullStackProject.model.Boutique;
import com.example.UEFullStackProject.repo.BoutiqueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoutiqueService {

    private final BoutiqueRepo boutiqueRepo;

    @Autowired
    public BoutiqueService(BoutiqueRepo boutiqueRepo) {
        this.boutiqueRepo = boutiqueRepo;
    }

    public Boutique addBoutique(Boutique boutique) {
        return boutiqueRepo.save(boutique);
    }

    public List<Boutique> findAllBoutiques() {
        return boutiqueRepo.findAll();
    }

    public Boutique updateBoutique(Boutique boutique) {
        return boutiqueRepo.save(boutique);
    }

    public Boutique findBoutiqueById(Long id) {
        return boutiqueRepo.findBoutiqueById(id).orElseThrow(
                () -> new BoutiqueNotFoundException("Boutique avec id " + id + " n'a pas été trouvé"));
    }

    public void deleteBoutique(Long id) {
        boutiqueRepo.deleteBoutiqueById(id);
    }


}
