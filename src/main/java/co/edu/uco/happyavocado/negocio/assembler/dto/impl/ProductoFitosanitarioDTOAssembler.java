package co.edu.uco.happyavocado.negocio.assembler.dto.impl;

import co.edu.uco.happyavocado.dominio.ProductoFitosanitarioDominio;
import co.edu.uco.happyavocado.dto.ProductoFitosanitarioDTO;
import co.edu.uco.happyavocado.negocio.assembler.dto.DTOAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public class ProductoFitosanitarioDTOAssembler implements DTOAssembler<ProductoFitosanitarioDominio, ProductoFitosanitarioDTO> {
    private static DTOAssembler<ProductoFitosanitarioDominio, ProductoFitosanitarioDTO> INSTANCE;
    private ProductoFitosanitarioDTOAssembler() { super(); }
    public synchronized static final DTOAssembler<ProductoFitosanitarioDominio, ProductoFitosanitarioDTO> getInstance() {
        if (UtilObjeto.esNula(INSTANCE)) { INSTANCE = new ProductoFitosanitarioDTOAssembler(); }
        return INSTANCE;
    }
    @Override
    public ProductoFitosanitarioDominio ensamblarDominio(final ProductoFitosanitarioDTO dto) {
        var obj = UtilObjeto.obtenerValorDefecto(dto, new ProductoFitosanitarioDTO.Builder().build());
        return new ProductoFitosanitarioDominio.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .toxicidad(ToxicidadDTOAssembler.getInstance().ensamblarDominio(obj.getToxicidad()))
                .tipoProductoFitosanitario(TipoProductoFitosanitarioDTOAssembler.getInstance().ensamblarDominio(obj.tipoProductoFitosanitario()))
                .build();
    }
    @Override
    public ProductoFitosanitarioDTO ensamblarDTO(final ProductoFitosanitarioDominio dominio){
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new ProductoFitosanitarioDominio.Builder().build());
        return new ProductoFitosanitarioDTO.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .toxicidad(ToxicidadDTOAssembler.getInstance().ensamblarDTO(obj.getToxicidad()))
                .tipoProductoFitosanitario(TipoProductoFitosanitarioDTOAssembler.getInstance().ensamblarDTO(obj.getTipoProductoFitosanitario()))
                .build();
    }
}