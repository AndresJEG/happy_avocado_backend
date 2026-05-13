package co.edu.uco.happyavocado.dominio;

import co.edu.uco.happyavocado.transversal.utilitario.UtilFecha;
import co.edu.uco.happyavocado.transversal.utilitario.UtilId;

import java.time.LocalDate;
import java.util.UUID;

public class ProductoFitosanitarioPlagaDominio {
    private UUID id;
    private PlagaArbolAguacateDominio plagaArbolAguacate;
    private ProductoFitosanitarioDominio productoFitosanitario;
    private LocalDate fechaAplicacion;

    private ProductoFitosanitarioPlagaDominio(final Builder builder) {
        setId(builder.id);
        setPlagaArbolAguacate(builder.plagaArbolAguacate);
        setProductoFitosanitario(builder.productoFitosanitario);
        setFechaAplicacion(builder.fechaAplicacion);
    }

    public PlagaArbolAguacateDominio plagaArbolAguacate() {
        return plagaArbolAguacate;
    }

    private void setPlagaArbolAguacate( final PlagaArbolAguacateDominio plagaArbolAguacate) {
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

    public ProductoFitosanitarioDominio getProductoFitosanitario() {
        return productoFitosanitario;
    }

    private void setProductoFitosanitario(final ProductoFitosanitarioDominio productoFitosanitario) {
        this.productoFitosanitario = productoFitosanitario;
    }

    public static class Builder {
        private UUID id;
        private PlagaArbolAguacateDominio plagaArbolAguacate;
        private ProductoFitosanitarioDominio productoFitosanitario;
        private LocalDate fechaAplicacion;

        public Builder id(final UUID id) {
            this.id= UtilId.obtenerValorDefecto(id);
            return this;
        }

        public Builder PlagaArbolAguacate(final PlagaArbolAguacateDominio PlagaArbolAguacate) {
            this.plagaArbolAguacate = PlagaArbolAguacate;
            return this;
        }

        public Builder productoFitosanitario(final ProductoFitosanitarioDominio productoFitosanitario) {
            this.productoFitosanitario = productoFitosanitario;
            return this;
        }

        public Builder fechaAplicacion(final LocalDate fechaAplicacion) {
            this.fechaAplicacion = UtilFecha.obtenerValorDefecto(fechaAplicacion);
            return this;
        }

        public ProductoFitosanitarioPlagaDominio build() {
            return new ProductoFitosanitarioPlagaDominio(this);
        }
    }
}
