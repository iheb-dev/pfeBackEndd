
package com.example.demo.Dao.repo;

import com.example.demo.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository <Client,Long>{


    Client findByIdClient(Long idClient);

    Client findByemail(String email);

    void deleteClientByIdClient(Long idClient);
    Client save(Client client);
}
