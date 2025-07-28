package org.generation.ch55Spring.repository;

import org.generation.ch55Spring.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
