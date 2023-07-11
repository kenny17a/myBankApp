package com.kenny.bankapp.mybankapp.service.impl;

import com.kenny.bankapp.mybankapp.dto.TransactionDto;
import com.kenny.bankapp.mybankapp.models.Transaction;
import com.kenny.bankapp.mybankapp.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionImpl implements TransactionService{
    @Autowired
    TransactionRepository transactionRepository;



    @Override
    public void saveTransaction(TransactionDto transactionDto) {
        Transaction transaction = Transaction.builder()
                .transactionType(transactionDto.getTransactionType())
                .accountNumber(transactionDto.getAccountNumber())
                .amount(transactionDto.getAmount())
                .status(transactionDto.getStatus())
                .build();
        transactionRepository.save(transaction);
        System.out.println("Transaction successfully saved");

    }
}
