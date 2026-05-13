package co.edu.uco.happyavocado.dominio;

import co.edu.uco.happyavocado.transversal.utilitario.UtilId;
import co.edu.uco.happyavocado.transversal.utilitario.UtilTexto;
import co.edu.uco.happyavocado.transversal.utilitario.UtilDecimal;
import java.util.UUID;

public class CategoriaCalidadDominio {
    private UUID id;
    private String nombre;
    private float rangoInicial;
    private float rangoFinal;

    private CategoriaCalidadDominio(Builder builder) {
        setId(id);
        setNombre(nombre);
        setRangoInicial(rangoInicial);
        setRangoFinal(rangoFinal);
    }

    public UUID getId() { return id; }
    private void setId(final UUID id) { this.id = id; }
    public String getNombre() { return nombre; }
    private void setNombre(final String nombre) { this.nombre = nombre; }
    public float getRangoInicial() { return rangoInicial; }
    private void setRangoInicial(final float rangoInicial) { this.rangoInicial = rangoInicial; }
    public float getRangoFinal() { return rangoFinal; }
    private void setRangoFinal(final float rangoFinal) { this.rangoFinal = rangoFinal; }

    public static class Builder {
        private UUID id;
        private String nombre;
        private float rangoInicial;
        private float rangoFinal;

        public Builder id(final UUID id) {
            this.id = UtilId.obtenerValorDefecto(id);
            return this;
        }
        public Builder nombre(final String nombre) {
            this.nombre = UtilTexto.aplicarTrim(nombre);
            return this;
        }
        public Builder rangoInicial(final float rangoInicial) {
            this.rangoInicial = UtilDecimal.obtenerValorDefecto(rangoInicial);
            return this;
        }
        public Builder rangoFinal(final float rangoFinal) {
            this.rangoFinal = UtilDecimal.obtenerValorDefecto(rangoFinal);
            return this;
        }
        public CategoriaCalidadDominio build() {
            return new CategoriaCalidadDominio(this);
        }
    }
}
