package com.kenny.bankapp.mybankapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditAmountRequest {
    private String accountNumber;
    private BigDecimal amount;
}
