package com.myApiREST.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.myApiREST.entitys.Product;

public interface ProductsDAO extends JpaRepository<Product, Long>{

}

