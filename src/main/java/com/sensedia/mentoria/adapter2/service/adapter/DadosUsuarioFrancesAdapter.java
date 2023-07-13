package com.sensedia.mentoria.adapter2.service.adapter;

import com.sensedia.mentoria.adapter2.component.UsuarioFrancesComponent;
import com.sensedia.mentoria.adapter2.dto.UsuarioFrances;
import com.sensedia.mentoria.adapter2.dto.UsuarioTraduzido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DadosUsuarioFrancesAdapter implements DadosUsuarioAdapter {

    @Autowired
    UsuarioFrancesComponent francesComponent;

    @Override
    public UsuarioTraduzido buscarDadosUsuario() {
        System.out.println("------------------------- USUÁRIO FRANCÊS --------------------------");
        UsuarioFrances usuarioFrances = francesComponent.getDadosUsuarioFrances();
        return converterUsuarioFrancesParaTraduzido(usuarioFrances);
    }

    private UsuarioTraduzido converterUsuarioFrancesParaTraduzido(UsuarioFrances usuarioFrances) {


        return UsuarioTraduzido.builder()
                .usuario(usuarioFrances.getUtilisateur())
                .senha(usuarioFrances.getMotDePasse())
                .pais(usuarioFrances.getPays())
                .build();
    }
}
