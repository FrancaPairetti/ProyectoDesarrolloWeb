package ar.edu.utn.frvm.sistemas.daw2023.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.utn.frvm.sistemas.daw2023.Services.IHolaMundo;
import ar.edu.utn.frvm.sistemas.daw2023.Services.ServicioHolaMundo;

@RestController
public class ContraladorHolaMundo {

    @Autowired
    private ServicioHolaMundo servicio;

    @Autowired
    private IHolaMundo servicio1;

    public  ContraladorHolaMundo (IHolaMundo servicio1){
        this.servicio1 = servicio1;

    }

    @GetMapping("/hello")
    public String hello(){
        return servicio.saludar();

    }

    @GetMapping("/")
    public String hola(){
        return "Hola DAR 2023";

    }

    //pasar parametro a un URL utilizando el mismo nombre en la url y el metodo

    @GetMapping(value = "/hola", params = {"name"})
    public String hello(String name){
        return "Hello" +name;

    }

    //pasar parametro a un URL normalizando nombre de URL y pasandeselo a una veriable 
    @GetMapping(value = "/hola1", params = {"name"})
    public String hello2(@RequestParam("name") String nombre){
        return "Hello 1 " +nombre;

    }

    //Otra forma de pasar parametro a la URL utilizand las barras

    @GetMapping(value = "/hola2/{nombre}")
    public String hello1(@PathVariable("nombre") String nombre){
        return "Hello 2" +nombre;

    }

    //En esta hay que usar el /name?name=nombre

    @GetMapping(value = "/hola2/{nombre}" , params = {"name"})
    public String hello3(@PathVariable("nombre") String nombre){
        return "Hello 2" +nombre;

    }
}
