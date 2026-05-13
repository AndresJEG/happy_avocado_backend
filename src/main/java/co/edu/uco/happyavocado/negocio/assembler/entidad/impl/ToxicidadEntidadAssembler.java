package co.edu.uco.happyavocado.negocio.assembler.entidad.impl;

import co.edu.uco.happyavocado.dominio.ToxicidadDominio;
import co.edu.uco.happyavocado.entidad.ToxicidadEntidad;
import co.edu.uco.happyavocado.negocio.assembler.entidad.EntidadAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class ToxicidadEntidadAssembler implements EntidadAssembler<ToxicidadDominio, ToxicidadEntidad> {

    private static final EntidadAssembler<ToxicidadDominio, ToxicidadEntidad> INSTANCE = new ToxicidadEntidadAssembler();

    private ToxicidadEntidadAssembler() { super(); }

    public static final EntidadAssembler<ToxicidadDominio, ToxicidadEntidad> getInstance() { return INSTANCE; }

    @Override
    public ToxicidadDominio ensamblarDominio(final ToxicidadEntidad entidad) {
        var obj = UtilObjeto.obtenerValorDefecto(entidad, new ToxicidadEntidad.Builder().build());
        return new ToxicidadDominio.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .descripcion(obj.getDescripcion())
                .build();
    }

    @Override
    public ToxicidadEntidad ensamblarEntidad(final ToxicidadDominio dominio) {
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new ToxicidadDominio.Builder().build());
        return new ToxicidadEntidad.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .descripcion(obj.getDescripcion())
                .build();
    }
}