package com.portfolio.ML.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.ML.Entity.HyS;

public interface RHys extends JpaRepository<HyS, Integer>{
    Optional<HyS> findByNombre(String Nombre);
    public boolean existsByNombre(String nombre);
}
