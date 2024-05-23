package com.example.demo.product;

import java.awt.print.Pageable;
import java.util.Optional;
import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    Optional<Product> findByName(String name);
    Page findAll(Pageable pageable);

    void deleteById(int id);
    Optional<Product> findById(int id);
}
