package com.kgisl.sbngproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgisl.sbngproject.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
