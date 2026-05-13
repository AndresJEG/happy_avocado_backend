package co.edu.uco.happyavocado.negocio.assembler.entidad.impl;

import co.edu.uco.happyavocado.dominio.ParteArbolAfectadaDominio;
import co.edu.uco.happyavocado.entidad.ParteArbolAfectadaEntidad;
import co.edu.uco.happyavocado.negocio.assembler.entidad.EntidadAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class ParteArbolAfectadaEntidadAssembler implements EntidadAssembler<ParteArbolAfectadaDominio, ParteArbolAfectadaEntidad> {

    private static final EntidadAssembler<ParteArbolAfectadaDominio, ParteArbolAfectadaEntidad> INSTANCE = new ParteArbolAfectadaEntidadAssembler();

    private ParteArbolAfectadaEntidadAssembler() { super(); }

    public static final EntidadAssembler<ParteArbolAfectadaDominio, ParteArbolAfectadaEntidad> getInstance() { return INSTANCE; }

    @Override
    public ParteArbolAfectadaDominio ensamblarDominio(final ParteArbolAfectadaEntidad entidad) {
        var obj = UtilObjeto.obtenerValorDefecto(entidad, new ParteArbolAfectadaEntidad.Builder().build());
        return new ParteArbolAfectadaDominio.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .descripcion(obj.getDescripcion())
                .build();
    }

    @Override
    public ParteArbolAfectadaEntidad ensamblarEntidad(final ParteArbolAfectadaDominio dominio) {
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new ParteArbolAfectadaDominio.Builder().build());
        return new ParteArbolAfectadaEntidad.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .descripcion(obj.getDescripcion())
                .build();
    }
}