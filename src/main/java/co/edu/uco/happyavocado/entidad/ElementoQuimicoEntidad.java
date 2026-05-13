package co.edu.uco.happyavocado.entidad;

import co.edu.uco.happyavocado.transversal.utilitario.UtilId;
import co.edu.uco.happyavocado.transversal.utilitario.UtilTexto;
import co.edu.uco.happyavocado.transversal.utilitario.UtilBooleano;
import java.util.UUID;

public class ElementoQuimicoEntidad {
    private UUID id;
    private String nombre;
    private String simbolo;
    private Boolean clasificacion;

    private ElementoQuimicoEntidad(Builder builder) {
        setId(id);
        setNombre(nombre);
        setSimbolo(simbolo);
        setClasificacion(clasificacion);
    }

    public UUID getId() { return id; }
    private void setId(final UUID id) { this.id = id; }
    public String getNombre() { return nombre; }
    private void setNombre(final String nombre) { this.nombre = nombre; }
    public String getSimbolo() { return simbolo; }
    private void setSimbolo(final String simbolo) { this.simbolo = simbolo; }
    public Boolean isClasificacion() { return clasificacion; }
    private void setClasificacion(final boolean clasificacion) { this.clasificacion = clasificacion; }

    public static class Builder {
        private UUID id;
        private String nombre;
        private String simbolo;
        private Boolean clasificacion;

        public Builder id(final UUID id) {
            this.id = UtilId.obtenerValorDefecto(id);
            return this;
        }
        public Builder nombre(final String nombre) {
            this.nombre = UtilTexto.aplicarTrim(nombre);
            return this;
        }
        public Builder simbolo(final String simbolo) {
            this.simbolo = UtilTexto.aplicarTrim(simbolo);
            return this;
        }
        public Builder clasificacion(final Boolean clasificacion) {
            this.clasificacion = clasificacion;
            return this;
        }
        public ElementoQuimicoEntidad build() {
            return new ElementoQuimicoEntidad(this);
        }
    }
}

