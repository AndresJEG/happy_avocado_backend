package co.edu.uco.happyavocado.dominio;

import co.edu.uco.happyavocado.transversal.utilitario.UtilId;
import co.edu.uco.happyavocado.transversal.utilitario.UtilTexto;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;
import java.util.UUID;

public class UnidadDominio {
    private UUID id;
    private String nombre;
    private String abreviacion;
    private TipoMagnitudDominio tipoMagnitud;

    private UnidadDominio(Builder builder) {
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
    public TipoMagnitudDominio getTipoMagnitud() { return tipoMagnitud; }
    private void setTipoMagnitud(final TipoMagnitudDominio tipoMagnitud) { this.tipoMagnitud = tipoMagnitud; }

    public static class Builder {
        private UUID id;
        private String nombre;
        private String abreviacion;
        private TipoMagnitudDominio tipoMagnitud;

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
        public Builder tipoMagnitud(final TipoMagnitudDominio tipoMagnitud) {
            this.tipoMagnitud = UtilObjeto.obtenerValorDefecto(tipoMagnitud, new TipoMagnitudDominio.Builder().build());
            return this;
        }
        public UnidadDominio build() {
            return new UnidadDominio(this);
        }
    }
}


