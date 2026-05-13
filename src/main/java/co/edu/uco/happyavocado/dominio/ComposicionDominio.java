package co.edu.uco.happyavocado.dominio;

import co.edu.uco.happyavocado.transversal.utilitario.UtilDecimal;
import co.edu.uco.happyavocado.transversal.utilitario.UtilId;
import java.util.UUID;

public class ComposicionDominio {
    private UUID id;
    private AbonoDominio abono;
    private ElementoQuimicoDominio elementoQuimico;
    private float concentracion;
    private UnidadDominio unidad;

    private ComposicionDominio(final Builder builder) {
        setId(builder.id);
        setAbono(builder.abono);
        setElementoQuimico(builder.elementoQuimico);
        setConcentracion(builder.concentracion);
        setUnidad(builder.unidad);
    }

    public UnidadDominio getUnidad() {
        return unidad;
    }

    private void setUnidad( final UnidadDominio unidad) {
        this.unidad = unidad;
    }

    public float getConcentracion() {
        return concentracion;
    }

    private void setConcentracion(final float concentracion) {
        this.concentracion = concentracion;
    }

    public AbonoDominio getAbono() {
        return abono;
    }

    private void setAbono(final AbonoDominio abono) {
        this.abono = abono;
    }

    public ElementoQuimicoDominio getElementoQuimico() {
        return elementoQuimico;
    }

    private void setElementoQuimico( final ElementoQuimicoDominio elementoQuimico) {
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
        private AbonoDominio abono;
        private ElementoQuimicoDominio elementoQuimico;
        private float concentracion;
        private UnidadDominio unidad;

        public Builder id(final UUID id) {
            this.id= UtilId.obtenerValorDefecto(id);
            return this;
        }

        public Builder abono(final AbonoDominio abono) {
            this.abono = abono;
            return this;
        }

        public Builder elementoQuimico(final ElementoQuimicoDominio elementoQuimico) {
            this.elementoQuimico = elementoQuimico;
            return this;
        }

        public Builder concentracion(final float concentracion) {
            this.concentracion = UtilDecimal.obtenerValorDefecto(concentracion);
            return this;
        }

        public Builder unidad(final UnidadDominio unidad) {
            this.unidad= unidad;
            return this;
        }

        public ComposicionDominio build() {
            return new ComposicionDominio(this);
        }
    }
}
