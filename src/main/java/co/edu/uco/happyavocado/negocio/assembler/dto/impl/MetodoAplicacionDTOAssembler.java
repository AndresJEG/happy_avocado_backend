package co.edu.uco.happyavocado.negocio.assembler.dto.impl;

import co.edu.uco.happyavocado.dominio.MetodoAplicacionDominio;
import co.edu.uco.happyavocado.dto.MetodoAplicacionDTO;
import co.edu.uco.happyavocado.negocio.assembler.dto.DTOAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public class MetodoAplicacionDTOAssembler implements DTOAssembler<MetodoAplicacionDominio, MetodoAplicacionDTO> {
    private static DTOAssembler<MetodoAplicacionDominio, MetodoAplicacionDTO> INSTANCE;
    private MetodoAplicacionDTOAssembler() { super(); }
    public synchronized static final DTOAssembler<MetodoAplicacionDominio, MetodoAplicacionDTO> getInstance() {
        if (UtilObjeto.esNula(INSTANCE)) { INSTANCE = new MetodoAplicacionDTOAssembler(); }
        return INSTANCE;
    }
    @Override
    public MetodoAplicacionDominio ensamblarDominio(final MetodoAplicacionDTO dto) {
        var obj = UtilObjeto.obtenerValorDefecto(dto, new MetodoAplicacionDTO.Builder().build());
        return new MetodoAplicacionDominio.Builder().id(obj.getId()).nombre(obj.getNombre()).descripcion(obj.getDescripcion()).build();
    }
    @Override
    public MetodoAplicacionDTO ensamblarDTO(final MetodoAplicacionDominio dominio){
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new MetodoAplicacionDominio.Builder().build());
        return new MetodoAplicacionDTO.Builder().id(obj.getId()).nombre(obj.getNombre()).descripcion(obj.getDescripcion()).build();
    }
}