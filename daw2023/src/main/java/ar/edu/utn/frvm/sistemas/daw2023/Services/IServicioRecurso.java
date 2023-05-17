package ar.edu.utn.frvm.sistemas.daw2023.Services;

import org.springframework.data.domain.Pageable;

import ar.edu.utn.frvm.sistemas.daw2023.model.Recurso;

public interface IServicioRecurso {

    public Recurso get (Integer id);
    
    Iterable <Recurso> getTodos();

    Iterable <Recurso> getTodosPaginado(Pageable p);

    Recurso guardar(Recurso r);

}
