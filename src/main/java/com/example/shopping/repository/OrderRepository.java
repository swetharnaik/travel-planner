package com.example.shopping.repository;

import com.example.shopping.models.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

    @Query("SELECT o from Order o JOIN o.items i group by o.id having count(o.id)=:itemCount")
    List<Order> getOrdersFromItemSize(Long itemCount);
}
