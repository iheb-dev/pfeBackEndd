package com.example.demo.service;

import com.example.demo.Dao.repo.CommandeRepo;
import com.example.demo.entities.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CommandeService {
    @Autowired
    CommandeRepo commandeRepo;

    public Commande addcommande(Commande commande) {
        commande.setStatuscheck("ncheck");
        return this.commandeRepo.save(commande);

    }
    public List<Commande> findAllCommande(){
        return commandeRepo.findAll();
    }
    public  List<Commande> saveAllOrders( List<Commande> cammandes){
      return   commandeRepo.saveAll( cammandes);
    }


}
