package com.festajunina.projetos.repositories;

import com.festajunina.projetos.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
