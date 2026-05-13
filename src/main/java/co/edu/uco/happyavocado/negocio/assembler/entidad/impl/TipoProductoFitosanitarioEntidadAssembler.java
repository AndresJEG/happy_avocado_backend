package co.edu.uco.happyavocado.negocio.assembler.entidad.impl;

import co.edu.uco.happyavocado.dominio.TipoProductoFitosanitarioDominio;
import co.edu.uco.happyavocado.entidad.TipoProductoFitosanitarioEntidad;
import co.edu.uco.happyavocado.negocio.assembler.entidad.EntidadAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class TipoProductoFitosanitarioEntidadAssembler implements EntidadAssembler<TipoProductoFitosanitarioDominio, TipoProductoFitosanitarioEntidad> {

    private static final EntidadAssembler<TipoProductoFitosanitarioDominio, TipoProductoFitosanitarioEntidad> INSTANCE = new TipoProductoFitosanitarioEntidadAssembler();

    private TipoProductoFitosanitarioEntidadAssembler() { super(); }

    public static final EntidadAssembler<TipoProductoFitosanitarioDominio, TipoProductoFitosanitarioEntidad> getInstance() { return INSTANCE; }

    @Override
    public TipoProductoFitosanitarioDominio ensamblarDominio(final TipoProductoFitosanitarioEntidad entidad) {
        var obj = UtilObjeto.obtenerValorDefecto(entidad, new TipoProductoFitosanitarioEntidad.Builder().build());
        return new TipoProductoFitosanitarioDominio.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .descripcion(obj.getDescripcion())
                .build();
    }

    @Override
    public TipoProductoFitosanitarioEntidad ensamblarEntidad(final TipoProductoFitosanitarioDominio dominio) {
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new TipoProductoFitosanitarioDominio.Builder().build());
        return new TipoProductoFitosanitarioEntidad.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .descripcion(obj.getDescripcion())
                .build();
    }
}