package co.edu.uco.happyavocado.negocio.assembler.dto.impl;

import co.edu.uco.happyavocado.dominio.TipoMagnitudDominio;
import co.edu.uco.happyavocado.dto.TipoMagnitudDTO;
import co.edu.uco.happyavocado.negocio.assembler.dto.DTOAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public class TipoMagnitudDTOAssembler implements DTOAssembler<TipoMagnitudDominio, TipoMagnitudDTO> {

    private static DTOAssembler<TipoMagnitudDominio, TipoMagnitudDTO> INSTANCE;

    private TipoMagnitudDTOAssembler() {
        super();
    }

    public synchronized static final DTOAssembler<TipoMagnitudDominio, TipoMagnitudDTO> getInstance() {
        if (UtilObjeto.esNula(INSTANCE)) {
            INSTANCE = new TipoMagnitudDTOAssembler();
        }
        return INSTANCE;
    }

    @Override
    public TipoMagnitudDominio ensamblarDominio(final TipoMagnitudDTO dto) {
        var objetoAEnsamblar = UtilObjeto.obtenerValorDefecto(dto, new TipoMagnitudDTO.Builder().build());

        return new TipoMagnitudDominio.Builder()
                .id(objetoAEnsamblar.getId())
                .nombre(objetoAEnsamblar.getNombre())
                .build();
    }

    @Override
    public TipoMagnitudDTO ensamblarDTO(final TipoMagnitudDominio dominio){
        var objetoAEnsamblar = UtilObjeto.obtenerValorDefecto(dominio, new TipoMagnitudDominio.Builder().build());

        return new TipoMagnitudDTO.Builder()
                .id(objetoAEnsamblar.getId())
                .nombre(objetoAEnsamblar.getNombre())
                .build();
    }
}