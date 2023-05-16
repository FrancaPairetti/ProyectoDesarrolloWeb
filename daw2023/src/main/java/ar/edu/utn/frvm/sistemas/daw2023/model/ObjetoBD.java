package ar.edu.utn.frvm.sistemas.daw2023.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@MappedSuperclass
@Data
@NoArgsConstructor
public class ObjetoBD {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    private Integer id;

}
