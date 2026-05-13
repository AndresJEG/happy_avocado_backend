package co.edu.uco.happyavocado.negocio.assembler.entidad.impl;

import co.edu.uco.happyavocado.dominio.ElementoQuimicoDominio;
import co.edu.uco.happyavocado.entidad.ElementoQuimicoEntidad;
import co.edu.uco.happyavocado.negocio.assembler.entidad.EntidadAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class ElementoQuimicoEntidadAssembler implements EntidadAssembler<ElementoQuimicoDominio, ElementoQuimicoEntidad> {

    private static final EntidadAssembler<ElementoQuimicoDominio, ElementoQuimicoEntidad> INSTANCE = new ElementoQuimicoEntidadAssembler();

    private ElementoQuimicoEntidadAssembler() { super(); }

    public static final EntidadAssembler<ElementoQuimicoDominio, ElementoQuimicoEntidad> getInstance() { return INSTANCE; }

    @Override
    public ElementoQuimicoDominio ensamblarDominio(final ElementoQuimicoEntidad entidad) {
        var obj = UtilObjeto.obtenerValorDefecto(entidad, new ElementoQuimicoEntidad.Builder().build());
        return new ElementoQuimicoDominio.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .simbolo(obj.getSimbolo())
                .clasificacion(obj.isClasificacion())
                .build();
    }

    @Override
    public ElementoQuimicoEntidad ensamblarEntidad(final ElementoQuimicoDominio dominio) {
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new ElementoQuimicoDominio.Builder().build());
        return new ElementoQuimicoEntidad.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .simbolo(obj.getSimbolo())
                .clasificacion(obj.isClasificacion())
                .build();
    }
}