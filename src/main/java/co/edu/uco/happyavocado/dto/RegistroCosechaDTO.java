package co.edu.uco.happyavocado.dto;

import co.edu.uco.happyavocado.transversal.utilitario.UtilDecimal;
import co.edu.uco.happyavocado.transversal.utilitario.UtilFecha;
import co.edu.uco.happyavocado.transversal.utilitario.UtilId;

import java.time.LocalDate;
import java.util.UUID;

public class RegistroCosechaDTO {
    private UUID id;
    private ArbolAguacateDTO arbolAguacate;
    private CategoriaCalidadDTO categoriaCalidad;
    private LocalDate fechaCosecha;
    private float pesoCosecha;
    private UnidadDTO unidad;

    private RegistroCosechaDTO(final Builder builder) {
        setId(builder.id);
        setArbolAguacate(builder.arbolAguacate);
        setCategoriaCalidad(builder.categoriaCalidad);
        setFechaCosecha(builder.fechaCosecha);
        setPesoCosecha(builder.pesoCosecha);
        setUnidad(builder.unidad);
    }

    public UnidadDTO Unidad() {
        return unidad;
    }

    private void setUnidad( final UnidadDTO unidad) {
        this.unidad = unidad;
    }

    public float getPesoCosecha() {
        return pesoCosecha;
    }

    private void setPesoCosecha(final float pesoCosecha) {
        this.pesoCosecha = pesoCosecha;
    }

    public ArbolAguacateDTO getArbolAguacate() {
        return arbolAguacate;
    }

    private void setArbolAguacate(final ArbolAguacateDTO arbolAguacate) {
        this.arbolAguacate = arbolAguacate;
    }


    public CategoriaCalidadDTO getCategoriaCalidad() {
        return categoriaCalidad;
    }

    private void setCategoriaCalidad( final CategoriaCalidadDTO categoriaCalidad) {
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
        private ArbolAguacateDTO arbolAguacate;
        private CategoriaCalidadDTO categoriaCalidad;
        private LocalDate fechaCosecha;
        private float pesoCosecha;
        private UnidadDTO unidad;

        public Builder id(final UUID id) {
            this.id= UtilId.obtenerValorDefecto(id);
            return this;
        }

        public Builder unidad(final UnidadDTO unidad) {
            this.unidad= unidad;
            return this;
        }

        public Builder arbolAguacate(final ArbolAguacateDTO arbolAguacate) {
            this.arbolAguacate = arbolAguacate;
            return this;
        }

        public Builder categoriaCalidad(final CategoriaCalidadDTO categoriaCalidad) {
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

        public RegistroCosechaDTO build() {
            return new RegistroCosechaDTO(this);
        }
    }
}
