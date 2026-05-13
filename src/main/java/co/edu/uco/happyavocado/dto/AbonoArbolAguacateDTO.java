package co.edu.uco.happyavocado.dto;

import co.edu.uco.happyavocado.transversal.utilitario.UtilDecimal;
import co.edu.uco.happyavocado.transversal.utilitario.UtilFecha;
import co.edu.uco.happyavocado.transversal.utilitario.UtilId;

import java.time.LocalDate;
import java.util.UUID;

public class AbonoArbolAguacateDTO {
    private UUID id;
    private ArbolAguacateDTO arbolAguacate;
    private AbonoDTO abono;
    private LocalDate fechaAbono;
    private float cantidad;
    private UnidadDTO unidad;

    private AbonoArbolAguacateDTO(final Builder builder) {
        setId(builder.id);
        setArbolAguacate(builder.arbolAguacate);
        setAbono(builder.abono);
        setFechaAbono(builder.fechaAbono);
        setCantidad(builder.cantidad);
        setUnidad(builder.unidad);
    }

    public UnidadDTO getUnidad() {
        return unidad;
    }

    private void setUnidad( final UnidadDTO unidad) {
        this.unidad = unidad;
    }

    public float getCantidad() {
        return cantidad;
    }

    private void setCantidad(final float cantidad) {
        this.cantidad = cantidad;
    }

    public ArbolAguacateDTO getArbolAguacate() {
        return arbolAguacate;
    }

    private void setArbolAguacate(final ArbolAguacateDTO arbolAguacate) {
        this.arbolAguacate = arbolAguacate;
    }


    public AbonoDTO getAbono() {
        return abono;
    }

    private void setAbono( final AbonoDTO abono) {
        this.abono = abono;
    }

    public UUID getId() {
        return id;
    }

    private void setId(final UUID id) {
        this.id = id;
    }

    public LocalDate getFechaAbono() {
        return fechaAbono;
    }

    private void setFechaAbono(final LocalDate fechaAbono) {
        this.fechaAbono = fechaAbono;
    }

    public static class Builder {
        private UUID id;
        private ArbolAguacateDTO arbolAguacate;
        private AbonoDTO abono;
        private LocalDate fechaAbono;
        private float cantidad;
        private UnidadDTO unidad;

        public Builder id(final UUID id) {
            this.id= UtilId.obtenerValorDefecto(id);
            return this;
        }

        public Builder arbolAguacate(final ArbolAguacateDTO arbolAguacate) {
            this.arbolAguacate = arbolAguacate;
            return this;
        }

        public Builder abono(final AbonoDTO abono) {
            this.abono= abono;
            return this;
        }

        public Builder fechaAbono(final LocalDate fechaAbono) {
            this.fechaAbono = UtilFecha.obtenerValorDefecto(fechaAbono);
            return this;
        }

        public Builder cantidad(final float cantidad) {
            this.cantidad = UtilDecimal.obtenerValorDefecto(cantidad);
            return this;
        }

        public Builder unidad(final UnidadDTO unidad) {
            this.unidad = unidad;
            return this;
        }

        public AbonoArbolAguacateDTO build() {
            return new AbonoArbolAguacateDTO(this);
        }
    }
}