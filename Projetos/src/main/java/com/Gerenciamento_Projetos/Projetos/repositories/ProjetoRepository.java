package com.Gerenciamento_Projetos.Projetos.repositories;

import com.Gerenciamento_Projetos.Projetos.models.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}

