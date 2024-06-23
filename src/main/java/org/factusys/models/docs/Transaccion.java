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
@Table(name = "transacciones")
public class Transaccion {

    @Id
    @EqualsAndHashCode.Include
    private String idTransaccion;
    @OneToMany(mappedBy = "transaccion", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Producto> productos;
    private float total;
    private String fecha;
    private String idFactura;
}
