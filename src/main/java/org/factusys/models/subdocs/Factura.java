    package org.factusys.models.subdocs;

    import jakarta.persistence.*;
    import lombok.*;
    import org.factusys.models.docs.Cliente;
    import org.factusys.models.docs.Producto;

    import java.util.ArrayList;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @ToString
    @EqualsAndHashCode(onlyExplicitlyIncluded = true)
    @Entity
    @Table(name = "facturas")
    public class Factura {

        @Id
        private String idFactura;
        private String fecha;
        private float total;

        @ManyToOne
        @JoinColumn(name = "cliente_id")
        private Cliente client;

        @ManyToMany
        @JoinTable(
                name = "factura_productos",
                joinColumns = @JoinColumn(name = "factura_id"),
                inverseJoinColumns = @JoinColumn(name = "producto_id")
        )
        private ArrayList<Producto> productos;
    }
