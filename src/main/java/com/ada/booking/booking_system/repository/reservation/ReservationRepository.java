package com.ada.booking.booking_system.repository.reservation;

import com.ada.booking.booking_system.model.reservation.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReservationRepository extends MongoRepository<Reservation, String> {
}