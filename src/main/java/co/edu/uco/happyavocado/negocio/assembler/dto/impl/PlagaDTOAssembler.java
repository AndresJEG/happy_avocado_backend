package co.edu.uco.happyavocado.negocio.assembler.dto.impl;

import co.edu.uco.happyavocado.dominio.PlagaDominio;
import co.edu.uco.happyavocado.dto.PlagaDTO;
import co.edu.uco.happyavocado.negocio.assembler.dto.DTOAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public class PlagaDTOAssembler implements DTOAssembler<PlagaDominio, PlagaDTO> {
    private static DTOAssembler<PlagaDominio, PlagaDTO> INSTANCE;
    private PlagaDTOAssembler() { super(); }
    public synchronized static final DTOAssembler<PlagaDominio, PlagaDTO> getInstance() {
        if (UtilObjeto.esNula(INSTANCE)) { INSTANCE = new PlagaDTOAssembler(); }
        return INSTANCE;
    }
    @Override
    public PlagaDominio ensamblarDominio(final PlagaDTO dto) {
        var obj = UtilObjeto.obtenerValorDefecto(dto, new PlagaDTO.Builder().build());
        return new PlagaDominio.Builder().id(obj.getId()).nombre(obj.getNombre()).origen(obj.getOrigen()).esContagioso(obj.isEsContagioso()).build();
    }
    @Override
    public PlagaDTO ensamblarDTO(final PlagaDominio dominio){
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new PlagaDominio.Builder().build());
        return new PlagaDTO.Builder().id(obj.getId()).nombre(obj.getNombre()).origen(obj.getOrigen()).esContagioso(obj.EsContagioso()).build();
    }
}