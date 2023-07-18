package ar.edu.utn.frvm.sistemas.daw2023.Services;

import org.springframework.stereotype.Service;

import ar.edu.utn.frvm.sistemas.daw2023.model.Lugar;
import ar.edu.utn.frvm.sistemas.daw2023.model.Rol;
import ar.edu.utn.frvm.sistemas.daw2023.persistencia.RepositorioRol;


@Service
public class ServicioRol implements IServicioRol {

    private final RepositorioRol repositorio;
    public ServicioRol(RepositorioRol repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Rol getRol(Integer id) {
        return repositorio.findById(id).orElse(null);
    }

    @Override
    public Iterable<Rol> getTodosRol() {
        return repositorio.findAll();
    }

    @Override
    public Rol guardarRol(Rol r) {
        return repositorio.save(l);
    }

    @Override
    public Rol actualizarRol(Integer id ,Rol r) {
        //aca iria la logica 
        //if (l.)
        return repositorio.save(l);
    }

    @Override
    public void eliminarRol(Integer id ) {
        repositorio.deleteById(id);
    }

    
    
}
