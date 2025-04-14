
package com.example.customerorder.repository;

import com.example.customerorder.model.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface OrderRepository extends JpaRepository<CustomerOrder, Long> //entity class, id type. entity links to db
    {
    }


