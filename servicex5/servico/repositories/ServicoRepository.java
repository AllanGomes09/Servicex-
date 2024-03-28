package br.com.allan.servicex55.servico.repositories;

import br.com.allan.servicex55.categoria.domain.Categoria;
import br.com.allan.servicex55.servico.domain.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository  extends JpaRepository<Servico,Integer> {
}
