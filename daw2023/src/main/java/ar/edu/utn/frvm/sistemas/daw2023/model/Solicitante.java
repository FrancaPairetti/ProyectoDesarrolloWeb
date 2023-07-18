package ar.edu.utn.frvm.sistemas.daw2023.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Entity
@NoArgsConstructor

public class Solicitante extends ObjetoBD{

    private String nombre;
    private String DNI;
    private Integer celular;
    private String mail;

    @ManyToOne
    private Rol rol;
    
}
