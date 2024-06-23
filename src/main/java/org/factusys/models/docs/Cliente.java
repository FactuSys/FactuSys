package org.factusys.models.docs;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @EqualsAndHashCode.Include
    private String idCliente;
    private String nombre;
    private String departamento;
    private String ciudad;
    private String dirección;
    private String telefono;
    private String email;
}
