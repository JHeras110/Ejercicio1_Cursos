package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Curso;

/**
 * Interfaz que conecta la aplicacion con la BBDD
 */
public interface CursoDao extends JpaRepository<Curso, Integer> {
    
}
