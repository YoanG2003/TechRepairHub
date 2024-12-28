package com.example.techrepairhub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.techrepairhub.models.*;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}

