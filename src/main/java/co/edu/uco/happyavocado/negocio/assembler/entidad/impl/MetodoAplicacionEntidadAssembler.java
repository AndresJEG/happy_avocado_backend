package co.edu.uco.happyavocado.negocio.assembler.entidad.impl;

import co.edu.uco.happyavocado.dominio.MetodoAplicacionDominio;
import co.edu.uco.happyavocado.entidad.MetodoAplicacionEntidad;
import co.edu.uco.happyavocado.negocio.assembler.entidad.EntidadAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class MetodoAplicacionEntidadAssembler implements EntidadAssembler<MetodoAplicacionDominio, MetodoAplicacionEntidad> {

    private static final EntidadAssembler<MetodoAplicacionDominio, MetodoAplicacionEntidad> INSTANCE = new MetodoAplicacionEntidadAssembler();

    private MetodoAplicacionEntidadAssembler() { super(); }

    public static final EntidadAssembler<MetodoAplicacionDominio, MetodoAplicacionEntidad> getInstance() { return INSTANCE; }

    @Override
    public MetodoAplicacionDominio ensamblarDominio(final MetodoAplicacionEntidad entidad) {
        var obj = UtilObjeto.obtenerValorDefecto(entidad, new MetodoAplicacionEntidad.Builder().build());
        return new MetodoAplicacionDominio.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .descripcion(obj.getDescripcion())
                .build();
    }

    @Override
    public MetodoAplicacionEntidad ensamblarEntidad(final MetodoAplicacionDominio dominio) {
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new MetodoAplicacionDominio.Builder().build());
        return new MetodoAplicacionEntidad.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .descripcion(obj.getDescripcion())
                .build();
    }
}