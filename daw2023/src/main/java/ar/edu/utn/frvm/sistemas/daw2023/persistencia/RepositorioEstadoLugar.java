package ar.edu.utn.frvm.sistemas.daw2023.persistencia;

import ar.edu.utn.frvm.sistemas.daw2023.model.EstadoLugar;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEstadoLugar extends CrudRepository <EstadoLugar, Integer>{
    Iterable<EstadoLugar> findAllByNombreIgnoreCaseContains(String n);
    
    
}
