package co.edu.uco.happyavocado.negocio.assembler.dto.impl;

import co.edu.uco.happyavocado.dominio.UnidadDominio;
import co.edu.uco.happyavocado.dto.UnidadDTO;
import co.edu.uco.happyavocado.negocio.assembler.dto.DTOAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class UnidadDTOAssembler implements DTOAssembler<UnidadDominio, UnidadDTO> {

    private static final DTOAssembler<UnidadDominio, UnidadDTO> INSTANCE = new UnidadDTOAssembler();

    private UnidadDTOAssembler() { super(); }

    public static final DTOAssembler<UnidadDominio, UnidadDTO> getInstance() { return INSTANCE; }

    @Override
    public UnidadDominio ensamblarDominio(UnidadDTO dto) {
        var objetoAEnsamblar = UtilObjeto.obtenerValorDefecto(dto, new UnidadDTO.Builder().build());
        return new UnidadDominio.Builder()
                .id(objetoAEnsamblar.getId())
                .nombre(objetoAEnsamblar.getNombre())
                .abreviacion(objetoAEnsamblar.getAbreviacion())
                .tipoMagnitud(TipoMagnitudDTOAssembler.getInstance().ensamblarDominio(objetoAEnsamblar.getTipoMagnitud()))
                .build();
    }

    @Override
    public UnidadDTO ensamblarDTO(UnidadDominio dominio) {
        var objetoAEnsamblar = UtilObjeto.obtenerValorDefecto(dominio, new UnidadDominio.Builder().build());
        return new UnidadDTO.Builder()
                .id(objetoAEnsamblar.getId())
                .nombre(objetoAEnsamblar.getNombre())
                .abreviacion(objetoAEnsamblar.getAbreviacion())
                .tipoMagnitud(TipoMagnitudDTOAssembler.getInstance().ensamblarDTO(objetoAEnsamblar.getTipoMagnitud()))
                .build();
    }
}