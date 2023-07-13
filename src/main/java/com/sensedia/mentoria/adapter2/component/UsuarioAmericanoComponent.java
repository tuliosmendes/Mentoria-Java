package com.sensedia.mentoria.adapter2.component;

import com.sensedia.mentoria.adapter2.dto.UsuarioAmericano;
import org.springframework.stereotype.Component;

@Component
public class UsuarioAmericanoComponent {

    public UsuarioAmericano getDadosUsuarioAmericano() {
        return UsuarioAmericano.builder().username("usuariododiscord99").password("123321").build();
    }
}
