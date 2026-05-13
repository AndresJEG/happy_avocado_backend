package co.edu.uco.happyavocado.negocio.assembler.entidad.impl;

import co.edu.uco.happyavocado.dominio.ProductoFitosanitarioPlagaDominio;
import co.edu.uco.happyavocado.entidad.ProductoFitosanitarioPlagaEntidad;
import co.edu.uco.happyavocado.negocio.assembler.entidad.EntidadAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class ProductoFitosanitarioPlagaEntidadAssembler implements EntidadAssembler<ProductoFitosanitarioPlagaDominio, ProductoFitosanitarioPlagaEntidad> {

    private static final EntidadAssembler<ProductoFitosanitarioPlagaDominio, ProductoFitosanitarioPlagaEntidad> INSTANCE = new ProductoFitosanitarioPlagaEntidadAssembler();

    private ProductoFitosanitarioPlagaEntidadAssembler() { super(); }

    public static final EntidadAssembler<ProductoFitosanitarioPlagaDominio, ProductoFitosanitarioPlagaEntidad> getInstance() { return INSTANCE; }

    @Override
    public ProductoFitosanitarioPlagaDominio ensamblarDominio(final ProductoFitosanitarioPlagaEntidad entidad) {
        var obj = UtilObjeto.obtenerValorDefecto(entidad, new ProductoFitosanitarioPlagaEntidad.Builder().build());
        return new ProductoFitosanitarioPlagaDominio.Builder()
                .id(obj.getId())
                .PlagaArbolAguacate(PlagaArbolAguacateEntidadAssembler.getInstance().ensamblarDominio(obj.getPlagaArbolAguacate()))
                .productoFitosanitario(ProductoFitosanitarioEntidadAssembler.getInstance().ensamblarDominio(obj.getProductoFitosanitario()))
                .fechaAplicacion(obj.getFechaAplicacion())
                .build();
    }

    @Override
    public ProductoFitosanitarioPlagaEntidad ensamblarEntidad(final ProductoFitosanitarioPlagaDominio dominio) {
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new ProductoFitosanitarioPlagaDominio.Builder().build());
        return new ProductoFitosanitarioPlagaEntidad.Builder()
                .id(obj.getId())
                .PlagaArbolAguacate(PlagaArbolAguacateEntidadAssembler.getInstance().ensamblarEntidad(obj.plagaArbolAguacate()))
                .productoFitosanitario(ProductoFitosanitarioEntidadAssembler.getInstance().ensamblarEntidad(obj.getProductoFitosanitario()))
                .fechaAplicacion(obj.getFechaAplicacion())
                .build();
    }
}