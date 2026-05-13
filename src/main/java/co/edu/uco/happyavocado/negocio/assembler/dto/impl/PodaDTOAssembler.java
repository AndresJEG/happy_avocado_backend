package co.edu.uco.happyavocado.negocio.assembler.dto.impl;

import co.edu.uco.happyavocado.dominio.PodaDominio;
import co.edu.uco.happyavocado.dto.PodaDTO;
import co.edu.uco.happyavocado.negocio.assembler.dto.DTOAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class PodaDTOAssembler implements DTOAssembler<PodaDominio, PodaDTO> {

    private static final DTOAssembler<PodaDominio, PodaDTO> INSTANCE = new PodaDTOAssembler();

    private PodaDTOAssembler() { super(); }

    public static final DTOAssembler<PodaDominio, PodaDTO> getInstance() { return INSTANCE; }

    @Override
    public PodaDominio ensamblarDominio(PodaDTO dto) {
        var objetoAEnsamblar = UtilObjeto.obtenerValorDefecto(dto, new PodaDTO.Builder().build());
        return new PodaDominio.Builder()
                .id(objetoAEnsamblar.getId())
                .nombre(objetoAEnsamblar.getNombre())
                .descripcion(objetoAEnsamblar.getDescripcion())
                .build();
    }

    @Override
    public PodaDTO ensamblarDTO(PodaDominio dominio) {
        var objetoAEnsamblar = UtilObjeto.obtenerValorDefecto(dominio, new PodaDominio.Builder().build());
        return new PodaDTO.Builder()
                .id(objetoAEnsamblar.getId())
                .nombre(objetoAEnsamblar.getNombre())
                .descripcion(objetoAEnsamblar.getDescripcion())
                .build();
    }
}
