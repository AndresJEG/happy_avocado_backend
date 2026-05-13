package co.edu.uco.happyavocado.negocio.assembler.entidad.impl;

import co.edu.uco.happyavocado.dominio.CategoriaCalidadDominio;
import co.edu.uco.happyavocado.entidad.CategoriaCalidadEntidad;
import co.edu.uco.happyavocado.negocio.assembler.entidad.EntidadAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class CategoriaCalidadEntidadAssembler implements EntidadAssembler<CategoriaCalidadDominio, CategoriaCalidadEntidad> {

    private static final EntidadAssembler<CategoriaCalidadDominio, CategoriaCalidadEntidad> INSTANCE = new CategoriaCalidadEntidadAssembler();

    private CategoriaCalidadEntidadAssembler() { super(); }

    public static final EntidadAssembler<CategoriaCalidadDominio, CategoriaCalidadEntidad> getInstance() { return INSTANCE; }

    @Override
    public CategoriaCalidadDominio ensamblarDominio(final CategoriaCalidadEntidad entidad) {
        var obj = UtilObjeto.obtenerValorDefecto(entidad, new CategoriaCalidadEntidad.Builder().build());
        return new CategoriaCalidadDominio.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .rangoInicial(obj.getRangoInicial())
                .rangoFinal(obj.getRangoFinal())
                .build();
    }

    @Override
    public CategoriaCalidadEntidad ensamblarEntidad(final CategoriaCalidadDominio dominio) {
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new CategoriaCalidadDominio.Builder().build());
        return new CategoriaCalidadEntidad.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .rangoInicial(obj.getRangoInicial())
                .rangoFinal(obj.getRangoFinal())
                .build();
    }
}