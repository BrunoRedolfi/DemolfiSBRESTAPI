package com.redolfi.demolfi.repositories;

import com.redolfi.demolfi.entities.Reserva;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservaRepository extends BaseRepository<Reserva, Long> {
    @Query("SELECT r FROM Reserva r JOIN FETCH r.vuelo v JOIN FETCH v.avion JOIN FETCH v.salida JOIN FETCH v.destino")
    List<Reserva> findAllWithVueloDetails();

    Long countByVueloId(Long vueloId);


}
