package co.edu.uco.happyavocado.negocio.assembler.entidad.impl;

import co.edu.uco.happyavocado.dominio.AbonoDominio;
import co.edu.uco.happyavocado.entidad.AbonoEntidad;
import co.edu.uco.happyavocado.negocio.assembler.entidad.EntidadAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class AbonoEntidadAssembler implements EntidadAssembler<AbonoDominio, AbonoEntidad> {

    private static final EntidadAssembler<AbonoDominio, AbonoEntidad> INSTANCE = new AbonoEntidadAssembler();

    private AbonoEntidadAssembler() { super(); }

    public static final EntidadAssembler<AbonoDominio, AbonoEntidad> getInstance() { return INSTANCE; }

    @Override
    public AbonoDominio ensamblarDominio(final AbonoEntidad entidad) {
        var obj = UtilObjeto.obtenerValorDefecto(entidad, new AbonoEntidad.Builder().build());
        return new AbonoDominio.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .esOrganico(obj.EsOrganico())
                .descripcion(obj.getDescripcion())
                .toxicidad(ToxicidadEntidadAssembler.getInstance().ensamblarDominio(obj.getToxicidad()))
                .metodoAplicacion(MetodoAplicacionEntidadAssembler.getInstance().ensamblarDominio(obj.getMetodoAplicacion()))
                .build();
    }

    @Override
    public AbonoEntidad ensamblarEntidad(final AbonoDominio dominio) {
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new AbonoDominio.Builder().build());
        return new AbonoEntidad.Builder()
                .id(obj.getId())
                .nombre(obj.getNombre())
                .esOrganico(obj.isEsOrganico())
                .descripcion(obj.getDescripcion())
                .toxicidad(ToxicidadEntidadAssembler.getInstance().ensamblarEntidad(obj.getToxicidad()))
                .metodoAplicacion(MetodoAplicacionEntidadAssembler.getInstance().ensamblarEntidad(obj.getMetodoAplicacion()))
                .build();
    }
}