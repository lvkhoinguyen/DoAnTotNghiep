package com.store.shopping_web.repository;

import com.store.shopping_web.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

