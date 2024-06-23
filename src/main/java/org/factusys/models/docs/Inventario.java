package org.factusys.models.docs;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "inventarios")
public class Inventario {

    @Id
    @EqualsAndHashCode.Include
    private String idInventario;
    private String fecha;
    @ManyToMany
    @JoinTable(
            name = "inventario_producto",
            joinColumns = @JoinColumn(name = "inventario_id"),
            inverseJoinColumns = @JoinColumn(name = "producto_id")
    )
    private List<Producto> productos;
}
