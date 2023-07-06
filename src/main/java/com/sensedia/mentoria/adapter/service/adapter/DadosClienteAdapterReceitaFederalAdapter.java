package com.sensedia.mentoria.adapter.service.adapter;

import com.sensedia.mentoria.adapter.component.ReceitaFederalComponent;
import com.sensedia.mentoria.adapter.dto.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DadosClienteAdapterReceitaFederalAdapter implements DadosClienteAdapter {

    @Autowired
    ReceitaFederalComponent receitaFederalComponent;

    @Override
    public Cliente buscarDadosCliente(String cpf) {
        return this.receitaFederalComponent.getDadosClienteReceitaFederal(cpf);
    }
}
