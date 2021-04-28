package com.example.demo.Dao.repo;

import com.example.demo.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommandeRepo extends JpaRepository<Commande,Long> {

         Commande save(Commande commande);

    @Override
    <S extends Commande> List<S> saveAll(Iterable<S> iterable);
}
