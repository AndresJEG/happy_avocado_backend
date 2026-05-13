package co.edu.uco.happyavocado.negocio.assembler.dto.impl;

import co.edu.uco.happyavocado.dominio.ToxicidadDominio;
import co.edu.uco.happyavocado.dto.ToxicidadDTO;
import co.edu.uco.happyavocado.negocio.assembler.dto.DTOAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class ToxicidadDTOAssembler implements DTOAssembler<ToxicidadDominio, ToxicidadDTO> {

    private static final DTOAssembler<ToxicidadDominio, ToxicidadDTO> INSTANCE = new ToxicidadDTOAssembler();

    private ToxicidadDTOAssembler() {
        super();
    }

    public static final DTOAssembler<ToxicidadDominio, ToxicidadDTO> getInstance() {
        return INSTANCE;
    }

    @Override
    public ToxicidadDominio ensamblarDominio(final ToxicidadDTO dto) {
        var objetoAEnsamblar = UtilObjeto.obtenerValorDefecto(dto, new ToxicidadDTO.Builder().build());
        return new ToxicidadDominio.Builder()
                .id(objetoAEnsamblar.getId())
                .nombre(objetoAEnsamblar.getNombre())
                .descripcion(objetoAEnsamblar.getDescripcion())
                .build();
    }

    @Override
    public ToxicidadDTO ensamblarDTO(final ToxicidadDominio dominio) {
        var objetoAEnsamblar = UtilObjeto.obtenerValorDefecto(dominio, new ToxicidadDominio.Builder().build());
        return new ToxicidadDTO.Builder()
                .id(objetoAEnsamblar.getId())
                .nombre(objetoAEnsamblar.getNombre())
                .descripcion(objetoAEnsamblar.getDescripcion())
                .build();
    }
}
