package co.edu.uco.happyavocado.negocio.assembler.dto.impl;

import co.edu.uco.happyavocado.dominio.ComposicionDominio;
import co.edu.uco.happyavocado.dto.ComposicionDTO;
import co.edu.uco.happyavocado.negocio.assembler.dto.DTOAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public class ComposicionDTOAssembler implements DTOAssembler<ComposicionDominio, ComposicionDTO> {
    private static DTOAssembler<ComposicionDominio, ComposicionDTO> INSTANCE;
    private ComposicionDTOAssembler() { super(); }
    public synchronized static final DTOAssembler<ComposicionDominio, ComposicionDTO> getInstance() {
        if (UtilObjeto.esNula(INSTANCE)) { INSTANCE = new ComposicionDTOAssembler(); }
        return INSTANCE;
    }
    @Override
    public ComposicionDominio ensamblarDominio(final ComposicionDTO dto) {
        var obj = UtilObjeto.obtenerValorDefecto(dto, new ComposicionDTO.Builder().build());
        return new ComposicionDominio.Builder()
                .id(obj.getId())
                .abono(AbonoDTOAssembler.getInstance().ensamblarDominio(obj.getAbono()))
                .elementoQuimico(ElementoQuimicoDTOAssembler.getInstance().ensamblarDominio(obj.getElementoQuimico()))
                .concentracion(obj.concentracion())
                .unidad(UnidadDTOAssembler.getInstance().ensamblarDominio(obj.unidad()))
                .build();
    }
    @Override
    public ComposicionDTO ensamblarDTO(final ComposicionDominio dominio){
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new ComposicionDominio.Builder().build());
        return new ComposicionDTO.Builder()
                .id(obj.getId())
                .abono(AbonoDTOAssembler.getInstance().ensamblarDTO(obj.getAbono()))
                .elementoQuimico(ElementoQuimicoDTOAssembler.getInstance().ensamblarDTO(obj.getElementoQuimico()))
                .concentracion(obj.getConcentracion())
                .unidad(UnidadDTOAssembler.getInstance().ensamblarDTO(obj.getUnidad()))
                .build();
    }
}
