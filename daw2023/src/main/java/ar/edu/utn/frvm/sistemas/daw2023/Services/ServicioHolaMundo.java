package ar.edu.utn.frvm.sistemas.daw2023.Services;

import org.springframework.stereotype.Service;

@Service
public class ServicioHolaMundo implements IHolaMundo {
    public String saludar(){
        return "hola";
    }

    @Override
    public String despedir() {
        return "adios"  ;
    }
    
}
