package com.store.shopping_web.repository;

import com.store.shopping_web.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
