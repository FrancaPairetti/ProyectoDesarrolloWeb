package ar.edu.utn.frvm.sistemas.daw2023.Services;

import ar.edu.utn.frvm.sistemas.daw2023.model.Recurso;

public interface IServicioRecurso {

    public Recurso get (Integer id);
    
    Iterable <Recurso> getTodos();

    Recurso guardar(Recurso r);

}
