package ar.edu.utn.frvm.sistemas.daw2023.persistencia;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.utn.frvm.sistemas.daw2023.model.Lugar;

@Repository
public interface RepositorioLugar extends CrudRepository <Lugar , Integer>{

    //filtro por nombre
    Iterable<Lugar> findAllByNombre(String n);
    //filtrar por nombre ignorando mayusculas
    Iterable<Lugar> findAllByNombreIgnoreCase(String n);

    Iterable<Lugar> findAllByNombreIgnoreCaseContains(String n);

    Iterable<Lugar> findAllByCapacidad(Integer c);
    
    Iterable<Lugar> findAllByNombreIgnoreCaseContainsAndCapacidad(Integer c ,String n);
    
}
