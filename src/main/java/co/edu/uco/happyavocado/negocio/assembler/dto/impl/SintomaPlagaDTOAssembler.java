package co.edu.uco.happyavocado.negocio.assembler.dto.impl;

import co.edu.uco.happyavocado.dominio.SintomaPlagaDominio;
import co.edu.uco.happyavocado.dto.SintomaPlagaDTO;
import co.edu.uco.happyavocado.negocio.assembler.dto.DTOAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public class SintomaPlagaDTOAssembler implements DTOAssembler<SintomaPlagaDominio, SintomaPlagaDTO> {
    private static DTOAssembler<SintomaPlagaDominio, SintomaPlagaDTO> INSTANCE;
    private SintomaPlagaDTOAssembler() { super(); }
    public synchronized static final DTOAssembler<SintomaPlagaDominio, SintomaPlagaDTO> getInstance() {
        if (UtilObjeto.esNula(INSTANCE)) { INSTANCE = new SintomaPlagaDTOAssembler(); }
        return INSTANCE;
    }
    @Override
    public SintomaPlagaDominio ensamblarDominio(final SintomaPlagaDTO dto) {
        var obj = UtilObjeto.obtenerValorDefecto(dto, new SintomaPlagaDTO.Builder().build());
        return new SintomaPlagaDominio.Builder()
                .id(obj.getId())
                .plaga(PlagaDTOAssembler.getInstance().ensamblarDominio(obj.plaga()))
                .sintoma(SintomaDTOAssembler.getInstance().ensamblarDominio(obj.sintoma()))
                .observacion(obj.getObservacion())
                .build();
    }
    @Override
    public SintomaPlagaDTO ensamblarDTO(final SintomaPlagaDominio dominio){
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new SintomaPlagaDominio.Builder().build());
        return new SintomaPlagaDTO.Builder()
                .id(obj.getId())
                .plaga(PlagaDTOAssembler.getInstance().ensamblarDTO(obj.plaga()))
                .sintoma(SintomaDTOAssembler.getInstance().ensamblarDTO(obj.sintoma()))
                .observacion(obj.getObservacion())
                .build();
    }
}