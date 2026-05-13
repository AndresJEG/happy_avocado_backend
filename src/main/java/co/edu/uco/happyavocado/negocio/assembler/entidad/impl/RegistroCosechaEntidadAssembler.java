package co.edu.uco.happyavocado.negocio.assembler.entidad.impl;

import co.edu.uco.happyavocado.dominio.RegistroCosechaDominio;
import co.edu.uco.happyavocado.entidad.RegistroCosechaEntidad;
import co.edu.uco.happyavocado.negocio.assembler.entidad.EntidadAssembler;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;

public final class RegistroCosechaEntidadAssembler implements EntidadAssembler<RegistroCosechaDominio, RegistroCosechaEntidad> {

    private static final EntidadAssembler<RegistroCosechaDominio, RegistroCosechaEntidad> INSTANCE = new RegistroCosechaEntidadAssembler();

    private RegistroCosechaEntidadAssembler() { super(); }

    public static final EntidadAssembler<RegistroCosechaDominio, RegistroCosechaEntidad> getInstance() { return INSTANCE; }

    @Override
    public RegistroCosechaDominio ensamblarDominio(final RegistroCosechaEntidad entidad) {
        var obj = UtilObjeto.obtenerValorDefecto(entidad, new RegistroCosechaEntidad.Builder().build());
        return new RegistroCosechaDominio.Builder()
                .id(obj.getId())
                .arbolAguacate(ArbolAguacateEntidadAssembler.getInstance().ensamblarDominio(obj.getArbolAguacate()))
                .categoriaCalidad(CategoriaCalidadEntidadAssembler.getInstance().ensamblarDominio(obj.getCategoriaCalidad()))
                .fechaCosecha(obj.getFechaCosecha())
                .pesoCosecha(obj.getPesoCosecha())
                .unidad(UnidadEntidadAssembler.getInstance().ensamblarDominio(obj.getUnidad()))
                .build();
    }

    @Override
    public RegistroCosechaEntidad ensamblarEntidad(final RegistroCosechaDominio dominio) {
        var obj = UtilObjeto.obtenerValorDefecto(dominio, new RegistroCosechaDominio.Builder().build());
        return new RegistroCosechaEntidad.Builder()
                .id(obj.getId())
                .arbolAguacate(ArbolAguacateEntidadAssembler.getInstance().ensamblarEntidad(obj.getArbolAguacate()))
                .categoriaCalidad(CategoriaCalidadEntidadAssembler.getInstance().ensamblarEntidad(obj.getCategoriaCalidad()))
                .fechaCosecha(obj.getFechaCosecha())
                .pesoCosecha(obj.getPesoCosecha())
                .unidad(UnidadEntidadAssembler.getInstance().ensamblarEntidad(obj.Unidad()))
                .build();
    }
}