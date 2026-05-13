package co.edu.uco.happyavocado.negocio.assembler.dto.impl;

import co.edu.uco.happyavocado.dominio.PodaArbolAguacateDominio;
import co.edu.uco.happyavocado.dto.PodaArbolAguacateDTO;
import co.edu.uco.happyavocado.negocio.assembler.dto.DTOAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public class PodaArbolAguacateDTOAssembler implements DTOAssembler<PodaArbolAguacateDominio, PodaArbolAguacateDTO> {
    private static DTOAssembler<PodaArbolAguacateDominio, PodaArbolAguacateDTO> INSTANCE;
    private PodaArbolAguacateDTOAssembler() { super(); }
    public synchronized static final DTOAssembler<PodaArbolAguacateDominio, PodaArbolAguacateDTO> getInstance() {
        if (UtilObjeto.esNula(INSTANCE)) { INSTANCE = new PodaArbolAguacateDTOAssembler(); }
        return INSTANCE;
    }
    @Override
    public PodaArbolAguacateDominio ensamblarDominio(final PodaArbolAguacateDTO dto) {
        var obj = UtilObjeto.obtenerValorDefecto(dto, new PodaArbolAguacateDTO.Builder().build());
        return new PodaArbolAguacateDominio.Builder()
                .id(obj.getId())
                .arbolAguacate(ArbolAguacateDTOAssembler.getInstance().ensamblarDominio(obj.getArbolAguacate()))
                .motivoPoda(PodaDTOAssembler.getInstance().ensamblarDominio(obj.motivoPoda()))
                .fechaPoda(obj.getFechaPoda())
                .build();
    }
    @Override
    public PodaArbolAguacateDTO ensamblarDTO(final PodaArbolAguacateDominio dominio){
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new PodaArbolAguacateDominio.Builder().build());
        return new PodaArbolAguacateDTO.Builder()
                .id(obj.getId())
                .arbolAguacate(ArbolAguacateDTOAssembler.getInstance().ensamblarDTO(obj.getArbolAguacate()))
                .motivoPoda(PodaDTOAssembler.getInstance().ensamblarDTO(obj.motivoPoda()))
                .fechaPoda(obj.getFechaPoda())
                .build();
    }
}