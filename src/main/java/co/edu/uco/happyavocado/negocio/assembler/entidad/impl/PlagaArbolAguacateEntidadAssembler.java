package co.edu.uco.happyavocado.negocio.assembler.entidad.impl;

import co.edu.uco.happyavocado.dominio.PlagaArbolAguacateDominio;
import co.edu.uco.happyavocado.entidad.PlagaArbolAguacateEntidad;
import co.edu.uco.happyavocado.negocio.assembler.entidad.EntidadAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class PlagaArbolAguacateEntidadAssembler implements EntidadAssembler<PlagaArbolAguacateDominio, PlagaArbolAguacateEntidad> {

    private static final EntidadAssembler<PlagaArbolAguacateDominio, PlagaArbolAguacateEntidad> INSTANCE = new PlagaArbolAguacateEntidadAssembler();

    private PlagaArbolAguacateEntidadAssembler() { super(); }

    public static final EntidadAssembler<PlagaArbolAguacateDominio, PlagaArbolAguacateEntidad> getInstance() { return INSTANCE; }

    @Override
    public PlagaArbolAguacateDominio ensamblarDominio(final PlagaArbolAguacateEntidad entidad) {
        var obj = UtilObjeto.obtenerValorDefecto(entidad, new PlagaArbolAguacateEntidad.Builder().build());
        return new PlagaArbolAguacateDominio.Builder()
                .id(obj.getId())
                .arbolAguacate(ArbolAguacateEntidadAssembler.getInstance().ensamblarDominio(obj.getArbolAguacate()))
                .plaga(PlagaEntidadAssembler.getInstance().ensamblarDominio(obj.getPlaga()))
                .fechaInicio(obj.getFechaInicio())
                .fechaFin(obj.getFechaFin())
                .build();
    }

    @Override
    public PlagaArbolAguacateEntidad ensamblarEntidad(final PlagaArbolAguacateDominio dominio) {
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new PlagaArbolAguacateDominio.Builder().build());
        return new PlagaArbolAguacateEntidad.Builder()
                .id(obj.getId())
                .arbolAguacate(ArbolAguacateEntidadAssembler.getInstance().ensamblarEntidad(obj.getArbolAguacate()))
                .plaga(PlagaEntidadAssembler.getInstance().ensamblarEntidad(obj.plaga()))
                .fechaInicio(obj.getFechaInicio())
                .fechaFin(obj.getFechaFin())
                .build();
    }
}