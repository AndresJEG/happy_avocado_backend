package co.edu.uco.happyavocado.dominio;

import co.edu.uco.happyavocado.transversal.utilitario.UtilFecha;
import co.edu.uco.happyavocado.transversal.utilitario.UtilId;

import java.time.LocalDate;
import java.util.UUID;

public class PlagaArbolAguacateDominio {
    private UUID id;
    private ArbolAguacateDominio arbolAguacate;
    private PlagaDominio plaga;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    private PlagaArbolAguacateDominio(final Builder builder) {
        setId(builder.id);
        setArbolAguacate(builder.arbolAguacate);
        setPlaga(builder.plaga);
        setFechaInicio(builder.fechaInicio);
        setFechaFin(builder.fechaFin);
    }

    public PlagaDominio plaga() {
        return plaga;
    }

    private void setPlaga( final PlagaDominio plaga) {
        this.plaga = plaga;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    private void setFechaInicio(final LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    private void setFechaFin(final LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public UUID getId() {
        return id;
    }

    private void setId(final UUID id) {
        this.id = id;
    }

    public ArbolAguacateDominio getArbolAguacate() {
        return arbolAguacate;
    }

    private void setArbolAguacate(final ArbolAguacateDominio arbolAguacate) {
        this.arbolAguacate = arbolAguacate;
    }

    public static class Builder {
        private UUID id;
        private ArbolAguacateDominio arbolAguacate;
        private PlagaDominio plaga;
        private LocalDate fechaInicio;
        private LocalDate fechaFin;

        public Builder id(final UUID id) {
            this.id= UtilId.obtenerValorDefecto(id);
            return this;
        }

        public Builder arbolAguacate(final ArbolAguacateDominio arbolAguacate) {
            this.arbolAguacate = arbolAguacate;
            return this;
        }

        public Builder plaga(final PlagaDominio plaga) {
            this.plaga= plaga;
            return this;
        }

        public Builder fechaInicio(final LocalDate fechaInicio) {
            this.fechaInicio = UtilFecha.obtenerValorDefecto(fechaInicio);
            return this;
        }

        public Builder fechaFin(final LocalDate fechaFin) {
            this.fechaFin = UtilFecha.obtenerValorDefecto(fechaFin);
            return this;
        }

        public PlagaArbolAguacateDominio build() {
            return new PlagaArbolAguacateDominio(this);
        }
    }
}

