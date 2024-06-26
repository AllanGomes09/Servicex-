package br.com.allan.servicex5.categoria.domain;

import br.com.allan.servicex5.servico.domain.Servico;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "CATEGORIA")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_CATEGORIA")
    private Integer idCategoria;
    @Column(name="NOME_CATEGORIA")
    private String nomeCategoria;
    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Servico> servicos;

    public Categoria() {
    }

    public Categoria(Integer idCategoria, String nomeCategoria, List<Servico> servicos) {
        this.idCategoria = idCategoria;
        this.nomeCategoria = nomeCategoria;
        this.servicos = servicos;
    }
}
