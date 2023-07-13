package com.sensedia.mentoria.adapter2.component;

import com.sensedia.mentoria.adapter2.dto.UsuarioFrances;
import org.springframework.stereotype.Component;


@Component
public class UsuarioFrancesComponent {

    public UsuarioFrances getDadosUsuarioFrances() {
        return UsuarioFrances.builder().utilisateur("pierre33").motDePasse("croissant55").pays("France").build();
    }
}
