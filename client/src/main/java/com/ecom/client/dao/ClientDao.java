package com.ecom.client.dao;

import com.ecom.client.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<Client,Long> {


}
