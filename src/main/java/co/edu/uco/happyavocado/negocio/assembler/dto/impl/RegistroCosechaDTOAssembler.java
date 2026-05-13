package co.edu.uco.happyavocado.negocio.assembler.dto.impl;

import co.edu.uco.happyavocado.dominio.RegistroCosechaDominio;
import co.edu.uco.happyavocado.dto.RegistroCosechaDTO;
import co.edu.uco.happyavocado.negocio.assembler.dto.DTOAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public class RegistroCosechaDTOAssembler implements DTOAssembler<RegistroCosechaDominio, RegistroCosechaDTO> {
    private static DTOAssembler<RegistroCosechaDominio, RegistroCosechaDTO> INSTANCE;
    private RegistroCosechaDTOAssembler() { super(); }
    public synchronized static final DTOAssembler<RegistroCosechaDominio, RegistroCosechaDTO> getInstance() {
        if (UtilObjeto.esNula(INSTANCE)) { INSTANCE = new RegistroCosechaDTOAssembler(); }
        return INSTANCE;
    }
    @Override
    public RegistroCosechaDominio ensamblarDominio(final RegistroCosechaDTO dto) {
        var obj = UtilObjeto.obtenerValorDefecto(dto, new RegistroCosechaDTO.Builder().build());
        return new RegistroCosechaDominio.Builder()
                .id(obj.getId())
                .arbolAguacate(ArbolAguacateDTOAssembler.getInstance().ensamblarDominio(obj.getArbolAguacate()))
                .categoriaCalidad(CategoriaCalidadDTOAssembler.getInstance().ensamblarDominio(obj.getCategoriaCalidad()))
                .fechaCosecha(obj.getFechaCosecha())
                .pesoCosecha(obj.getPesoCosecha())
                .unidad(UnidadDTOAssembler.getInstance().ensamblarDominio(obj.Unidad()))
                .build();
    }
    @Override
    public RegistroCosechaDTO ensamblarDTO(final RegistroCosechaDominio dominio){
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new RegistroCosechaDominio.Builder().build());
        return new RegistroCosechaDTO.Builder()
                .id(obj.getId())
                .arbolAguacate(ArbolAguacateDTOAssembler.getInstance().ensamblarDTO(obj.getArbolAguacate()))
                .categoriaCalidad(CategoriaCalidadDTOAssembler.getInstance().ensamblarDTO(obj.getCategoriaCalidad()))
                .fechaCosecha(obj.getFechaCosecha())
                .pesoCosecha(obj.getPesoCosecha())
                .unidad(UnidadDTOAssembler.getInstance().ensamblarDTO(obj.Unidad()))
                .build();
    }
}