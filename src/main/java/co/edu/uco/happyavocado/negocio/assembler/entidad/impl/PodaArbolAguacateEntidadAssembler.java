package co.edu.uco.happyavocado.negocio.assembler.entidad.impl;

import co.edu.uco.happyavocado.dominio.PodaArbolAguacateDominio;
import co.edu.uco.happyavocado.entidad.PodaArbolAguacateEntidad;
import co.edu.uco.happyavocado.negocio.assembler.entidad.EntidadAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class PodaArbolAguacateEntidadAssembler implements EntidadAssembler<PodaArbolAguacateDominio, PodaArbolAguacateEntidad> {

    private static final EntidadAssembler<PodaArbolAguacateDominio, PodaArbolAguacateEntidad> INSTANCE = new PodaArbolAguacateEntidadAssembler();

    private PodaArbolAguacateEntidadAssembler() { super(); }

    public static final EntidadAssembler<PodaArbolAguacateDominio, PodaArbolAguacateEntidad> getInstance() { return INSTANCE; }

    @Override
    public PodaArbolAguacateDominio ensamblarDominio(final PodaArbolAguacateEntidad entidad) {
        var obj = UtilObjeto.obtenerValorDefecto(entidad, new PodaArbolAguacateEntidad.Builder().build());
        return new PodaArbolAguacateDominio.Builder()
                .id(obj.getId())
                .arbolAguacate(ArbolAguacateEntidadAssembler.getInstance().ensamblarDominio(obj.getArbolAguacate()))
                .motivoPoda(PodaEntidadAssembler.getInstance().ensamblarDominio(obj.getMotivoPoda()))
                .fechaPoda(obj.getFechaPoda())
                .build();
    }

    @Override
    public PodaArbolAguacateEntidad ensamblarEntidad(final PodaArbolAguacateDominio dominio) {
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new PodaArbolAguacateDominio.Builder().build());
        return new PodaArbolAguacateEntidad.Builder()
                .id(obj.getId())
                .arbolAguacate(ArbolAguacateEntidadAssembler.getInstance().ensamblarEntidad(obj.getArbolAguacate()))
                .motivoPoda(PodaEntidadAssembler.getInstance().ensamblarEntidad(obj.motivoPoda()))
                .fechaPoda(obj.getFechaPoda())
                .build();
    }
}