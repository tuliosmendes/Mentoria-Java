package com.sensedia.mentoria.adapter.component;

import com.sensedia.mentoria.adapter.dto.Cliente;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ReceitaFederalComponent {

    public Cliente getDadosClienteReceitaFederal(String cpf) {
        return Cliente.builder().nome("fulano receita federal").cpf("000.000.000-00").dataNascimento(new Date()).build();
    }
}
