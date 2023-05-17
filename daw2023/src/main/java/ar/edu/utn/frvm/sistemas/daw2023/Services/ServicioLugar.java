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
    public Iterable<Lugar> getFiltroNombre(String nombre) {
        return repositorio.findAllByNombreIgnoreCaseContains(nombre);
    }

    @Override
    public Iterable<Lugar> getFiltroCapacidad(Integer capacidad) {
        return repositorio.findAllByCapacidad(capacidad);
    }

    @Override
    public Iterable<Lugar> getFiltroCapacidadNombre(Integer capacidad,String nombre) {
        //return repositorio.findAllByCapacidad(capacidad);
        return repositorio.findAllByNombreIgnoreCaseContainsAndCapacidad(capacidad, nombre);
    }


    @Override
    public Lugar guardar(Lugar l) {
        return repositorio.save(l);
    }

    @Override
    public Lugar actualizar(Integer id ,Lugar l) {
        //aca iria la logica 
        //if (l.)
        return repositorio.save(l);
    }

    @Override
    public void eliminar(Integer id ) {
        repositorio.deleteById(id);
    }
}
