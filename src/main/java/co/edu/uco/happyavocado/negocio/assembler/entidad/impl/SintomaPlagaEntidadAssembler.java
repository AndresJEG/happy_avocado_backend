package co.edu.uco.happyavocado.negocio.assembler.entidad.impl;

import co.edu.uco.happyavocado.dominio.SintomaPlagaDominio;
import co.edu.uco.happyavocado.entidad.SintomaPlagaEntidad;
import co.edu.uco.happyavocado.negocio.assembler.entidad.EntidadAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class SintomaPlagaEntidadAssembler implements EntidadAssembler<SintomaPlagaDominio, SintomaPlagaEntidad> {

    private static final EntidadAssembler<SintomaPlagaDominio, SintomaPlagaEntidad> INSTANCE = new SintomaPlagaEntidadAssembler();

    private SintomaPlagaEntidadAssembler() { super(); }

    public static final EntidadAssembler<SintomaPlagaDominio, SintomaPlagaEntidad> getInstance() { return INSTANCE; }

    @Override
    public SintomaPlagaDominio ensamblarDominio(final SintomaPlagaEntidad entidad) {
        var obj = UtilObjeto.obtenerValorDefecto(entidad, new SintomaPlagaEntidad.Builder().build());
        return new SintomaPlagaDominio.Builder()
                .id(obj.getId())
                .plaga(PlagaEntidadAssembler.getInstance().ensamblarDominio(obj.getPlaga()))
                .sintoma(SintomaEntidadAssembler.getInstance().ensamblarDominio(obj.getSintoma()))
                .observacion(obj.getObservacion())
                .build();
    }

    @Override
    public SintomaPlagaEntidad ensamblarEntidad(final SintomaPlagaDominio dominio) {
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new SintomaPlagaDominio.Builder().build());
        return new SintomaPlagaEntidad.Builder()
                .id(obj.getId())
                .plaga(PlagaEntidadAssembler.getInstance().ensamblarEntidad(obj.plaga()))
                .sintoma(SintomaEntidadAssembler.getInstance().ensamblarEntidad(obj.sintoma()))
                .observacion(obj.getObservacion())
                .build();
    }
}