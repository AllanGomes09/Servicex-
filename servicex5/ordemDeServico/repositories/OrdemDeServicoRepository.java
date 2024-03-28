package br.com.allan.servicex55.ordemDeServico.repositories;

import br.com.allan.servicex55.ordemDeServico.domain.OrdemDeServico;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrdemDeServicoRepository extends JpaRepository<OrdemDeServico, Integer> {
}
