package com.example.demo.controlles;

import com.example.demo.entities.Client;
import com.example.demo.entities.Fournisseur;
import com.example.demo.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/fournisseur")
public class FourrisseurController {

    @Autowired
    FournisseurService fournisseurService;

    @GetMapping("/find/{ idFournisseur}")
    public ResponseEntity<Fournisseur> getFournisseur(@PathVariable("idFournisseur") Long idFournisseur ){
        Fournisseur  fournisseur = fournisseurService.findByidFournisseur( idFournisseur);
        return new ResponseEntity<>(fournisseur, HttpStatus.OK);

    }
    @PostMapping("/add")
    public ResponseEntity<Fournisseur> addfournisseur(  @RequestBody Fournisseur fournisseur){
       Fournisseur newfour = fournisseurService.addfournsisseur(fournisseur);
        return new ResponseEntity<>(newfour , HttpStatus.CREATED);
    }
}


