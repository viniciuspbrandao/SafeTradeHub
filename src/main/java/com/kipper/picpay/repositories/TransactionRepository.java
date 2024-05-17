package com.kipper.picpay.repositories;

import com.kipper.picpay.domain.transaction.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TransactionRepository  extends JpaRepository<Transactions, Long> {
    Optional<Transactions> findTransactionsById(Long id);
}
