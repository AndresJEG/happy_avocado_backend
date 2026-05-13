package co.edu.uco.happyavocado.negocio.assembler.dto.impl;

import co.edu.uco.happyavocado.dominio.ArbolAguacateDominio;
import co.edu.uco.happyavocado.dto.ArbolAguacateDTO;
import co.edu.uco.happyavocado.negocio.assembler.dto.DTOAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public class ArbolAguacateDTOAssembler implements DTOAssembler<ArbolAguacateDominio, ArbolAguacateDTO> {

    private static final DTOAssembler<ArbolAguacateDominio, ArbolAguacateDTO> INSTANCE = new ArbolAguacateDTOAssembler();

    private ArbolAguacateDTOAssembler() { super(); }

    public static final DTOAssembler<ArbolAguacateDominio, ArbolAguacateDTO> getInstance() { return INSTANCE; }

    @Override
    public ArbolAguacateDominio ensamblarDominio(ArbolAguacateDTO dto) {
        var objetoAEnsamblar = UtilObjeto.obtenerValorDefecto(dto, new ArbolAguacateDTO.Builder().build());
        return new ArbolAguacateDominio.Builder()
                .id(objetoAEnsamblar.getId())
                .codigo(objetoAEnsamblar.getCodigo())
                .coordenadaX(objetoAEnsamblar.getCoordenadaX())
                .coordenadaY(objetoAEnsamblar.getCoordenadaY())
                .unidadCoordenada(UnidadDTOAssembler.getInstance().ensamblarDominio(objetoAEnsamblar.getUnidadCoordenada()))
                .fechaPlantacion(objetoAEnsamblar.getFechaPlantacion())
                .build();
    }

    @Override
    public ArbolAguacateDTO ensamblarDTO(ArbolAguacateDominio dominio) {
        var objetoAEnsamblar = UtilObjeto.obtenerValorDefecto(dominio, new ArbolAguacateDominio.Builder().build());
        return new ArbolAguacateDTO.Builder()
                .id(objetoAEnsamblar.getId())
                .codigo(objetoAEnsamblar.getCodigo())
                .coordenadaX(objetoAEnsamblar.getCoordenadaX())
                .coordenadaY(objetoAEnsamblar.getCoordenadaY())
                .unidadCoordenada(UnidadDTOAssembler.getInstance().ensamblarDTO(objetoAEnsamblar.getUnidadCoordenada()))
                .fechaPlantacion(objetoAEnsamblar.getFechaPlantacion())
                .build();
    }
}