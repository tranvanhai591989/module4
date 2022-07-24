package com.example.product_oder.repository;
import com.example.product_oder.dto.OrderResponse;
import com.example.product_oder.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query("SELECT new com.example.product_oder.dto.OrderResponse(  c.name,p.productName) " +
            " from Customer  c join c.products p ");
   public List<OrderResponse> getJoinInformation();
}
