package ar.edu.utn.frvm.sistemas.daw2023.controller;

import ar.edu.utn.frvm.sistemas.daw2023.Services.IHolaMundo;

public class ServicioHelloWord  implements IHolaMundo{

    public String saludar(){
        return "hello";
    }

    @Override
    public String despedir() {
        return "bye"  ;
    }
    
}
