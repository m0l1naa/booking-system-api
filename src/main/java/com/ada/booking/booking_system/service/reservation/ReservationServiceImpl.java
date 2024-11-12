package com.ada.booking.booking_system.service.reservation;

import com.ada.booking.booking_system.model.reservation.Reservation;
import com.ada.booking.booking_system.repository.reservation.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation getReservation(String id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public Reservation createReservation(Reservation reserva) {
        reserva.setDate(LocalDateTime.now());
        return reservationRepository.save(reserva);
    }

    @Override
    public Reservation updateReservation(String id, Reservation reserva) {
        Reservation existingReserva = reservationRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Reserva no encontrada"));

        if (reserva.getUserId() != null) {
            existingReserva.setUserId(reserva.getUserId());
        }
        if (reserva.getDate() != null) {
            existingReserva.setDate(reserva.getDate());
        }
        if (reserva.getDetails() != null) {
            existingReserva.setDetails(reserva.getDetails());
        }

        return reservationRepository.save(existingReserva);
    }

    @Override
    public void deleteReservation(String id) {
        reservationRepository.deleteById(id);
    }
}