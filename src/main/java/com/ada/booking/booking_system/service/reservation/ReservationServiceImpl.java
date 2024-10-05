package com.ada.booking.booking_system.service.reservation;

import com.ada.booking.booking_system.model.reservation.Reservation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReservationServiceImpl implements ReservationService {

    private Map<Long, Reservation> reservations = new HashMap<>();
    private Long nextId = 1L;

    @Override
    public Reservation createReservation(Reservation reservation) {
        reservation.setId(nextId++);
        reservations.put(reservation.getId(), reservation);
        return reservation;
    }

    @Override
    public Reservation getReservation(Long id) {
        return reservations.get(id);
    }

    @Override
    public Reservation updateReservation(Long id, Reservation reservation) {
        if (reservations.containsKey(id)) {
            reservation.setId(id);
            reservations.put(id, reservation);
            return reservation;
        }
        return null;
    }

    @Override
    public void deleteReservation(Long id) {
        reservations.remove(id);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return new ArrayList<>(reservations.values());
    }

}