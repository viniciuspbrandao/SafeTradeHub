package com.kipper.picpay.repositories;

import com.kipper.picpay.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository  extends JpaRepository<User, Long> {
    Optional<User> findUserBydocumentNumber(String documentNumber);
    Optional<User> findUserById(Long id);
}
