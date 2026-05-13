package co.edu.uco.happyavocado.dto;

import co.edu.uco.happyavocado.transversal.utilitario.UtilDecimal;
import co.edu.uco.happyavocado.transversal.utilitario.UtilFecha;
import co.edu.uco.happyavocado.transversal.utilitario.UtilId;
import co.edu.uco.happyavocado.transversal.utilitario.UtilTexto;

import java.time.LocalDate;
import java.util.UUID;

public class ArbolAguacateDTO {
    private UUID id;
    private String codigo;
    private float coordenadaX;
    private float coordenadaY;
    private UnidadDTO unidadCoordenada;
    private LocalDate fechaPlantacion;

    private ArbolAguacateDTO(final Builder builder) {
        setId(builder.id);
        setCodigo(builder.codigo);
        setCoordenadaX(builder.coordenadaX);
        setCoordenadaY(builder.coordenadaY);
        setUnidadCoordenada(builder.unidadCoordenada);
        setFechaPlantacion(builder.fechaPlantacion);
    }

    public UnidadDTO getUnidadCoordenada() {
        return unidadCoordenada;
    }

    private void setUnidadCoordenada( final UnidadDTO unidadCoordenada) {
        this.unidadCoordenada = unidadCoordenada;
    }

    public float getCoordenadaY() {
        return coordenadaY;
    }

    private void setCoordenadaY(final float coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public float getCoordenadaX() {
        return coordenadaX;
    }

    private void setCoordenadaX(final float coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public LocalDate getFechaPlantacion() {
        return fechaPlantacion;
    }

    private void setFechaPlantacion( final LocalDate fechaPlantacion) {
        this.fechaPlantacion = fechaPlantacion;
    }

    public UUID getId() {
        return id;
    }

    private void setId(final UUID id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    private void setCodigo(final String codigo) {
        this.codigo = codigo;
    }

    public static class Builder {
        private UUID id;
        private String codigo;
        private float coordenadaX;
        private float coordenadaY;
        private UnidadDTO unidadCoordenada;
        private LocalDate fechaPlantacion;

        public Builder id(final UUID id) {
            this.id= UtilId.obtenerValorDefecto(id);
            return this;
        }

        public Builder codigo(final String codigo) {
            this.codigo = UtilTexto.aplicarTrim(codigo);
            return this;
        }

        public Builder coordenadaX(final float coordenadaX) {
            this.coordenadaX= UtilDecimal.obtenerValorDefecto(coordenadaX);
            return this;
        }

        public Builder coordenadaY(final float coordenadaY) {
            this.coordenadaY = UtilDecimal.obtenerValorDefecto(coordenadaY);
            return this;
        }

        public Builder unidadCoordenada(final UnidadDTO unidadCoordenada) {
            this.unidadCoordenada= unidadCoordenada;
            return this;
        }

        public Builder fechaPlantacion(final LocalDate fechaPlantacion) {
            this.fechaPlantacion = UtilFecha.obtenerValorDefecto(fechaPlantacion);
            return this;
        }

        public ArbolAguacateDTO build() {
            return new ArbolAguacateDTO(this);
        }
    }
}
