package com.sensedia.mentoria.adapter.service.adapter;

import com.sensedia.mentoria.adapter.component.SerasaComponent;
import com.sensedia.mentoria.adapter.dto.Cliente;
import com.sensedia.mentoria.adapter.dto.ClienteSerasa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DadosClienteAdapterSerasaAdapter implements DadosClienteAdapter {

    @Autowired
    SerasaComponent serasaComponent;

    @Override
    public Cliente buscarDadosCliente(String cpf) {
        ClienteSerasa clienteSerasa = serasaComponent.getDadosClienteSerasa(cpf);
        return converterClienteSerasaParaCliente(clienteSerasa);
    }

    private Cliente converterClienteSerasaParaCliente(ClienteSerasa clienteSerasa) {
        return Cliente.builder()
                .nome(clienteSerasa.getNomeDaPessoa())
                .cpf(clienteSerasa.getDocumentoCpf())
                .dataNascimento(clienteSerasa.getDataNasc())
                .build();
    }
}
