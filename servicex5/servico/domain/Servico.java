package br.com.allan.servicex5.servico.domain;

import br.com.allan.servicex5.categoria.domain.Categoria;
import br.com.allan.servicex5.ordemDeServico.domain.OrdemDeServico;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SERVICOS")
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERVICO")
    private Integer idServico;

    @Column(name = "NOME_SERVICO")
    private String nomeServico;

    @Column(name = "VALOR_SERVICO")
    private Double valor;

    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private Categoria categoria;

    @JsonBackReference

    @ManyToMany(mappedBy = "servicos")
    @JsonIgnore
    private List<OrdemDeServico> ordemDeServicos;
}
