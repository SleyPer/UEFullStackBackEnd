package com.example.UEFullStackProject.repo;

import com.example.UEFullStackProject.model.Boutique;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BoutiqueRepo extends JpaRepository<Boutique, Long> {
    void deleteBoutiqueById(Long id);

    Optional<Boutique> findBoutiqueById(Long id);
}
