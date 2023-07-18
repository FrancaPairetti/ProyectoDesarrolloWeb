package ar.edu.utn.frvm.sistemas.daw2023.Services;

import java.util.Date;

import org.springframework.data.domain.Pageable;

import ar.edu.utn.frvm.sistemas.daw2023.model.Reserva;

public interface IServicioReserva {
    public Reserva getReserva (Integer id);
    
    Iterable <Reserva> getTodosReserva();

    Iterable <Reserva> getTodosPaginadoReserva(Pageable p);

    Iterable <Reserva> getFiltroInicioReserva(Date inicio);

    Iterable <Reserva> getFiltroFinReserva(Date fin);

    Reserva guardarReserva(Reserva r);

    Reserva actualizarReserva(Integer id , Reserva R);

    public void eliminarReserva(Integer id);
    
}
