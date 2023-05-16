package ar.edu.utn.frvm.sistemas.daw2023.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.utn.frvm.sistemas.daw2023.Services.IServicioRecurso;
import ar.edu.utn.frvm.sistemas.daw2023.model.Recurso;

@RestController
@RequestMapping("/recursos")
public class ControladorRecurso {

    private final IServicioRecurso servicio;

    public ControladorRecurso (IServicioRecurso servicio){
        this.servicio = servicio;
    }

    @GetMapping("/{ID}")
    public Recurso get(@PathVariable ("ID") Integer id ){ 
        //return new Recurso(id, nombre:"proyector");
        return this.servicio.get(id);
    }

    @GetMapping()
    public Iterable<Recurso> getTodos(){
        return this.servicio.getTodos();
    }

    @PostMapping()
    public Recurso guardar(@RequestBody Recurso r) {
        return this.servicio.guardar(r);
    }
}
