package co.edu.uco.happyavocado.dto;

import co.edu.uco.happyavocado.transversal.utilitario.UtilFecha;
import co.edu.uco.happyavocado.transversal.utilitario.UtilId;

import java.time.LocalDate;
import java.util.UUID;

public class ProductoFitosanitarioPlagaDTO {
    private UUID id;
    private PlagaArbolAguacateDTO plagaArbolAguacate;
    private ProductoFitosanitarioDTO productoFitosanitario;
    private LocalDate fechaAplicacion;

    private ProductoFitosanitarioPlagaDTO(final Builder builder) {
        setId(builder.id);
        setPlagaArbolAguacate(builder.plagaArbolAguacate);
        setProductoFitosanitario(builder.productoFitosanitario);
        setFechaAplicacion(builder.fechaAplicacion);
    }

    public PlagaArbolAguacateDTO plagaArbolAguacate() {
        return plagaArbolAguacate;
    }

    private void setPlagaArbolAguacate( final PlagaArbolAguacateDTO plagaArbolAguacate) {
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

    public ProductoFitosanitarioDTO getProductoFitosanitario() {
        return productoFitosanitario;
    }

    private void setProductoFitosanitario(final ProductoFitosanitarioDTO productoFitosanitario) {
        this.productoFitosanitario = productoFitosanitario;
    }

    public static class Builder {
        private UUID id;
        private PlagaArbolAguacateDTO plagaArbolAguacate;
        private ProductoFitosanitarioDTO productoFitosanitario;
        private LocalDate fechaAplicacion;

        public Builder id(final UUID id) {
            this.id= UtilId.obtenerValorDefecto(id);
            return this;
        }

        public Builder PlagaArbolAguacate(final PlagaArbolAguacateDTO PlagaArbolAguacate) {
            this.plagaArbolAguacate = PlagaArbolAguacate;
            return this;
        }

        public Builder productoFitosanitario(final ProductoFitosanitarioDTO productoFitosanitario) {
            this.productoFitosanitario = productoFitosanitario;
            return this;
        }

        public Builder fechaAplicacion(final LocalDate fechaAplicacion) {
            this.fechaAplicacion = UtilFecha.obtenerValorDefecto(fechaAplicacion);
            return this;
        }

        public ProductoFitosanitarioPlagaDTO build() {
            return new ProductoFitosanitarioPlagaDTO(this);
        }
    }
}
