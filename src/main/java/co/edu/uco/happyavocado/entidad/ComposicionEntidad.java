package co.edu.uco.happyavocado.entidad;

import co.edu.uco.happyavocado.transversal.utilitario.UtilDecimal;
import co.edu.uco.happyavocado.transversal.utilitario.UtilId;
import java.util.UUID;

public class ComposicionEntidad {
    private UUID id;
    private AbonoEntidad abono;
    private ElementoQuimicoEntidad elementoQuimico;
    private float concentracion;
    private UnidadEntidad unidad;

    private ComposicionEntidad(final Builder builder) {
        setId(builder.id);
        setAbono(builder.abono);
        setElementoQuimico(builder.elementoQuimico);
        setConcentracion(builder.concentracion);
        setUnidad(builder.unidad);
    }

    public UnidadEntidad getUnidad() {
        return unidad;
    }

    private void setUnidad(final UnidadEntidad unidad) {
        this.unidad = unidad;
    }

    public float getConcentracion() {
        return concentracion;
    }

    private void setConcentracion(final float concentracion) {
        this.concentracion = concentracion;
    }

    public AbonoEntidad getAbono() {
        return abono;
    }

    private void setAbono(final AbonoEntidad abono) {
        this.abono = abono;
    }

    public ElementoQuimicoEntidad getElementoQuimico() {
        return elementoQuimico;
    }

    private void setElementoQuimico(final ElementoQuimicoEntidad elementoQuimico) {
        this.elementoQuimico = elementoQuimico;
    }

    public UUID getId() {
        return id;
    }

    private void setId(final UUID id) {
        this.id = id;
    }

    public static class Builder {
        private UUID id;
        private AbonoEntidad abono;
        private ElementoQuimicoEntidad elementoQuimico;
        private float concentracion;
        private UnidadEntidad unidad;

        public Builder id(final UUID id) {
            this.id = UtilId.obtenerValorDefecto(id);
            return this;
        }

        public Builder abono(final AbonoEntidad abono) {
            this.abono = abono;
            return this;
        }

        public Builder elementoQuimico(final ElementoQuimicoEntidad elementoQuimico) {
            this.elementoQuimico = elementoQuimico;
            return this;
        }

        public Builder concentracion(final float concentracion) {
            this.concentracion = UtilDecimal.obtenerValorDefecto(concentracion);
            return this;
        }

        public Builder unidad(final UnidadEntidad unidad) {
            this.unidad = unidad;
            return this;
        }

        public ComposicionEntidad build() {
            return new ComposicionEntidad(this);
        }
    }
}