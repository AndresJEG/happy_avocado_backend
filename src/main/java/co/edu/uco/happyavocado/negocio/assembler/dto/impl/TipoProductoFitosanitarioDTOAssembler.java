package co.edu.uco.happyavocado.negocio.assembler.dto.impl;

import co.edu.uco.happyavocado.dominio.TipoProductoFitosanitarioDominio;
import co.edu.uco.happyavocado.dto.TipoProductoFitosanitarioDTO;
import co.edu.uco.happyavocado.negocio.assembler.dto.DTOAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public class TipoProductoFitosanitarioDTOAssembler implements DTOAssembler<TipoProductoFitosanitarioDominio, TipoProductoFitosanitarioDTO> {
    private static DTOAssembler<TipoProductoFitosanitarioDominio, TipoProductoFitosanitarioDTO> INSTANCE;
    private TipoProductoFitosanitarioDTOAssembler() { super(); }
    public synchronized static final DTOAssembler<TipoProductoFitosanitarioDominio, TipoProductoFitosanitarioDTO> getInstance() {
        if (UtilObjeto.esNula(INSTANCE)) { INSTANCE = new TipoProductoFitosanitarioDTOAssembler(); }
        return INSTANCE;
    }
    @Override
    public TipoProductoFitosanitarioDominio ensamblarDominio(final TipoProductoFitosanitarioDTO dto) {
        var obj = UtilObjeto.obtenerValorDefecto(dto, new TipoProductoFitosanitarioDTO.Builder().build());
        return new TipoProductoFitosanitarioDominio.Builder().id(obj.getId()).nombre(obj.getNombre()).descripcion(obj.getDescripcion()).build();
    }
    @Override
    public TipoProductoFitosanitarioDTO ensamblarDTO(final TipoProductoFitosanitarioDominio dominio){
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new TipoProductoFitosanitarioDominio.Builder().build());
        return new TipoProductoFitosanitarioDTO.Builder().id(obj.getId()).nombre(obj.getNombre()).descripcion(obj.getDescripcion()).build();
    }
}