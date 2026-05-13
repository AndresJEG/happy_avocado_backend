package co.edu.uco.happyavocado.dto;

import co.edu.uco.happyavocado.transversal.utilitario.UtilId;
import co.edu.uco.happyavocado.transversal.utilitario.UtilTexto;
import co.edu.uco.happyavocado.transversal.utilitario.UtilBooleano;
import java.util.UUID;

public class PlagaDTO {
    private UUID id;
    private String nombre;
    private String origen;
    private Boolean esContagioso;

    private PlagaDTO(Builder builder) {
        setId(id);
        setNombre(nombre);
        setOrigen(origen);
        setEsContagioso(esContagioso);
    }

    public UUID getId() { return id; }
    private void setId(final UUID id) { this.id = id; }
    public String getNombre() { return nombre; }
    private void setNombre(final String nombre) { this.nombre = nombre; }
    public String getOrigen() { return origen; }
    private void setOrigen(final String origen) { this.origen = origen; }
    public Boolean isEsContagioso() { return esContagioso; }
    private void setEsContagioso(final boolean esContagioso) { this.esContagioso = esContagioso; }

    public static class Builder {
        private UUID id;
        private String nombre;
        private String origen;
        private Boolean esContagioso;

        public Builder id(final UUID id) {
            this.id = UtilId.obtenerValorDefecto(id);
            return this;
        }
        public Builder nombre(final String nombre) {
            this.nombre = UtilTexto.aplicarTrim(nombre);
            return this;
        }
        public Builder origen(final String origen) {
            this.origen = UtilTexto.aplicarTrim(origen);
            return this;
        }
        public Builder esContagioso(final Boolean esContagioso) {
            this.esContagioso = UtilBooleano.obtenerValorDefecto(esContagioso);
            return this;
        }
        public PlagaDTO build() {
            return new PlagaDTO(this);
        }
    }
}