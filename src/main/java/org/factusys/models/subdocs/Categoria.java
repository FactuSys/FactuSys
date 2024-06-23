package org.factusys.models.subdocs;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @EqualsAndHashCode.Include
    private String id;
    private String nombre;
}
