package co.edu.uco.happyavocado.entidad;

import co.edu.uco.happyavocado.transversal.utilitario.UtilFecha;
import co.edu.uco.happyavocado.transversal.utilitario.UtilId;

import java.time.LocalDate;
import java.util.UUID;

public class ProductoFitosanitarioPlagaEntidad {
    private UUID id;
    private PlagaArbolAguacateEntidad plagaArbolAguacate;
    private ProductoFitosanitarioEntidad productoFitosanitario;
    private LocalDate fechaAplicacion;

    private ProductoFitosanitarioPlagaEntidad(final Builder builder) {
        setId(builder.id);
        setPlagaArbolAguacate(builder.plagaArbolAguacate);
        setProductoFitosanitario(builder.productoFitosanitario);
        setFechaAplicacion(builder.fechaAplicacion);
    }

    public PlagaArbolAguacateEntidad getPlagaArbolAguacate() {
        return plagaArbolAguacate;
    }

    private void setPlagaArbolAguacate( final PlagaArbolAguacateEntidad plagaArbolAguacate) {
        this.plagaArbolAguacate = plagaArbolAguacate;
    }

    public LocalDate getFechaAplicacion() {
        return fechaAplicacion;
    }

    private void setFechaAplicacion(final LocalDate fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public UUID getId() {
        return id;
    }

    private void setId(final UUID id) {
        this.id = id;
    }

    public ProductoFitosanitarioEntidad getProductoFitosanitario() {
        return productoFitosanitario;
    }

    private void setProductoFitosanitario(final ProductoFitosanitarioEntidad productoFitosanitario) {
        this.productoFitosanitario = productoFitosanitario;
    }

    public static class Builder {
        private UUID id;
        private PlagaArbolAguacateEntidad plagaArbolAguacate;
        private ProductoFitosanitarioEntidad productoFitosanitario;
        private LocalDate fechaAplicacion;

        public Builder id(final UUID id) {
            this.id= UtilId.obtenerValorDefecto(id);
            return this;
        }

        public Builder PlagaArbolAguacate(final PlagaArbolAguacateEntidad PlagaArbolAguacate) {
            this.plagaArbolAguacate = PlagaArbolAguacate;
            return this;
        }

        public Builder productoFitosanitario(final ProductoFitosanitarioEntidad productoFitosanitario) {
            this.productoFitosanitario = productoFitosanitario;
            return this;
        }

        public Builder fechaAplicacion(final LocalDate fechaAplicacion) {
            this.fechaAplicacion = UtilFecha.obtenerValorDefecto(fechaAplicacion);
            return this;
        }

        public ProductoFitosanitarioPlagaEntidad build() {
            return new ProductoFitosanitarioPlagaEntidad(this);
        }
    }
}
