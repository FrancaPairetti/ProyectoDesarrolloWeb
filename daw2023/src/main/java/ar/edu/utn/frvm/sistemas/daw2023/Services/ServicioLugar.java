package ar.edu.utn.frvm.sistemas.daw2023.Services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import ar.edu.utn.frvm.sistemas.daw2023.model.Lugar;
import ar.edu.utn.frvm.sistemas.daw2023.persistencia.RepositorioLugar;

@Service
public class ServicioLugar implements IServicioLugar{
    
    private final RepositorioLugar repositorio;
    public ServicioLugar(RepositorioLugar repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Lugar get(Integer id) {
        return repositorio.findById(id).orElse(null);
    }

    @Override
    public Iterable<Lugar> getTodos() {
        return repositorio.findAll();
    }

    @Override
    public Lugar guardar(Lugar l) {
        return repositorio.save(l);
    }
}
