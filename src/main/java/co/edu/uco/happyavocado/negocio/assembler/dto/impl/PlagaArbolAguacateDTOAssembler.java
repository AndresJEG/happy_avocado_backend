package co.edu.uco.happyavocado.negocio.assembler.dto.impl;

import co.edu.uco.happyavocado.dominio.PlagaArbolAguacateDominio;
import co.edu.uco.happyavocado.dto.PlagaArbolAguacateDTO;
import co.edu.uco.happyavocado.negocio.assembler.dto.DTOAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public class PlagaArbolAguacateDTOAssembler implements DTOAssembler<PlagaArbolAguacateDominio, PlagaArbolAguacateDTO> {
    private static DTOAssembler<PlagaArbolAguacateDominio, PlagaArbolAguacateDTO> INSTANCE;
    private PlagaArbolAguacateDTOAssembler() { super(); }
    public synchronized static final DTOAssembler<PlagaArbolAguacateDominio, PlagaArbolAguacateDTO> getInstance() {
        if (UtilObjeto.esNula(INSTANCE)) { INSTANCE = new PlagaArbolAguacateDTOAssembler(); }
        return INSTANCE;
    }
    @Override
    public PlagaArbolAguacateDominio ensamblarDominio(final PlagaArbolAguacateDTO dto) {
        var obj = UtilObjeto.obtenerValorDefecto(dto, new PlagaArbolAguacateDTO.Builder().build());
        return new PlagaArbolAguacateDominio.Builder()
                .id(obj.getId())
                .arbolAguacate(ArbolAguacateDTOAssembler.getInstance().ensamblarDominio(obj.getArbolAguacate()))
                .plaga(PlagaDTOAssembler.getInstance().ensamblarDominio(obj.plaga()))
                .fechaInicio(obj.getFechaInicio())
                .fechaFin(obj.getFechaFin())
                .build();
    }
    @Override
    public PlagaArbolAguacateDTO ensamblarDTO(final PlagaArbolAguacateDominio dominio){
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new PlagaArbolAguacateDominio.Builder().build());
        return new PlagaArbolAguacateDTO.Builder()
                .id(obj.getId())
                .arbolAguacate(ArbolAguacateDTOAssembler.getInstance().ensamblarDTO(obj.getArbolAguacate()))
                .plaga(PlagaDTOAssembler.getInstance().ensamblarDTO(obj.plaga()))
                .fechaInicio(obj.getFechaInicio())
                .fechaFin(obj.getFechaFin())
                .build();
    }
}
