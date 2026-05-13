package co.edu.uco.happyavocado.entidad;

import co.edu.uco.happyavocado.transversal.utilitario.UtilFecha;
import co.edu.uco.happyavocado.transversal.utilitario.UtilId;

import java.time.LocalDate;
import java.util.UUID;

public class PodaArbolAguacateEntidad {
    private UUID id;
    private ArbolAguacateEntidad arbolAguacate;
    private PodaEntidad motivoPoda;
    private LocalDate fechaPoda;

    private PodaArbolAguacateEntidad(final Builder builder) {
        setId(builder.id);
        setArbolAguacate(builder.arbolAguacate);
        setMotivoPoda(builder.motivoPoda);
        setFechaPoda(builder.fechaPoda);
    }

    public PodaEntidad getMotivoPoda() {
        return motivoPoda;
    }

    private void setMotivoPoda(final PodaEntidad motivoPoda) {
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

    public ArbolAguacateEntidad getArbolAguacate() {
        return arbolAguacate;
    }

    private void setArbolAguacate(final ArbolAguacateEntidad arbolAguacate) {
        this.arbolAguacate = arbolAguacate;
    }

    public static class Builder {
        private UUID id;
        private ArbolAguacateEntidad arbolAguacate;
        private PodaEntidad motivoPoda;
        private LocalDate fechaPoda;

        public Builder id(final UUID id) {
            this.id = UtilId.obtenerValorDefecto(id);
            return this;
        }

        public Builder arbolAguacate(final ArbolAguacateEntidad arbolAguacate) {
            this.arbolAguacate = arbolAguacate;
            return this;
        }

        public Builder motivoPoda(final PodaEntidad motivoPoda) {
            this.motivoPoda = motivoPoda;
            return this;
        }

        public Builder fechaPoda(final LocalDate fechaPoda) {
            this.fechaPoda = UtilFecha.obtenerValorDefecto(fechaPoda);
            return this;
        }

        public PodaArbolAguacateEntidad build() {
            return new PodaArbolAguacateEntidad(this);
        }
    }
}
