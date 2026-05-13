package co.edu.uco.happyavocado.negocio.assembler.entidad.impl;

import co.edu.uco.happyavocado.dominio.ProductoFitosanitarioDominio;
import co.edu.uco.happyavocado.entidad.ProductoFitosanitarioEntidad;
import co.edu.uco.happyavocado.negocio.assembler.entidad.EntidadAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class ProductoFitosanitarioEntidadAssembler implements EntidadAssembler<ProductoFitosanitarioDominio, ProductoFitosanitarioEntidad> {

    private static final EntidadAssembler<ProductoFitosanitarioDominio, ProductoFitosanitarioEntidad> INSTANCE = new ProductoFitosanitarioEntidadAssembler();

    private ProductoFitosanitarioEntidadAssembler() { super(); }

    public static final EntidadAssembler<ProductoFitosanitarioDominio, ProductoFitosanitarioEntidad> getInstance() { return INSTANCE; }

    @Override
    public ProductoFitosanitarioDominio ensamblarDominio(final ProductoFitosanitarioEntidad entidad) {
        var obj = UtilObjeto.obtenerValorDefecto(entidad, new ProductoFitosanitarioEntidad.Builder().build());
        return new ProductoFitosanitarioDominio.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .toxicidad(ToxicidadEntidadAssembler.getInstance().ensamblarDominio(obj.getToxicidad()))
                .tipoProductoFitosanitario(TipoProductoFitosanitarioEntidadAssembler.getInstance().ensamblarDominio(obj.getTipoProductoFitosanitario()))
                .build();
    }

    @Override
    public ProductoFitosanitarioEntidad ensamblarEntidad(final ProductoFitosanitarioDominio dominio) {
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new ProductoFitosanitarioDominio.Builder().build());
        return new ProductoFitosanitarioEntidad.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .toxicidad(ToxicidadEntidadAssembler.getInstance().ensamblarEntidad(obj.getToxicidad()))
                .tipoProductoFitosanitario(TipoProductoFitosanitarioEntidadAssembler.getInstance().ensamblarEntidad(obj.getTipoProductoFitosanitario()))
                .build();
    }
}