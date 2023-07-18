package ar.edu.utn.frvm.sistemas.daw2023.persistencia;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import ar.edu.utn.frvm.sistemas.daw2023.model.Lugar;
import ar.edu.utn.frvm.sistemas.daw2023.model.Reserva;

@Repository
public interface RepositorioReserva  extends PagingAndSortingRepository <Reserva , Integer> , CrudRepository <Reserva , Integer> {

    Iterable<Reserva> findAllByFechaHoraInicio(Date fechaHoraI);
    Iterable<Reserva> findAllByFechaHoraFin(Date fechaHoraF);
    //filtro por lugar en resevas ??
    Iterable<Reserva> findAllByLugar(Lugar l);

    
}
