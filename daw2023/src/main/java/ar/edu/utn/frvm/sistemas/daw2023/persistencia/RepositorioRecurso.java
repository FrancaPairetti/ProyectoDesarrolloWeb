package ar.edu.utn.frvm.sistemas.daw2023.persistencia;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import ar.edu.utn.frvm.sistemas.daw2023.model.Recurso;

@Repository
public interface RepositorioRecurso extends PagingAndSortingRepository <Recurso , Integer> , CrudRepository <Recurso , Integer> {
    Iterable<Recurso> findAllByNombreIgnoreCaseContains(String n);
}
