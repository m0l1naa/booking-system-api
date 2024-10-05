package com.ada.booking.booking_system.model.reservation;

public class Reservation {
    private Long id;
    private Long userId;
    private String date;
    private String details;

    public Reservation() {
    }

    public Reservation(Long id, Long userId, String date, String details) {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}