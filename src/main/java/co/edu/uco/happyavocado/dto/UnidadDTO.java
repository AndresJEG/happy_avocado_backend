package co.edu.uco.happyavocado.dto;

import co.edu.uco.happyavocado.transversal.utilitario.UtilId;
import co.edu.uco.happyavocado.transversal.utilitario.UtilTexto;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;
import java.util.UUID;

public class UnidadDTO {
    private UUID id;
    private String nombre;
    private String abreviacion;
    private TipoMagnitudDTO tipoMagnitud;

    private UnidadDTO(Builder builder) {
        setId(id);
        setNombre(nombre);
        setAbreviacion(abreviacion);
        setTipoMagnitud(tipoMagnitud);
    }

    public UUID getId() { return id; }
    private void setId(final UUID id) { this.id = id; }
    public String getNombre() { return nombre; }
    private void setNombre(final String nombre) { this.nombre = nombre; }
    public String getAbreviacion() { return abreviacion; }
    private void setAbreviacion(final String abreviacion) { this.abreviacion = abreviacion; }
    public TipoMagnitudDTO getTipoMagnitud() { return tipoMagnitud; }
    private void setTipoMagnitud(final TipoMagnitudDTO tipoMagnitud) { this.tipoMagnitud = tipoMagnitud; }

    public static class Builder {
        private UUID id;
        private String nombre;
        private String abreviacion;
        private TipoMagnitudDTO tipoMagnitud;

        public Builder id(final UUID id) {
            this.id = UtilId.obtenerValorDefecto(id);
            return this;
        }
        public Builder nombre(final String nombre) {
            this.nombre = UtilTexto.aplicarTrim(nombre);
            return this;
        }
        public Builder abreviacion(final String abreviacion) {
            this.abreviacion = UtilTexto.aplicarTrim(abreviacion);
            return this;
        }
        public Builder tipoMagnitud(final TipoMagnitudDTO tipoMagnitud) {
            this.tipoMagnitud = UtilObjeto.obtenerValorDefecto(tipoMagnitud, new TipoMagnitudDTO.Builder().build());
            return this;
        }
        public UnidadDTO build() {
            return new UnidadDTO(this);
        }
    }
}
