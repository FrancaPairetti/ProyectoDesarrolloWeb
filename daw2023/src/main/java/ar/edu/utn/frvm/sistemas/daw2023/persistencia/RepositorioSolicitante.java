package ar.edu.utn.frvm.sistemas.daw2023.persistencia;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import ar.edu.utn.frvm.sistemas.daw2023.model.Solicitante;

@Repository
public interface RepositorioSolicitante extends PagingAndSortingRepository <Solicitante, Integer> , CrudRepository <Solicitante , Integer> {
    Iterable<Solicitante> findAllByNombreIgnoreCaseContains(String n);
    
}
