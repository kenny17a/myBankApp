package com.kenny.bankapp.mybankapp.service.impl;

import com.kenny.bankapp.mybankapp.dto.TransactionDto;
import com.kenny.bankapp.mybankapp.models.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDto transaction);
}
