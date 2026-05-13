package co.edu.uco.happyavocado.negocio.assembler.entidad.impl;

import co.edu.uco.happyavocado.dominio.ArbolAguacateDominio;
import co.edu.uco.happyavocado.entidad.ArbolAguacateEntidad;
import co.edu.uco.happyavocado.negocio.assembler.entidad.EntidadAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class ArbolAguacateEntidadAssembler implements EntidadAssembler<ArbolAguacateDominio, ArbolAguacateEntidad> {

    private static final EntidadAssembler<ArbolAguacateDominio, ArbolAguacateEntidad> INSTANCE = new ArbolAguacateEntidadAssembler();

    private ArbolAguacateEntidadAssembler() { super(); }

    public static final EntidadAssembler<ArbolAguacateDominio, ArbolAguacateEntidad> getInstance() { return INSTANCE; }

    @Override
    public ArbolAguacateDominio ensamblarDominio(final ArbolAguacateEntidad entidad) {
        var obj = UtilObjeto.obtenerValorDefecto(entidad, new ArbolAguacateEntidad.Builder().build());
        return new ArbolAguacateDominio.Builder()
                .id(obj.getId())
                .codigo(obj.getCodigo())
                .coordenadaX(obj.getCoordenadaX())
                .coordenadaY(obj.getCoordenadaY())
                .unidadCoordenada(UnidadEntidadAssembler.getInstance().ensamblarDominio(obj.getUnidadCoordenada()))
                .fechaPlantacion(obj.getFechaPlantacion())
                .build();
    }

    @Override
    public ArbolAguacateEntidad ensamblarEntidad(final ArbolAguacateDominio dominio) {
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new ArbolAguacateDominio.Builder().build());
        return new ArbolAguacateEntidad.Builder()
                .id(obj.getId())
                .codigo(obj.getCodigo())
                .coordenadaX(obj.getCoordenadaX())
                .coordenadaY(obj.getCoordenadaY())
                .unidadCoordenada(UnidadEntidadAssembler.getInstance().ensamblarEntidad(obj.getUnidadCoordenada()))
                .fechaPlantacion(obj.getFechaPlantacion())
                .build();
    }
}