package co.edu.uco.happyavocado.negocio.assembler.dto.impl;

import co.edu.uco.happyavocado.dominio.CategoriaCalidadDominio;
import co.edu.uco.happyavocado.dto.CategoriaCalidadDTO;
import co.edu.uco.happyavocado.negocio.assembler.dto.DTOAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public class CategoriaCalidadDTOAssembler implements DTOAssembler<CategoriaCalidadDominio, CategoriaCalidadDTO> {
    private static DTOAssembler<CategoriaCalidadDominio, CategoriaCalidadDTO> INSTANCE;

    private CategoriaCalidadDTOAssembler() { super(); }

    public synchronized static final DTOAssembler<CategoriaCalidadDominio, CategoriaCalidadDTO> getInstance() {
        if (UtilObjeto.esNula(INSTANCE)) { INSTANCE = new CategoriaCalidadDTOAssembler(); }
        return INSTANCE;
    }

    @Override
    public CategoriaCalidadDominio ensamblarDominio(final CategoriaCalidadDTO dto) {
        var objetoAEnsamblar = UtilObjeto.obtenerValorDefecto(dto, new CategoriaCalidadDTO.Builder().build());
        return new CategoriaCalidadDominio.Builder().id(objetoAEnsamblar.getId()).nombre(objetoAEnsamblar.getNombre()).rangoInicial(objetoAEnsamblar.getRangoInicial()).rangoFinal(objetoAEnsamblar.getRangoFinal()).build();
    }

    @Override
    public CategoriaCalidadDTO ensamblarDTO(final CategoriaCalidadDominio dominio){
        var objetoAEnsamblar = UtilObjeto.obtenerValorDefecto(dominio, new CategoriaCalidadDominio.Builder().build());
        return new CategoriaCalidadDTO.Builder().id(objetoAEnsamblar.getId()).nombre(objetoAEnsamblar.getNombre()).rangoInicial(objetoAEnsamblar.getRangoInicial()).rangoFinal(objetoAEnsamblar.getRangoFinal()).build();
    }
}
