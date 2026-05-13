package co.edu.uco.happyavocado.entidad;

import co.edu.uco.happyavocado.transversal.utilitario.UtilDecimal;
import co.edu.uco.happyavocado.transversal.utilitario.UtilId;
import co.edu.uco.happyavocado.transversal.utilitario.UtilFecha;

import java.time.LocalDate;
import java.util.UUID;

public class AbonoArbolAguacateEntidad {
    private UUID id;
    private ArbolAguacateEntidad arbolAguacate;
    private AbonoEntidad abono;
    private LocalDate fechaAbono;
    private float cantidad;
    private UnidadEntidad unidad;

    private AbonoArbolAguacateEntidad(final Builder builder) {
        setId(builder.id);
        setArbolAguacate(builder.arbolAguacate);
        setAbono(builder.abono);
        setFechaAbono(builder.fechaAbono);
        setCantidad(builder.cantidad);
        setUnidad(builder.unidad);
    }

    public UnidadEntidad getUnidad() {
        return unidad;
    }

    private void setUnidad(final UnidadEntidad unidad) {
        this.unidad = unidad;
    }

    public float getCantidad() {
        return cantidad;
    }

    private void setCantidad(final float cantidad) {
        this.cantidad = cantidad;
    }

    public ArbolAguacateEntidad getArbolAguacate() {
        return arbolAguacate;
    }

    private void setArbolAguacate(final ArbolAguacateEntidad arbolAguacate) {
        this.arbolAguacate = arbolAguacate;
    }

    public AbonoEntidad getAbono() {
        return abono;
    }

    private void setAbono(final AbonoEntidad abono) {
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
        private ArbolAguacateEntidad arbolAguacate;
        private AbonoEntidad abono;
        private LocalDate fechaAbono;
        private float cantidad;
        private UnidadEntidad unidad;

        public Builder id(final UUID id) {
            this.id = UtilId.obtenerValorDefecto(id);
            return this;
        }

        public Builder arbolAguacate(final ArbolAguacateEntidad arbolAguacate) {
            this.arbolAguacate = arbolAguacate;
            return this;
        }

        public Builder abono(final AbonoEntidad abono) {
            this.abono = abono;
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

        public Builder unidad(final UnidadEntidad unidad) {
            this.unidad = unidad;
            return this;
        }

        public AbonoArbolAguacateEntidad build() {
            return new AbonoArbolAguacateEntidad(this);
        }
    }
}
