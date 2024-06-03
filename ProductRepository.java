package com.Nimap.respority;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Nimap.model.Product;

public interface ProductRepository  extends JpaRepository<Product, Long> {

}
