package co.edu.uco.happyavocado.negocio.assembler.entidad.impl;

import co.edu.uco.happyavocado.dominio.PlagaDominio;
import co.edu.uco.happyavocado.entidad.PlagaEntidad;
import co.edu.uco.happyavocado.negocio.assembler.entidad.EntidadAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class PlagaEntidadAssembler implements EntidadAssembler<PlagaDominio, PlagaEntidad> {

    private static final EntidadAssembler<PlagaDominio, PlagaEntidad> INSTANCE = new PlagaEntidadAssembler();

    private PlagaEntidadAssembler() { super(); }

    public static final EntidadAssembler<PlagaDominio, PlagaEntidad> getInstance() { return INSTANCE; }

    @Override
    public PlagaDominio ensamblarDominio(final PlagaEntidad entidad) {
        var obj = UtilObjeto.obtenerValorDefecto(entidad, new PlagaEntidad.Builder().build());
        return new PlagaDominio.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .origen(obj.getOrigen())
                .esContagioso(obj.EsContagioso())
                .build();
    }

    @Override
    public PlagaEntidad ensamblarEntidad(final PlagaDominio dominio) {
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new PlagaDominio.Builder().build());
        return new PlagaEntidad.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .origen(obj.getOrigen())
                .esContagioso(obj.EsContagioso())
                .build();
    }
}