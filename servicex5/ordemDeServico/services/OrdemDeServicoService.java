package br.com.allan.servicex5.ordemDeServico.services;

import br.com.allan.servicex5.ordemDeServico.repositories.OrdemDeServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class OrdemDeServicoService {
    @Autowired
    private OrdemDeServicoRepository ordemDeServicoRepository;
}
