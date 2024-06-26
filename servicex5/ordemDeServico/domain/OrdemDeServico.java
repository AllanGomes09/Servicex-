package br.com.allan.servicex5.ordemDeServico.domain;

import br.com.allan.servicex5.pagamento.domain.Pagamento;
import br.com.allan.servicex5.servico.domain.Servico;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;


@Data
@NoArgsConstructor
@Entity
@Table(name = "ORDEMDESERVICOS")
public class OrdemDeServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_OS")
    private Integer idOS;

    @Column(name = "DATA_SOLICITACAO")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date dataSolicitacao;

    @Column(name = "VALOR_OS")
    private Double valorOS;

    @OneToOne(mappedBy = "ordemDeServico", cascade = CascadeType.ALL)
    private Pagamento pagamento; // Corrigido para "pagamento"

    @ManyToMany
    @JsonIgnore
    @JoinTable(name = "SERVICO_OS",
            joinColumns = @JoinColumn(name = "ID_OS"),
            inverseJoinColumns = @JoinColumn(name = "ID_SERVICO"))
    private Set<Servico> servicos;
}
