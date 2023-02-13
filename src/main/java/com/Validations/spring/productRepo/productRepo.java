package com.Validations.spring.productRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Validations.spring.product.product;
@Repository
public interface productRepo extends JpaRepository<product,Integer> {

}
