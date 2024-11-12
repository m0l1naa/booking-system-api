package com.ada.booking.booking_system.service.reservation;

import com.ada.booking.booking_system.model.reservation.Reservation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReservationService {

    Reservation createReservation(Reservation reservation);

    Reservation getReservation(String id);

    Reservation updateReservation(String id, Reservation reservation);

    void deleteReservation(String id);

    List<Reservation> getAllReservations();

}