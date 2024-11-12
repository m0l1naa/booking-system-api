package com.ada.booking.booking_system.model.reservation;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reservation {
    private Long id;
    private Long userId;
    private LocalDateTime date;
    private String details;

    public Reservation() {
    }

    public Reservation(Long id, Long userId, LocalDateTime date, String details) {
        this.id = id;
        this.userId = userId;
        this.date = date;
        this.details = details;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}