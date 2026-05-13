package co.edu.uco.happyavocado.negocio.assembler.entidad.impl;

import co.edu.uco.happyavocado.dominio.PodaDominio;
import co.edu.uco.happyavocado.entidad.PodaEntidad;
import co.edu.uco.happyavocado.negocio.assembler.entidad.EntidadAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class PodaEntidadAssembler implements EntidadAssembler<PodaDominio, PodaEntidad> {

    private static final EntidadAssembler<PodaDominio, PodaEntidad> INSTANCE = new PodaEntidadAssembler();

    private PodaEntidadAssembler() { super(); }

    public static final EntidadAssembler<PodaDominio, PodaEntidad> getInstance() { return INSTANCE; }

    @Override
    public PodaDominio ensamblarDominio(final PodaEntidad entidad) {
        var obj = UtilObjeto.obtenerValorDefecto(entidad, new PodaEntidad.Builder().build());
        return new PodaDominio.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .descripcion(obj.getDescripcion())
                .build();
    }

    @Override
    public PodaEntidad ensamblarEntidad(final PodaDominio dominio) {
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new PodaDominio.Builder().build());
        return new PodaEntidad.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .descripcion(obj.getDescripcion())
                .build();
    }
}