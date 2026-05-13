package co.edu.uco.happyavocado.negocio.assembler.dto.impl;

import co.edu.uco.happyavocado.dominio.AbonoDominio;
import co.edu.uco.happyavocado.dto.AbonoDTO;
import co.edu.uco.happyavocado.negocio.assembler.dto.DTOAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public class AbonoDTOAssembler implements DTOAssembler<AbonoDominio, AbonoDTO> {

    private static final DTOAssembler<AbonoDominio, AbonoDTO> INSTANCE = new AbonoDTOAssembler();

    private AbonoDTOAssembler() { super(); }

    public static final DTOAssembler<AbonoDominio, AbonoDTO> getInstance() { return INSTANCE; }

    @Override
    public AbonoDominio ensamblarDominio(AbonoDTO dto) {
        var obj = UtilObjeto.obtenerValorDefecto(dto, new AbonoDTO.Builder().build());
        return new AbonoDominio.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .esOrganico(obj.isEsOrganico())
                .descripcion(obj.getDescripcion())
                .toxicidad(ToxicidadDTOAssembler.getInstance().ensamblarDominio(obj.getToxicidad()))
                .metodoAplicacion(MetodoAplicacionDTOAssembler.getInstance().ensamblarDominio(obj.getMetodoAplicacion()))
                .build();
    }

    @Override
    public AbonoDTO ensamblarDTO(AbonoDominio dominio) {
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new AbonoDominio.Builder().build());
        return new AbonoDTO.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .esOrganico(obj.isEsOrganico())
                .descripcion(obj.getDescripcion())
                .toxicidad(ToxicidadDTOAssembler.getInstance().ensamblarDTO(obj.getToxicidad()))
                .metodoAplicacion(MetodoAplicacionDTOAssembler.getInstance().ensamblarDTO(obj.getMetodoAplicacion()))
                .build();
    }
}