package com.sensedia.mentoria.adapter.rest;

import com.sensedia.mentoria.adapter.dto.Cliente;
import com.sensedia.mentoria.adapter.service.adapter.DadosClienteAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/mentoria-java/example/adapter")
public class DadosClienteController {

    @Autowired
    @Qualifier("dadosClienteAdapterSerasaAdapter")
    //@Qualifier("dadosClienteAdapterReceitaFederalAdapter")
    private DadosClienteAdapter dadosClienteAdapter;

    @GetMapping("dados-cliente/{cpf}")
    public ResponseEntity<Cliente> buscarDadosCliente(@PathVariable String cpf) {
        return ResponseEntity.ok(dadosClienteAdapter.buscarDadosCliente(cpf));
    }

}
