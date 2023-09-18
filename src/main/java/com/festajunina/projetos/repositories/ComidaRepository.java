package com.festajunina.projetos.repositories;

import com.festajunina.projetos.domain.Comida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComidaRepository extends JpaRepository<Comida,Long> {

}
