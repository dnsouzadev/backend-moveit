package com.dnsouzadev.loginAuthApi.repositories;

import com.dnsouzadev.loginAuthApi.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
