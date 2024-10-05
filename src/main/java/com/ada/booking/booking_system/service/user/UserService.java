package com.ada.booking.booking_system.service.user;

import com.ada.booking.booking_system.model.user.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User getUser(Long id);

    User updateUser(Long id, User user);

    void deleteUser(Long id);

    List<User> getAllUsers();

}