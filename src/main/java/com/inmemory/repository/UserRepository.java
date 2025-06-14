// src/main/java/com/inmemory/repository/UserRepository.java
package com.inmemory.repository;

import com.inmemory.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}