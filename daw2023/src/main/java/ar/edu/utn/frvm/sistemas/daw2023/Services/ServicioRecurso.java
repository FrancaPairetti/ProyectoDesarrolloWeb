package ar.edu.utn.frvm.sistemas.daw2023.Services;

import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ar.edu.utn.frvm.sistemas.daw2023.model.Recurso;
import ar.edu.utn.frvm.sistemas.daw2023.persistencia.RepositorioRecurso;

@Service
public class ServicioRecurso implements IServicioRecurso{
    
    private final RepositorioRecurso repositorio;
    public ServicioRecurso(RepositorioRecurso repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Recurso get(Integer id){
        return repositorio.findById(id).orElse(null);
    }

    @Override
    public Iterable<Recurso> getTodos() {
        return repositorio.findAll();
    }
    
    @Override
    public Iterable<Recurso> getTodosPaginado(Pageable p) {
        return repositorio.findAll(p);
    }

    @Override
    public Recurso guardar(Recurso r) {
        return repositorio.save(r);
    }
}
