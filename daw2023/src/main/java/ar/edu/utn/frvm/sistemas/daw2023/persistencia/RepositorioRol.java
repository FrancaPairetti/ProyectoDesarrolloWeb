package ar.edu.utn.frvm.sistemas.daw2023.persistencia;

import org.springframework.stereotype.Repository;

import ar.edu.utn.frvm.sistemas.daw2023.model.Rol;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface RepositorioRol extends CrudRepository <Rol , Integer>{
    
}
