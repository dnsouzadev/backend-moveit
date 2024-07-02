package com.dnsouzadev.loginAuthApi.repositories;

import com.dnsouzadev.loginAuthApi.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}
