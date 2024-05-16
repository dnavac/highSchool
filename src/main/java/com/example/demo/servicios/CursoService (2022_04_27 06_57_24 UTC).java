package com.example.demo.servicios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidades.curso;

@Repository
public interface CursoService extends JpaRepository<curso, Long> {

}
