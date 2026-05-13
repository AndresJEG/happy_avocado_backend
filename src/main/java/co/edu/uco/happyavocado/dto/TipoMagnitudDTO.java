package co.edu.uco.happyavocado.dto;

import java.util.UUID;

public class TipoMagnitudDTO {
    private UUID id;
    private String nombre;

    private TipoMagnitudDTO(Builder builder) {
        setId(id);
        setNombre(nombre);
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    // ¡ESTO ES LO QUE TE FALTA!
    public static class Builder {
        private UUID id;
        private String nombre;

        public Builder id(final UUID id) {
            this.id = id;
            return this;
        }

        public Builder nombre(final String nombre) {
            this.nombre = nombre;
            return this;
        }

        public TipoMagnitudDTO build() {
            return new TipoMagnitudDTO(this);
        }
    }
}