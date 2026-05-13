package co.edu.uco.happyavocado.dto;

import co.edu.uco.happyavocado.transversal.utilitario.UtilFecha;
import co.edu.uco.happyavocado.transversal.utilitario.UtilId;

import java.time.LocalDate;
import java.util.UUID;

public class PodaArbolAguacateDTO {
    private UUID id;
    private ArbolAguacateDTO arbolAguacate;
    private PodaDTO motivoPoda;
    private LocalDate fechaPoda;

    private PodaArbolAguacateDTO(final Builder builder) {
        setId(builder.id);
        setArbolAguacate(builder.arbolAguacate);
        setMotivoPoda(builder.motivoPoda);
        setFechaPoda(builder.fechaPoda);
    }

    public PodaDTO motivoPoda() {
        return motivoPoda;
    }

    private void setMotivoPoda( final PodaDTO motivoPoda) {
        this.motivoPoda = motivoPoda;
    }

    public LocalDate getFechaPoda() {
        return fechaPoda;
    }

    private void setFechaPoda(final LocalDate fechaPoda) {
        this.fechaPoda = fechaPoda;
    }

    public UUID getId() {
        return id;
    }

    private void setId(final UUID id) {
        this.id = id;
    }

    public ArbolAguacateDTO getArbolAguacate() {
        return arbolAguacate;
    }

    private void setArbolAguacate(final ArbolAguacateDTO arbolAguacate) {
        this.arbolAguacate = arbolAguacate;
    }

    public static class Builder {
        private UUID id;
        private ArbolAguacateDTO arbolAguacate;
        private PodaDTO motivoPoda;
        private LocalDate fechaPoda;

        public Builder id(final UUID id) {
            this.id= UtilId.obtenerValorDefecto(id);
            return this;
        }

        public Builder arbolAguacate(final ArbolAguacateDTO arbolAguacate) {
            this.arbolAguacate = arbolAguacate;
            return this;
        }

        public Builder motivoPoda(final PodaDTO motivoPoda) {
            this.motivoPoda = motivoPoda;
            return this;
        }

        public Builder fechaPoda(final LocalDate fechaPoda) {
            this.fechaPoda = UtilFecha.obtenerValorDefecto(fechaPoda);
            return this;
        }


        public PodaArbolAguacateDTO build() {
            return new PodaArbolAguacateDTO(this);
        }
    }
}
