package br.com.allan.servicex55.pagamento.repositories;

import br.com.allan.servicex55.pagamento.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
}