package co.edu.uco.happyavocado.entidad;

import co.edu.uco.happyavocado.transversal.utilitario.UtilBooleano;
import co.edu.uco.happyavocado.transversal.utilitario.UtilId;
import co.edu.uco.happyavocado.transversal.utilitario.UtilTexto;

import java.util.UUID;

public class AbonoEntidad {
    private UUID id;
    private String nombre;
    private Boolean esOrganico;
    private ToxicidadEntidad toxicidad;
    private String descripcion;
    private MetodoAplicacionEntidad metodoAplicacion;

    private AbonoEntidad(final Builder builder) {
        setId(builder.id);
        setNombre(builder.nombre);
        setEsOrganico(builder.esOrganico);
        setMetodoAplicacion(builder.metodoAplicacion);
        setDescripcion(builder.descripcion);
        setToxicidad(builder.toxicidad);
    }

    public Boolean EsOrganico() {
        return esOrganico;
    }

    private void setEsOrganico(final boolean esOrganico) {
        this.esOrganico = esOrganico;
    }

    public ToxicidadEntidad getToxicidad() {
        return toxicidad;
    }

    private void setToxicidad(final ToxicidadEntidad toxicidad) {
        this.toxicidad = toxicidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    private void setDescripcion(final String descripcion) {
        this.descripcion = descripcion;
    }

    public MetodoAplicacionEntidad getMetodoAplicacion() {
        return metodoAplicacion;
    }

    private void setMetodoAplicacion(final MetodoAplicacionEntidad metodoAplicacion) {
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
        private ToxicidadEntidad toxicidad;
        private String descripcion;
        private MetodoAplicacionEntidad metodoAplicacion;

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

        public Builder toxicidad(final ToxicidadEntidad toxicidad) {
            this.toxicidad= toxicidad;
            return this;
        }

        public Builder descripcion(final String descripcion) {
            this.descripcion= UtilTexto.aplicarTrim(descripcion);
            return this;
        }

        public Builder metodoAplicacion(final MetodoAplicacionEntidad metodoAplicacion) {
            this.metodoAplicacion= metodoAplicacion;
            return this;
        }

        public AbonoEntidad build() {
            return new AbonoEntidad(this);
        }
    }
}
