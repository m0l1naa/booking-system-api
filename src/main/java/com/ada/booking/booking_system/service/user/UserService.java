package com.ada.booking.booking_system.service.user;

import com.ada.booking.booking_system.model.user.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User getUser(String id);

    User updateUser(String id, User user);

    void deleteUser(String id);

    List<User> getAllUsers();

}