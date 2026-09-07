package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    @Query("SELECT producto FROM Producto producto WHERE producto.categoria = :categoria")
    List<Producto> buscarPorCategoria(@Param("categoria") String categoria);
}