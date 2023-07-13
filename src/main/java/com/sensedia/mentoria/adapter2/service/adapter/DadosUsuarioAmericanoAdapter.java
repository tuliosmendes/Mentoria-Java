package com.sensedia.mentoria.adapter2.service.adapter;

import com.sensedia.mentoria.adapter2.component.UsuarioAmericanoComponent;
import com.sensedia.mentoria.adapter2.dto.UsuarioAmericano;
import com.sensedia.mentoria.adapter2.dto.UsuarioTraduzido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DadosUsuarioAmericanoAdapter implements DadosUsuarioAdapter {

    @Autowired
    UsuarioAmericanoComponent AmericanoComponent;

    @Override
    public UsuarioTraduzido buscarDadosUsuario() {
        System.out.println("------------------------- USUÁRIO AMERICANO --------------------------");
        UsuarioAmericano usuarioAmericano = AmericanoComponent.getDadosUsuarioAmericano();
        return converterUsuarioAmericanoParaTraduzido(usuarioAmericano);
    }

    private UsuarioTraduzido converterUsuarioAmericanoParaTraduzido(UsuarioAmericano usuarioAmericano) {


        return UsuarioTraduzido.builder()
                .usuario(usuarioAmericano.getUsername())
                .senha(usuarioAmericano.getPassword())
                .pais("US")
                .build();
    }
}
