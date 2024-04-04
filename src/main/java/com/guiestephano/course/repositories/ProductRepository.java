package com.guiestephano.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guiestephano.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
