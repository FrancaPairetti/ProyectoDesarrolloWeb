package ar.edu.utn.frvm.sistemas.daw2023.Services;
import java.util.Date;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ar.edu.utn.frvm.sistemas.daw2023.model.Reserva;
import ar.edu.utn.frvm.sistemas.daw2023.persistencia.RepositorioReserva;

@Service
public class ServicioReserva implements IServicioReserva{
    private final RepositorioReserva repositorio;
    public ServicioReserva(RepositorioReserva repositorio) {
        this.repositorio = repositorio;
    }
    @Override
    public Reserva getReserva(Integer id) {
        return repositorio.findById(id).orElse(null);
    }
    @Override
    public Iterable<Reserva> getTodosReserva() {
        return repositorio.findAll();
    }
    @Override
    public Iterable<Reserva> getTodosPaginadoReserva(Pageable p) {
        return repositorio.findAll(p);
    }
    @Override
    public Iterable<Reserva> getFiltroInicioReserva(Date inicio) {
        return repositorio.findAllByFechaHoraInicio(inicio);
    }
    @Override
    public Iterable<Reserva> getFiltroFinReserva(Date fin) {
        return repositorio.findAllByFechaHoraFin(fin);
    }
    @Override
    public Reserva guardarReserva(Reserva r) {
        return repositorio.save(r);
    }
    @Override
    public Reserva actualizarReserva(Integer id, Reserva R) {
       return repositorio.save(R);
    }
    @Override
    public void eliminarReserva(Integer id) {
        repositorio.deleteById(id);
    }
}
