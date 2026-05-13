package co.edu.uco.happyavocado.negocio.assembler.dto.impl;

import co.edu.uco.happyavocado.dominio.SintomaDominio;
import co.edu.uco.happyavocado.dto.SintomaDTO;
import co.edu.uco.happyavocado.negocio.assembler.dto.DTOAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public class SintomaDTOAssembler implements DTOAssembler<SintomaDominio, SintomaDTO> {
    private static DTOAssembler<SintomaDominio, SintomaDTO> INSTANCE;
    private SintomaDTOAssembler() { super(); }
    public synchronized static final DTOAssembler<SintomaDominio, SintomaDTO> getInstance() {
        if (UtilObjeto.esNula(INSTANCE)) { INSTANCE = new SintomaDTOAssembler(); }
        return INSTANCE;
    }
    @Override
    public SintomaDominio ensamblarDominio(final SintomaDTO dto) {
        var obj = UtilObjeto.obtenerValorDefecto(dto, new SintomaDTO.Builder().build());
        return new SintomaDominio.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .descripcion(obj.getDescripcion())
                .parteArbolAfectada(ParteArbolAfectadaDTOAssembler.getInstance().ensamblarDominio(obj.getParteArbolAfectada()))
                .build();
    }
    @Override
    public SintomaDTO ensamblarDTO(final SintomaDominio dominio){
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new SintomaDominio.Builder().build());
        return new SintomaDTO.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .descripcion(obj.getDescripcion())
                .parteArbolAfectada(ParteArbolAfectadaDTOAssembler.getInstance().ensamblarDTO(obj.getParteArbolAfectada()))
                .build();
    }
}