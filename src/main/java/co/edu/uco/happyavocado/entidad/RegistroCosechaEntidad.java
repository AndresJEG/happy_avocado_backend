package co.edu.uco.happyavocado.entidad;

import co.edu.uco.happyavocado.transversal.utilitario.UtilDecimal;
import co.edu.uco.happyavocado.transversal.utilitario.UtilFecha;
import co.edu.uco.happyavocado.transversal.utilitario.UtilId;

import java.time.LocalDate;
import java.util.UUID;

public class RegistroCosechaEntidad {
    private UUID id;
    private ArbolAguacateEntidad arbolAguacate;
    private CategoriaCalidadEntidad categoriaCalidad;
    private LocalDate fechaCosecha;
    private float pesoCosecha;
    private UnidadEntidad unidad;

    private RegistroCosechaEntidad(final Builder builder) {
        setId(builder.id);
        setArbolAguacate(builder.arbolAguacate);
        setCategoriaCalidad(builder.categoriaCalidad);
        setFechaCosecha(builder.fechaCosecha);
        setPesoCosecha(builder.pesoCosecha);
        setUnidad(builder.unidad);
    }

    public UnidadEntidad getUnidad() {
        return unidad;
    }

    private void setUnidad(final UnidadEntidad unidad) {
        this.unidad = unidad;
    }

    public float getPesoCosecha() {
        return pesoCosecha;
    }

    private void setPesoCosecha(final float pesoCosecha) {
        this.pesoCosecha = pesoCosecha;
    }

    public ArbolAguacateEntidad getArbolAguacate() {
        return arbolAguacate;
    }

    private void setArbolAguacate(final ArbolAguacateEntidad arbolAguacate) {
        this.arbolAguacate = arbolAguacate;
    }


    public CategoriaCalidadEntidad getCategoriaCalidad() {
        return categoriaCalidad;
    }

    private void setCategoriaCalidad(final CategoriaCalidadEntidad categoriaCalidad) {
        this.categoriaCalidad = categoriaCalidad;
    }

    public UUID getId() {
        return id;
    }

    private void setId(final UUID id) {
        this.id = id;
    }

    public LocalDate getFechaCosecha() {
        return fechaCosecha;
    }

    private void setFechaCosecha(final LocalDate fechaCosecha) {
        this.fechaCosecha = fechaCosecha;
    }

    public static class Builder {
        private UUID id;
        private ArbolAguacateEntidad arbolAguacate;
        private CategoriaCalidadEntidad categoriaCalidad;
        private LocalDate fechaCosecha;
        private float pesoCosecha;
        private UnidadEntidad unidad;

        public Builder id(final UUID id) {
            this.id = UtilId.obtenerValorDefecto(id);
            return this;
        }

        public Builder arbolAguacate(final ArbolAguacateEntidad arbolAguacate) {
            this.arbolAguacate = arbolAguacate;
            return this;
        }

        public Builder categoriaCalidad(final CategoriaCalidadEntidad categoriaCalidad) {
            this.categoriaCalidad = categoriaCalidad;
            return this;
        }

        public Builder fechaCosecha(final LocalDate fechaCosecha) {
            this.fechaCosecha = UtilFecha.obtenerValorDefecto(fechaCosecha);
            return this;
        }

        public Builder pesoCosecha(final float pesoCosecha) {
            this.pesoCosecha = UtilDecimal.obtenerValorDefecto(pesoCosecha);
            return this;
        }

        public Builder unidad(final UnidadEntidad unidad) {
            this.unidad = unidad;
            return this;
        }

        public RegistroCosechaEntidad build() {
            return new RegistroCosechaEntidad(this);
        }
    }
}
