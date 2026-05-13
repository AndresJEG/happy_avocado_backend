package co.edu.uco.happyavocado.dto;

import co.edu.uco.happyavocado.transversal.utilitario.UtilId;
import co.edu.uco.happyavocado.transversal.utilitario.UtilTexto;

import java.util.UUID;

public class SintomaDTO {
    private UUID id;
    private String nombre;
    private String descripcion;
    private ParteArbolAfectadaDTO parteArbolAfectada;

    private SintomaDTO(final Builder builder) {
        setId(builder.id);
        setNombre(builder.nombre);
        setDescripcion(builder.descripcion);
        setParteArbolAfectada(builder.parteArbolAfectada);
    }

    public ParteArbolAfectadaDTO getParteArbolAfectada() {
        return parteArbolAfectada;
    }

    private void setParteArbolAfectada(ParteArbolAfectadaDTO parteArbolAfectada) {
        this.parteArbolAfectada = parteArbolAfectada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    private void setDescripcion(final String descripcion) {
        this.descripcion = descripcion;
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
        private String descripcion;
        private ParteArbolAfectadaDTO parteArbolAfectada;

        public Builder id(final UUID id) {
            this.id= UtilId.obtenerValorDefecto(id);
            return this;
        }

        public Builder nombre(final String nombre) {
            this.nombre= UtilTexto.aplicarTrim(nombre);
            return this;
        }
        public Builder parteArbolAfectada(final ParteArbolAfectadaDTO parteArbolAfectada) {
            this.parteArbolAfectada = parteArbolAfectada;
            return this;
        }

        public Builder descripcion(final String descripcion) {
            this.descripcion = UtilTexto.aplicarTrim(descripcion);
            return this;
        }

        public SintomaDTO build() {
            return new SintomaDTO(this);
        }
    }
}
