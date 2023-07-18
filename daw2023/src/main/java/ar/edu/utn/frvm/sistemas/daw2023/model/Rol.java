package ar.edu.utn.frvm.sistemas.daw2023.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@Data
@Entity
@NoArgsConstructor
public class Rol extends ObjetoBD {

    @NonNull
    private String nombre;
    private String descripcion;
    
}
