package ar.edu.utn.frvm.sistemas.daw2023.model;

//import org.hibernate.mapping.List;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor (access = AccessLevel.PROTECTED)
@RequiredArgsConstructor

public class Lugar extends ObjetoBD {

    
    @NonNull
    private String nombre;

    //Mapea listas, no necesariamente de los 2 lados
    //Se pone para permitir que un recurso pueda estar en más de un lugar.
    @ManyToMany
    private List<Recurso> recursos;

    //Solo puede tener un estado asignado
    @ManyToOne
    private EstadoLugar estado;

    private Integer capacidad;

}
