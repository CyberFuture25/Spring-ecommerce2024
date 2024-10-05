package com.cibertec.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.ecommerce.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
