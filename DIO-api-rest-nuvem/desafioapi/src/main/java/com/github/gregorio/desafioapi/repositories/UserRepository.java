package com.github.gregbalb62.desafioapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.gregbalb62.desafioapi.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
