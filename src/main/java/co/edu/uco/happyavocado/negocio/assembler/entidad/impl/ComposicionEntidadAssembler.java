package co.edu.uco.happyavocado.negocio.assembler.entidad.impl;

import co.edu.uco.happyavocado.dominio.ComposicionDominio;
import co.edu.uco.happyavocado.entidad.ComposicionEntidad;
import co.edu.uco.happyavocado.negocio.assembler.entidad.EntidadAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class ComposicionEntidadAssembler implements EntidadAssembler<ComposicionDominio, ComposicionEntidad> {

    private static final EntidadAssembler<ComposicionDominio, ComposicionEntidad> INSTANCE = new ComposicionEntidadAssembler();

    private ComposicionEntidadAssembler() { super(); }

    public static final EntidadAssembler<ComposicionDominio, ComposicionEntidad> getInstance() { return INSTANCE; }

    @Override
    public ComposicionDominio ensamblarDominio(final ComposicionEntidad entidad) {
        var obj = UtilObjeto.obtenerValorDefecto(entidad, new ComposicionEntidad.Builder().build());
        return new ComposicionDominio.Builder()
                .id(obj.getId())
                .abono(AbonoEntidadAssembler.getInstance().ensamblarDominio(obj.getAbono()))
                .elementoQuimico(ElementoQuimicoEntidadAssembler.getInstance().ensamblarDominio(obj.getElementoQuimico()))
                .concentracion(obj.getConcentracion())
                .unidad(UnidadEntidadAssembler.getInstance().ensamblarDominio(obj.getUnidad()))
                .build();
    }

    @Override
    public ComposicionEntidad ensamblarEntidad(final ComposicionDominio dominio) {
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new ComposicionDominio.Builder().build());
        return new ComposicionEntidad.Builder()
                .id(obj.getId())
                .abono(AbonoEntidadAssembler.getInstance().ensamblarEntidad(obj.getAbono()))
                .elementoQuimico(ElementoQuimicoEntidadAssembler.getInstance().ensamblarEntidad(obj.getElementoQuimico()))
                .concentracion(obj.getConcentracion())
                .unidad(UnidadEntidadAssembler.getInstance().ensamblarEntidad(obj.getUnidad()))
                .build();
    }
}