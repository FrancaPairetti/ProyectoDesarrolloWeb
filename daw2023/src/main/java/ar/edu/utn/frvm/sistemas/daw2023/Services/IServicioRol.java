package ar.edu.utn.frvm.sistemas.daw2023.Services;

import ar.edu.utn.frvm.sistemas.daw2023.model.Rol;

public interface IServicioRol {

    public Rol getRol (Integer id);
    
    Iterable <Rol> getTodosRol();

    Rol guardarRol(Rol l);
    
    Rol actualizarRol(Integer id , Rol r);

    public void eliminarRol(Integer id);
    
}
