package ar.edu.utn.frvm.sistemas.daw2023.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.utn.frvm.sistemas.daw2023.Services.IServicioLugar;
import ar.edu.utn.frvm.sistemas.daw2023.model.Lugar;

@RestController
@RequestMapping("/lugares")
public class ControladorLugar {

    private final IServicioLugar servicio;

    public ControladorLugar (IServicioLugar servicio){ 
        this.servicio = servicio;
    }

    @GetMapping("/{ID}")
    public Lugar get(@PathVariable ("ID") Integer id ){
        //return new Recurso(id, nombre:"proyector");
        return this.servicio.get(id);
    }

    @GetMapping()
    public Iterable<Lugar> getTodos(){
        return this.servicio.getTodos();
    }

    @PostMapping()
    public Lugar guardar(@RequestBody Lugar l) {
        return this.servicio.guardar(l);
    }
    
}
