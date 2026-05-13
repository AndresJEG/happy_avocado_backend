package co.edu.uco.happyavocado.entidad;


import co.edu.uco.happyavocado.transversal.utilitario.UtilId;
import co.edu.uco.happyavocado.transversal.utilitario.UtilTexto;
import java.util.UUID;

public class TipoMagnitudEntidad {
    private UUID id;
    private String nombre;

    private TipoMagnitudEntidad(final UUID id, final String nombre) {
        setId(id);
        setNombre(nombre);
    }

    public UUID getId() { return id; }
    private void setId(final UUID id) { this.id = id; }
    public String getNombre() { return nombre; }
    private void setNombre(final String nombre) { this.nombre = nombre; }

    public static class Builder {
        private UUID id;
        private String nombre;

        public Builder id(final UUID id) {
            this.id = UtilId.obtenerValorDefecto(id);
            return this;
        }
        public Builder nombre(final String nombre) {
            this.nombre = UtilTexto.aplicarTrim(nombre);
            return this;
        }
        public TipoMagnitudEntidad build() {
            return new TipoMagnitudEntidad(id, nombre);
        }
    }
}
