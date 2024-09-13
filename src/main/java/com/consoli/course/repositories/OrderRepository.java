package com.consoli.course.repositories;

import com.consoli.course.entities.Order;
import com.consoli.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {



}
