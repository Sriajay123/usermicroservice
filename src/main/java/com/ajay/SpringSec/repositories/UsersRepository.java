package com.ajay.SpringSec.repositories;

import com.ajay.SpringSec.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface UsersRepository extends JpaRepository<Users,Integer> {

    Users findByUsername(String username);
}
