package co.edu.uco.happyavocado.dominio;

import co.edu.uco.happyavocado.transversal.utilitario.UtilDecimal;
import co.edu.uco.happyavocado.transversal.utilitario.UtilFecha;
import co.edu.uco.happyavocado.transversal.utilitario.UtilId;

import java.time.LocalDate;
import java.util.UUID;

public class RegistroCosechaDominio {
    private UUID id;
    private ArbolAguacateDominio arbolAguacate;
    private CategoriaCalidadDominio categoriaCalidad;
    private LocalDate fechaCosecha;
    private float pesoCosecha;
    private UnidadDominio unidad;

    private RegistroCosechaDominio(final Builder builder) {
        setId(builder.id);
        setArbolAguacate(builder.arbolAguacate);
        setCategoriaCalidad(builder.categoriaCalidad);
        setFechaCosecha(builder.fechaCosecha);
        setPesoCosecha(builder.pesoCosecha);
        setUnidad(builder.unidad);
    }

    public UnidadDominio Unidad() {
        return unidad;
    }

    private void setUnidad( final UnidadDominio unidad) {
        this.unidad = unidad;
    }

    public float getPesoCosecha() {
        return pesoCosecha;
    }

    private void setPesoCosecha(final float pesoCosecha) {
        this.pesoCosecha = pesoCosecha;
    }

    public ArbolAguacateDominio getArbolAguacate() {
        return arbolAguacate;
    }

    private void setArbolAguacate(final ArbolAguacateDominio arbolAguacate) {
        this.arbolAguacate = arbolAguacate;
    }


    public CategoriaCalidadDominio getCategoriaCalidad() {
        return categoriaCalidad;
    }

    private void setCategoriaCalidad( final CategoriaCalidadDominio categoriaCalidad) {
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
        private ArbolAguacateDominio arbolAguacate;
        private CategoriaCalidadDominio categoriaCalidad;
        private LocalDate fechaCosecha;
        private float pesoCosecha;
        private UnidadDominio unidad;

        public Builder id(final UUID id) {
            this.id= UtilId.obtenerValorDefecto(id);
            return this;
        }

        public Builder unidad(final UnidadDominio unidad) {
            this.unidad= unidad;
            return this;
        }

        public Builder arbolAguacate(final ArbolAguacateDominio arbolAguacate) {
            this.arbolAguacate = arbolAguacate;
            return this;
        }

        public Builder categoriaCalidad(final CategoriaCalidadDominio categoriaCalidad) {
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

        public RegistroCosechaDominio build() {
            return new RegistroCosechaDominio(this);
        }
    }
}

