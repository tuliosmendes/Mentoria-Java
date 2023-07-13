package com.sensedia.mentoria.adapter2.rest;

import com.sensedia.mentoria.adapter2.service.adapter.DadosUsuarioAdapter;
import com.sensedia.mentoria.adapter2.dto.UsuarioTraduzido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/mentoria-java/example/adapter2")
public class DadosUsuarioController {

    @Autowired
//    @Qualifier("dadosUsuarioAmericanoAdapter")
    @Qualifier("dadosUsuarioFrancesAdapter")
    private DadosUsuarioAdapter dadosUsuarioAdapter;

    @GetMapping("dados-usuario")
    public ResponseEntity<UsuarioTraduzido> buscarDadosUsuario() {
        return ResponseEntity.ok(dadosUsuarioAdapter.buscarDadosUsuario());
    }

}