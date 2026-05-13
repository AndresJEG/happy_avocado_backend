package co.edu.uco.happyavocado.dominio;

import co.edu.uco.happyavocado.transversal.utilitario.UtilFecha;
import co.edu.uco.happyavocado.transversal.utilitario.UtilId;

import java.time.LocalDate;
import java.util.UUID;

public class PodaArbolAguacateDominio {
    private UUID id;
    private ArbolAguacateDominio arbolAguacate;
    private PodaDominio motivoPoda;
    private LocalDate fechaPoda;

    private PodaArbolAguacateDominio(final Builder builder) {
        setId(builder.id);
        setArbolAguacate(builder.arbolAguacate);
        setMotivoPoda(builder.motivoPoda);
        setFechaPoda(builder.fechaPoda);
    }

    public PodaDominio motivoPoda() {
        return motivoPoda;
    }

    private void setMotivoPoda( final PodaDominio motivoPoda) {
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

    public ArbolAguacateDominio getArbolAguacate() {
        return arbolAguacate;
    }

    private void setArbolAguacate(final ArbolAguacateDominio arbolAguacate) {
        this.arbolAguacate = arbolAguacate;
    }

    public static class Builder {
        private UUID id;
        private ArbolAguacateDominio arbolAguacate;
        private PodaDominio motivoPoda;
        private LocalDate fechaPoda;

        public Builder id(final UUID id) {
            this.id= UtilId.obtenerValorDefecto(id);
            return this;
        }

        public Builder arbolAguacate(final ArbolAguacateDominio arbolAguacate) {
            this.arbolAguacate = arbolAguacate;
            return this;
        }

        public Builder motivoPoda(final PodaDominio motivoPoda) {
            this.motivoPoda = motivoPoda;
            return this;
        }

        public Builder fechaPoda(final LocalDate fechaPoda) {
            this.fechaPoda = UtilFecha.obtenerValorDefecto(fechaPoda);
            return this;
        }


        public PodaArbolAguacateDominio build() {
            return new PodaArbolAguacateDominio(this);
        }
    }
}
