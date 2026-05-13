package co.edu.uco.happyavocado.negocio.assembler.entidad.impl;

import co.edu.uco.happyavocado.dominio.SintomaDominio;
import co.edu.uco.happyavocado.entidad.SintomaEntidad;
import co.edu.uco.happyavocado.negocio.assembler.entidad.EntidadAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class SintomaEntidadAssembler implements EntidadAssembler<SintomaDominio, SintomaEntidad> {

    private static final EntidadAssembler<SintomaDominio, SintomaEntidad> INSTANCE = new SintomaEntidadAssembler();

    private SintomaEntidadAssembler() { super(); }

    public static final EntidadAssembler<SintomaDominio, SintomaEntidad> getInstance() { return INSTANCE; }

    @Override
    public SintomaDominio ensamblarDominio(final SintomaEntidad entidad) {
        var obj = UtilObjeto.obtenerValorDefecto(entidad, new SintomaEntidad.Builder().build());
        return new SintomaDominio.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .descripcion(obj.getDescripcion())
                .parteArbolAfectada(ParteArbolAfectadaEntidadAssembler.getInstance().ensamblarDominio(obj.getParteArbolAfectada()))
                .build();
    }

    @Override
    public SintomaEntidad ensamblarEntidad(final SintomaDominio dominio) {
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new SintomaDominio.Builder().build());
        return new SintomaEntidad.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .descripcion(obj.getDescripcion())
                .parteArbolAfectada(ParteArbolAfectadaEntidadAssembler.getInstance().ensamblarEntidad(obj.getParteArbolAfectada()))
                .build();
    }
}