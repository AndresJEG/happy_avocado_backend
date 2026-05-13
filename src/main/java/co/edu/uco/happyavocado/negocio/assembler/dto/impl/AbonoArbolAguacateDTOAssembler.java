package co.edu.uco.happyavocado.negocio.assembler.dto.impl;

import co.edu.uco.happyavocado.dominio.AbonoArbolAguacateDominio;
import co.edu.uco.happyavocado.dto.AbonoArbolAguacateDTO;
import co.edu.uco.happyavocado.negocio.assembler.dto.DTOAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public class AbonoArbolAguacateDTOAssembler implements DTOAssembler<AbonoArbolAguacateDominio, AbonoArbolAguacateDTO> {

    private static final DTOAssembler<AbonoArbolAguacateDominio, AbonoArbolAguacateDTO> INSTANCE = new AbonoArbolAguacateDTOAssembler();

    private AbonoArbolAguacateDTOAssembler() { super(); }

    public static final DTOAssembler<AbonoArbolAguacateDominio, AbonoArbolAguacateDTO> getInstance() { return INSTANCE; }

    @Override
    public AbonoArbolAguacateDominio ensamblarDominio(AbonoArbolAguacateDTO dto) {
        var obj = UtilObjeto.obtenerValorDefecto(dto, new AbonoArbolAguacateDTO.Builder().build());
        return new AbonoArbolAguacateDominio.Builder()
                .id(obj.getId())
                .arbolAguacate(ArbolAguacateDTOAssembler.getInstance().ensamblarDominio(obj.getArbolAguacate()))
                .abono(AbonoDTOAssembler.getInstance().ensamblarDominio(obj.getAbono()))
                .fechaAbono(obj.getFechaAbono())
                .cantidad(obj.getCantidad())
                .unidad(UnidadDTOAssembler.getInstance().ensamblarDominio(obj.getUnidad()))
                .build();
    }

    @Override
    public AbonoArbolAguacateDTO ensamblarDTO(AbonoArbolAguacateDominio dominio) {
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new AbonoArbolAguacateDominio.Builder().build());
        return new AbonoArbolAguacateDTO.Builder()
                .id(obj.getId())
                .arbolAguacate(ArbolAguacateDTOAssembler.getInstance().ensamblarDTO(obj.getArbolAguacate()))
                .abono(AbonoDTOAssembler.getInstance().ensamblarDTO(obj.getAbono()))
                .fechaAbono(obj.getFechaAbono())
                .cantidad(obj.getCantidad())
                .unidad(UnidadDTOAssembler.getInstance().ensamblarDTO(obj.getUnidad()))
                .build();
    }
}