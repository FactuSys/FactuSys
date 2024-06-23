package org.factusys.models.docs;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.factusys.models.enums.Rol;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Usuarios {

    private String idUser;
    private String nombre;
    private String email;
    private Rol rol;
    private String contraseia;
}
