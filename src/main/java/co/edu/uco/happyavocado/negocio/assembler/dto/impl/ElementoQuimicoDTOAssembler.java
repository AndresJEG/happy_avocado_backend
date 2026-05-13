package co.edu.uco.happyavocado.negocio.assembler.dto.impl;

import co.edu.uco.happyavocado.dominio.ElementoQuimicoDominio;
import co.edu.uco.happyavocado.dto.ElementoQuimicoDTO;
import co.edu.uco.happyavocado.negocio.assembler.dto.DTOAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public class ElementoQuimicoDTOAssembler implements DTOAssembler<ElementoQuimicoDominio, ElementoQuimicoDTO> {
    private static DTOAssembler<ElementoQuimicoDominio, ElementoQuimicoDTO> INSTANCE;
    private ElementoQuimicoDTOAssembler() { super(); }
    public synchronized static final DTOAssembler<ElementoQuimicoDominio, ElementoQuimicoDTO> getInstance() {
        if (UtilObjeto.esNula(INSTANCE)) { INSTANCE = new ElementoQuimicoDTOAssembler(); }
        return INSTANCE;
    }
    @Override
    public ElementoQuimicoDominio ensamblarDominio(final ElementoQuimicoDTO dto) {
        var obj = UtilObjeto.obtenerValorDefecto(dto, new ElementoQuimicoDTO.Builder().build());
        return new ElementoQuimicoDominio.Builder().id(obj.getId()).nombre(obj.getNombre()).simbolo(obj.getSimbolo()).clasificacion(obj.isClasificacion()).build();
    }
    @Override
    public ElementoQuimicoDTO ensamblarDTO(final ElementoQuimicoDominio dominio){
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new ElementoQuimicoDominio.Builder().build());
        return new ElementoQuimicoDTO.Builder().id(obj.getId()).nombre(obj.getNombre()).simbolo(obj.getSimbolo()).clasificacion(obj.isClasificacion()).build();
    }
}