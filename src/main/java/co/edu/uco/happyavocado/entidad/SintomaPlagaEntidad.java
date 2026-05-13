package co.edu.uco.happyavocado.entidad;

import co.edu.uco.happyavocado.transversal.utilitario.UtilId;
import co.edu.uco.happyavocado.transversal.utilitario.UtilTexto;

import java.util.UUID;

public class SintomaPlagaEntidad {
    private UUID id;
    private PlagaEntidad plaga;
    private SintomaEntidad sintoma;
    private String observacion;

    private SintomaPlagaEntidad(final Builder builder) {
        setId(builder.id);
        setPlaga(builder.plaga);
        setSintoma(builder.sintoma);
        setObservacion(builder.observacion);
    }

    public PlagaEntidad getPlaga() {
        return plaga;
    }

    private void setPlaga(final PlagaEntidad plaga) {
        this.plaga = plaga;
    }

    public SintomaEntidad getSintoma() {
        return sintoma;
    }

    private void setSintoma(final SintomaEntidad sintoma) {
        this.sintoma = sintoma;
    }

    public String getObservacion() {
        return observacion;
    }

    private void setObservacion(final String observacion) {
        this.observacion = observacion;
    }

    public UUID getId() {
        return id;
    }

    private void setId(final UUID id) {
        this.id = id;
    }

    public static class Builder {
        private UUID id;
        private SintomaEntidad sintoma;
        private PlagaEntidad plaga;
        private String observacion;

        public Builder id(final UUID id) {
            this.id = UtilId.obtenerValorDefecto(id);
            return this;
        }

        public Builder sintoma(final SintomaEntidad sintoma) {
            this.sintoma = sintoma;
            return this;
        }

        public Builder plaga(final PlagaEntidad plaga) {
            this.plaga = plaga;
            return this;
        }

        public Builder observacion(final String observacion) {
            this.observacion = UtilTexto.aplicarTrim(observacion);
            return this;
        }

        public SintomaPlagaEntidad build() {
            return new SintomaPlagaEntidad(this);
        }
    }
}
