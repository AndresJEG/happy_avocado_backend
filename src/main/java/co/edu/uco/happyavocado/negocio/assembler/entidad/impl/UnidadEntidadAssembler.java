package co.edu.uco.happyavocado.negocio.assembler.entidad.impl;

import co.edu.uco.happyavocado.dominio.UnidadDominio;
import co.edu.uco.happyavocado.entidad.UnidadEntidad;
import co.edu.uco.happyavocado.negocio.assembler.entidad.EntidadAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class UnidadEntidadAssembler implements EntidadAssembler<UnidadDominio, UnidadEntidad> {

    private static final EntidadAssembler<UnidadDominio, UnidadEntidad> INSTANCE = new UnidadEntidadAssembler();

    private UnidadEntidadAssembler() { super(); }

    public static final EntidadAssembler<UnidadDominio, UnidadEntidad> getInstance() { return INSTANCE; }

    @Override
    public UnidadDominio ensamblarDominio(final UnidadEntidad entidad) {
        var obj = UtilObjeto.obtenerValorDefecto(entidad, new UnidadEntidad.Builder().build());
        return new UnidadDominio.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .abreviacion(obj.getAbreviacion())
                .tipoMagnitud(TipoMagnitudEntidadAssembler.getInstance().ensamblarDominio(obj.getTipoMagnitud()))
                .build();
    }

    @Override
    public UnidadEntidad ensamblarEntidad(final UnidadDominio dominio) {
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new UnidadDominio.Builder().build());
        return new UnidadEntidad.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .abreviacion(obj.getAbreviacion())
                .tipoMagnitud(TipoMagnitudEntidadAssembler.getInstance().ensamblarEntidad(obj.getTipoMagnitud()))
                .build();
    }
}