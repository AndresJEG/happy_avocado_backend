package co.edu.uco.happyavocado.dto;

import co.edu.uco.happyavocado.transversal.utilitario.UtilDecimal;
import co.edu.uco.happyavocado.transversal.utilitario.UtilId;
import java.util.UUID;

public class ComposicionDTO {
    private UUID id;
    private AbonoDTO abono;
    private ElementoQuimicoDTO elementoQuimico;
    private float concentracion;
    private UnidadDTO unidad;

    private ComposicionDTO(final Builder builder) {
        setId(builder.id);
        setAbono(builder.abono);
        setElementoQuimico(builder.elementoQuimico);
        setConcentracion(builder.concentracion);
        setUnidad(builder.unidad);
    }

    public UnidadDTO unidad() {
        return unidad;
    }

    private void setUnidad( final UnidadDTO unidad) {
        this.unidad = unidad;
    }

    public float concentracion() {
        return concentracion;
    }

    private void setConcentracion(final float concentracion) {
        this.concentracion = concentracion;
    }

    public AbonoDTO getAbono() {
        return abono;
    }

    private void setAbono(final AbonoDTO abono) {
        this.abono = abono;
    }

    public ElementoQuimicoDTO getElementoQuimico() {
        return elementoQuimico;
    }

    private void setElementoQuimico( final ElementoQuimicoDTO elementoQuimico) {
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
        private AbonoDTO abono;
        private ElementoQuimicoDTO elementoQuimico;
        private float concentracion;
        private UnidadDTO unidad;

        public Builder id(final UUID id) {
            this.id= UtilId.obtenerValorDefecto(id);
            return this;
        }

        public Builder abono(final AbonoDTO abono) {
            this.abono = abono;
            return this;
        }

        public Builder elementoQuimico(final ElementoQuimicoDTO elementoQuimico) {
            this.elementoQuimico = elementoQuimico;
            return this;
        }

        public Builder concentracion(final float concentracion) {
            this.concentracion = UtilDecimal.obtenerValorDefecto(concentracion);
            return this;
        }

        public Builder unidad(final UnidadDTO unidad) {
            this.unidad= unidad;
            return this;
        }

        public ComposicionDTO build() {
            return new ComposicionDTO(this);
        }
    }
}
