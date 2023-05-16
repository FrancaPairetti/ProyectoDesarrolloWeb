package ar.edu.utn.frvm.sistemas.daw2023.Services;

import ar.edu.utn.frvm.sistemas.daw2023.model.Lugar;

public interface IServicioLugar {
    
    public Lugar get (Integer id);
    
    Iterable <Lugar> getTodos();

    Lugar guardar(Lugar l);

}
