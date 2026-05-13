package co.edu.uco.happyavocado.dto;

import co.edu.uco.happyavocado.transversal.utilitario.UtilId;
import co.edu.uco.happyavocado.transversal.utilitario.UtilTexto;

import java.util.UUID;

public class ProductoFitosanitarioDTO {
    private UUID id;
    private String nombre;
    private ToxicidadDTO toxicidad;
    private TipoProductoFitosanitarioDTO tipoProductoFitosanitario;

    private ProductoFitosanitarioDTO(final Builder builder) {
        setId(builder.id);
        setNombre(builder.nombre);
        setTipoProductoFitosanitario(builder.tipoProductoFitosanitario);
        setToxicidad(builder.toxicidad);
    }

    public TipoProductoFitosanitarioDTO tipoProductoFitosanitario() {
        return tipoProductoFitosanitario;
    }

    private void setTipoProductoFitosanitario(TipoProductoFitosanitarioDTO tipoProductoFitosanitario) {
        this.tipoProductoFitosanitario = tipoProductoFitosanitario;
    }

    public ToxicidadDTO getToxicidad() {
        return toxicidad;
    }

    private void setToxicidad(ToxicidadDTO toxicidad) {
        this.toxicidad = toxicidad;
    }

    public UUID getId() {
        return id;
    }

    private void setId(final UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public static class Builder {
        private UUID id;
        private String nombre;
        private ToxicidadDTO toxicidad;
        private TipoProductoFitosanitarioDTO tipoProductoFitosanitario;

        public Builder id(final UUID id) {
            this.id= UtilId.obtenerValorDefecto(id);
            return this;
        }

        public Builder nombre(final String nombre) {
            this.nombre= UtilTexto.aplicarTrim(nombre);
            return this;
        }
        public Builder toxicidad(final ToxicidadDTO toxicidad) {
            this.toxicidad= toxicidad;
            return this;
        }

        public Builder tipoProductoFitosanitario(final TipoProductoFitosanitarioDTO tipoProductoFitosanitario) {
            this.tipoProductoFitosanitario = tipoProductoFitosanitario;
            return this;
        }

        public ProductoFitosanitarioDTO build() {
            return new ProductoFitosanitarioDTO(this);
        }
    }
}
