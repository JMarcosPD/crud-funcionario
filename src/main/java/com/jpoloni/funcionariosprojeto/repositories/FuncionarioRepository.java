package com.jpoloni.funcionariosprojeto.repositories;


import com.jpoloni.funcionariosprojeto.models.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository <FuncionarioModel, Long>{
}
