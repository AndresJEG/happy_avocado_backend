package co.edu.uco.happyavocado.dominio;

import co.edu.uco.happyavocado.transversal.utilitario.UtilBooleano;
import co.edu.uco.happyavocado.transversal.utilitario.UtilId;
import co.edu.uco.happyavocado.transversal.utilitario.UtilTexto;

import java.util.UUID;

public class AbonoDominio {
    private UUID id;
    private String nombre;
    private boolean esOrganico;
    private ToxicidadDominio toxicidad;
    private String descripcion;
    private MetodoAplicacionDominio metodoAplicacion;

    private AbonoDominio(final Builder builder) {
        setId(builder.id);
        setNombre(builder.nombre);
        setEsOrganico(builder.esOrganico);
        setMetodoAplicacion(builder.metodoAplicacion);
        setDescripcion(builder.descripcion);
        setToxicidad(builder.toxicidad);
    }

    public boolean isEsOrganico() {
        return esOrganico;
    }

    private void setEsOrganico(final boolean esOrganico) {
        this.esOrganico = esOrganico;
    }

    public ToxicidadDominio getToxicidad() {
        return toxicidad;
    }

    private void setToxicidad(final ToxicidadDominio toxicidad) {
        this.toxicidad = toxicidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    private void setDescripcion(final String descripcion) {
        this.descripcion = descripcion;
    }

    public MetodoAplicacionDominio getMetodoAplicacion() {
        return metodoAplicacion;
    }

    private void setMetodoAplicacion(final MetodoAplicacionDominio metodoAplicacion) {
        this.metodoAplicacion = metodoAplicacion;
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
        private boolean esOrganico;
        private ToxicidadDominio toxicidad;
        private String descripcion;
        private MetodoAplicacionDominio metodoAplicacion;

        public Builder id(final UUID id) {
            this.id= UtilId.obtenerValorDefecto(id);
            return this;
        }

        public Builder nombre(final String nombre) {
            this.nombre= UtilTexto.aplicarTrim(nombre);
            return this;
        }

        public Builder esOrganico(final boolean esOrganico) {
            this.esOrganico= UtilBooleano.obtenerValorDefecto(esOrganico);
            return this;
        }

        public Builder toxicidad(final ToxicidadDominio toxicidad) {
            this.toxicidad= toxicidad;
            return this;
        }

        public Builder descripcion(final String descripcion) {
            this.descripcion= UtilTexto.aplicarTrim(descripcion);
            return this;
        }

        public Builder metodoAplicacion(final MetodoAplicacionDominio metodoAplicacion) {
            this.metodoAplicacion= metodoAplicacion;
            return this;
        }

        public AbonoDominio build() {
            return new AbonoDominio(this);
        }
    }
}
