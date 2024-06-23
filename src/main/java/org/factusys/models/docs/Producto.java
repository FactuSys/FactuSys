    package org.factusys.models.docs;


    import jakarta.persistence.*;
    import lombok.*;
    import org.factusys.models.subdocs.Categoria;
    import org.factusys.models.subdocs.Impuesto;

    import java.util.List;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @ToString
    @EqualsAndHashCode(onlyExplicitlyIncluded = true)
    @Entity
    @Table(name = "usuarios")
    public class Producto {

        @Id
        @EqualsAndHashCode.Include
        private String idProducto;
        private String nombre;
        private String descripcion;
        private float precioCosto;
        private float precioVenta;
        private short catidadStock;

        @Embedded
        private Impuesto impuesto;

        @ManyToOne
        @JoinColumn(name = "categoria_id")
        private Categoria categoria;

        @ManyToOne
        @JoinColumn(name = "transaccion_id")
        private Transaccion transaccion;

        @ManyToMany(mappedBy = "productos")
        private List<Inventario> inventarios;


    }
