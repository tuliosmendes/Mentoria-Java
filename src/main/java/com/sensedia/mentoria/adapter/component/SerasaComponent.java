package com.sensedia.mentoria.adapter.component;

import com.sensedia.mentoria.adapter.dto.ClienteSerasa;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class SerasaComponent {

    public ClienteSerasa getDadosClienteSerasa(String cpf) {
        return ClienteSerasa.builder().nomeDaPessoa("fulano serasa").documentoCpf("000.000.000-00").dataNasc(new Date()).build();
    }
}
