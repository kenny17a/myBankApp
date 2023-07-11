package com.kenny.bankapp.mybankapp.repository;

import com.kenny.bankapp.mybankapp.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
