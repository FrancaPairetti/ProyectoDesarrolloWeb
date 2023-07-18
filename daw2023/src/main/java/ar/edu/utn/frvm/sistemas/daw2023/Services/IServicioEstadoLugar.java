package ar.edu.utn.frvm.sistemas.daw2023.Services;

import ar.edu.utn.frvm.sistemas.daw2023.model.EstadoLugar;

public interface IServicioEstadoLugar {

    public EstadoLugar getEstadoLugar (Integer id);
    
    Iterable <EstadoLugar> getEstadoLugarTodos();

    Iterable <EstadoLugar> getFiltroNombreEstadoLugar(String nombre);

    EstadoLugar guardarEstadoLugar(EstadoLugar l);
    
    EstadoLugar actualizarEstadoLugar(Integer id , EstadoLugar l);

    public void eliminarEstadoLugar(Integer id);
    
}
