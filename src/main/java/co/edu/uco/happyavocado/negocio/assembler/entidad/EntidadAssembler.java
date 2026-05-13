package co.edu.uco.happyavocado.negocio.assembler.entidad;

public interface EntidadAssembler<D, E> {
    D ensamblarDominio(E entidad);
    E ensamblarEntidad(D dominio);
}