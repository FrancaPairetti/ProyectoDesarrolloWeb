package ar.edu.utn.frvm.sistemas.daw2023.Services;

import ar.edu.utn.frvm.sistemas.daw2023.model.Lugar;

public interface IServicioLugar {
    
    public Lugar get (Integer id);
    
    Iterable <Lugar> getTodos();

    Iterable <Lugar> getFiltroNombre(String nombre);

    Iterable <Lugar> getFiltroCapacidad(Integer capacidad);
    
    Iterable <Lugar> getFiltroCapacidadNombre(Integer capacidad, String nombre);

    Lugar guardar(Lugar l);
    
    Lugar actualizar(Integer id , Lugar l);

    public void eliminar(Integer id);


}
