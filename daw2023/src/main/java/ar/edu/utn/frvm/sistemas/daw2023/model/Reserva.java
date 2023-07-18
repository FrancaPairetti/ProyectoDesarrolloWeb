package ar.edu.utn.frvm.sistemas.daw2023.model;

import java.util.Date;

import jakarta.persistence.Entity;

import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Entity
@NoArgsConstructor

public class Reserva extends ObjetoBD{

    private String motivoReserva;
    @NonNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraInicio;
    @NonNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraFin;

    @OneToOne
    private Solicitante solicitante;

    @OneToMany
    private Lugar lugar;
    
}
