package com.ada.booking.booking_system.service.auth;

import com.ada.booking.booking_system.model.user.User;
import com.ada.booking.booking_system.repository.user.UserRepository;
import com.ada.booking.booking_system.security.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public String login(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            throw new RuntimeException("Invalid credentials");
        }
        System.out.println(password + "  /   " + user.getPassword());
        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            System.out.println(user);
            return jwtTokenUtil.generateToken(user.getId());
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }
}