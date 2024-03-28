package br.com.allan.servicex55.categoria.repositories;

import br.com.alan.servicex55.categoria.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {

}