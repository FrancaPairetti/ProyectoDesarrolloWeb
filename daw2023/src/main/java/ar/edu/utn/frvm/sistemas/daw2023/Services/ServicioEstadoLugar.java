package ar.edu.utn.frvm.sistemas.daw2023.Services;

import org.springframework.stereotype.Service;

import ar.edu.utn.frvm.sistemas.daw2023.model.EstadoLugar;
import ar.edu.utn.frvm.sistemas.daw2023.persistencia.RepositorioEstadoLugar;

@Service
public class ServicioEstadoLugar  implements IServicioEstadoLugar { 

    private final RepositorioEstadoLugar repositorio;
    public ServicioEstadoLugar(RepositorioEstadoLugar repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public EstadoLugar getEstadoLugar(Integer id) {
        return repositorio.findById(id).orElse(null);
    }

    @Override
    public Iterable<EstadoLugar> getEstadoLugarTodos() {
        return repositorio.findAll();
    }

    @Override
    public Iterable<EstadoLugar> getFiltroNombreEstadoLugar(String nombre) {
        return repositorio.findAllByNombreIgnoreCaseContains(nombre);
    }



    @Override
    public EstadoLugar guardarEstadoLugar(EstadoLugar l) {
        return repositorio.save(l);
    }

    @Override
    public EstadoLugar actualizarEstadoLugar(Integer id ,EstadoLugar l) {
        //aca iria la logica 
        //if (l.)
        return repositorio.save(l);
    }

    @Override
    public void eliminarEstadoLugar(Integer id ) {
        repositorio.deleteById(id);
    }
    
}
