package co.edu.uco.happyavocado.negocio.assembler.dto.impl;

import co.edu.uco.happyavocado.dominio.ProductoFitosanitarioPlagaDominio;
import co.edu.uco.happyavocado.dto.ProductoFitosanitarioPlagaDTO;
import co.edu.uco.happyavocado.negocio.assembler.dto.DTOAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public class ProductoFitosanitarioPlagaDTOAssembler implements DTOAssembler<ProductoFitosanitarioPlagaDominio, ProductoFitosanitarioPlagaDTO> {
    private static DTOAssembler<ProductoFitosanitarioPlagaDominio, ProductoFitosanitarioPlagaDTO> INSTANCE;
    private ProductoFitosanitarioPlagaDTOAssembler() { super(); }
    public synchronized static final DTOAssembler<ProductoFitosanitarioPlagaDominio, ProductoFitosanitarioPlagaDTO> getInstance() {
        if (UtilObjeto.esNula(INSTANCE)) { INSTANCE = new ProductoFitosanitarioPlagaDTOAssembler(); }
        return INSTANCE;
    }
    @Override
    public ProductoFitosanitarioPlagaDominio ensamblarDominio(final ProductoFitosanitarioPlagaDTO dto) {
        var obj = UtilObjeto.obtenerValorDefecto(dto, new ProductoFitosanitarioPlagaDTO.Builder().build());
        return new ProductoFitosanitarioPlagaDominio.Builder()
                .id(obj.getId())
                .PlagaArbolAguacate(PlagaArbolAguacateDTOAssembler.getInstance().ensamblarDominio(obj.plagaArbolAguacate()))
                .productoFitosanitario(ProductoFitosanitarioDTOAssembler.getInstance().ensamblarDominio(obj.getProductoFitosanitario()))
                .fechaAplicacion(obj.getFechaAplicacion())
                .build();
    }
    @Override
    public ProductoFitosanitarioPlagaDTO ensamblarDTO(final ProductoFitosanitarioPlagaDominio dominio){
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new ProductoFitosanitarioPlagaDominio.Builder().build());
        return new ProductoFitosanitarioPlagaDTO.Builder()
                .id(obj.getId())
                .PlagaArbolAguacate(PlagaArbolAguacateDTOAssembler.getInstance().ensamblarDTO(obj.plagaArbolAguacate()))
                .productoFitosanitario(ProductoFitosanitarioDTOAssembler.getInstance().ensamblarDTO(obj.getProductoFitosanitario()))
                .fechaAplicacion(obj.getFechaAplicacion())
                .build();
    }
}