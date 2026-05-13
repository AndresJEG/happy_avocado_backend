package co.edu.uco.happyavocado.negocio.assembler.dto.impl;

import co.edu.uco.happyavocado.dominio.ParteArbolAfectadaDominio;
import co.edu.uco.happyavocado.dto.ParteArbolAfectadaDTO;
import co.edu.uco.happyavocado.negocio.assembler.dto.DTOAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public class ParteArbolAfectadaDTOAssembler implements DTOAssembler<ParteArbolAfectadaDominio, ParteArbolAfectadaDTO> {
    private static DTOAssembler<ParteArbolAfectadaDominio, ParteArbolAfectadaDTO> INSTANCE;
    private ParteArbolAfectadaDTOAssembler() { super(); }
    public synchronized static final DTOAssembler<ParteArbolAfectadaDominio, ParteArbolAfectadaDTO> getInstance() {
        if (UtilObjeto.esNula(INSTANCE)) { INSTANCE = new ParteArbolAfectadaDTOAssembler(); }
        return INSTANCE;
    }
    @Override
    public ParteArbolAfectadaDominio ensamblarDominio(final ParteArbolAfectadaDTO dto) {
        var obj = UtilObjeto.obtenerValorDefecto(dto, new ParteArbolAfectadaDTO.Builder().build());
        return new ParteArbolAfectadaDominio.Builder().id(obj.getId()).nombre(obj.getNombre()).descripcion(obj.getDescripcion()).build();
    }
    @Override
    public ParteArbolAfectadaDTO ensamblarDTO(final ParteArbolAfectadaDominio dominio){
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new ParteArbolAfectadaDominio.Builder().build());
        return new ParteArbolAfectadaDTO.Builder().id(obj.getId()).nombre(obj.getNombre()).descripcion(obj.getDescripcion()).build();
    }
}