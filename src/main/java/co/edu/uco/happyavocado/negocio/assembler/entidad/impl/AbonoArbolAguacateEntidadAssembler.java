package co.edu.uco.happyavocado.negocio.assembler.entidad.impl;

import co.edu.uco.happyavocado.dominio.AbonoArbolAguacateDominio;
import co.edu.uco.happyavocado.entidad.AbonoArbolAguacateEntidad;
import co.edu.uco.happyavocado.negocio.assembler.entidad.EntidadAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class AbonoArbolAguacateEntidadAssembler implements EntidadAssembler<AbonoArbolAguacateDominio, AbonoArbolAguacateEntidad> {

    private static final EntidadAssembler<AbonoArbolAguacateDominio, AbonoArbolAguacateEntidad> INSTANCE = new AbonoArbolAguacateEntidadAssembler();

    private AbonoArbolAguacateEntidadAssembler() { super(); }

    public static final EntidadAssembler<AbonoArbolAguacateDominio, AbonoArbolAguacateEntidad> getInstance() { return INSTANCE; }

    @Override
    public AbonoArbolAguacateDominio ensamblarDominio(final AbonoArbolAguacateEntidad entidad) {
        var obj = UtilObjeto.obtenerValorDefecto(entidad, new AbonoArbolAguacateEntidad.Builder().build());
        return new AbonoArbolAguacateDominio.Builder()
                .id(obj.getId())
                .arbolAguacate(ArbolAguacateEntidadAssembler.getInstance().ensamblarDominio(obj.getArbolAguacate()))
                .abono(AbonoEntidadAssembler.getInstance().ensamblarDominio(obj.getAbono()))
                .fechaAbono(obj.getFechaAbono())
                .cantidad(obj.getCantidad())
                .unidad(UnidadEntidadAssembler.getInstance().ensamblarDominio(obj.getUnidad()))
                .build();
    }

    @Override
    public AbonoArbolAguacateEntidad ensamblarEntidad(final AbonoArbolAguacateDominio dominio) {
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new AbonoArbolAguacateDominio.Builder().build());
        return new AbonoArbolAguacateEntidad.Builder()
                .id(obj.getId())
                .arbolAguacate(ArbolAguacateEntidadAssembler.getInstance().ensamblarEntidad(obj.getArbolAguacate()))
                .abono(AbonoEntidadAssembler.getInstance().ensamblarEntidad(obj.getAbono()))
                .fechaAbono(obj.getFechaAbono())
                .cantidad(obj.getCantidad())
                .unidad(UnidadEntidadAssembler.getInstance().ensamblarEntidad(obj.getUnidad()))
                .build();
    }
}