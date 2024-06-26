package br.com.allan.servicex5.pagamento.domain;

import br.com.allan.servicex5.ordemDeServico.domain.OrdemDeServico;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@JsonTypeName("pagamentoBoleto")

public class PagamentoBoleto extends Pagamento {

    @Column(name = "DATA_VENCIMENTO")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataVencimento;


    @Column(name = "DATA_PAGAMENTO")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataPagamento;

    public PagamentoBoleto(Integer idPagamento, StatusPagamento statusPagamento, OrdemDeServico ordemDeServico, Date dataVencimento, Date dataPagamento) {
        super(idPagamento, statusPagamento, ordemDeServico);
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    public PagamentoBoleto(Date dataVencimento, Date dataPagamento) {
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }
}
