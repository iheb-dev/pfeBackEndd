package com.example.demo.service;

import com.example.demo.Dao.repo.FournisseurRepo;
import com.example.demo.entities.Client;
import com.example.demo.entities.Fournisseur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FournisseurService {

    @Autowired
    FournisseurRepo fournisseurRepo;

    public Fournisseur findByidFournisseur(Long idFournisseur) {
        return this.fournisseurRepo.findByIdFournisseur(idFournisseur);
    }


    public Fournisseur addfournsisseur(Fournisseur fournisseur) {

        return this. fournisseurRepo.save(fournisseur);

    }


}
