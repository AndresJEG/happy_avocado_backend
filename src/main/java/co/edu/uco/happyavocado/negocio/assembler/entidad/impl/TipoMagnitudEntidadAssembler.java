package co.edu.uco.happyavocado.negocio.assembler.entidad.impl;

import co.edu.uco.happyavocado.dominio.TipoMagnitudDominio;
import co.edu.uco.happyavocado.entidad.TipoMagnitudEntidad;
import co.edu.uco.happyavocado.negocio.assembler.entidad.EntidadAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class TipoMagnitudEntidadAssembler implements EntidadAssembler<TipoMagnitudDominio, TipoMagnitudEntidad> {

    private static final EntidadAssembler<TipoMagnitudDominio, TipoMagnitudEntidad> INSTANCE = new TipoMagnitudEntidadAssembler();

    private TipoMagnitudEntidadAssembler() { super(); }

    public static final EntidadAssembler<TipoMagnitudDominio, TipoMagnitudEntidad> getInstance() { return INSTANCE; }

    @Override
    public TipoMagnitudDominio ensamblarDominio(final TipoMagnitudEntidad entidad) {
        var obj = UtilObjeto.obtenerValorDefecto(entidad, new TipoMagnitudEntidad.Builder().build());
        return new TipoMagnitudDominio.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .build();
    }

    @Override
    public TipoMagnitudEntidad ensamblarEntidad(final TipoMagnitudDominio dominio) {
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new TipoMagnitudDominio.Builder().build());
        return new TipoMagnitudEntidad.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .build();
    }
}