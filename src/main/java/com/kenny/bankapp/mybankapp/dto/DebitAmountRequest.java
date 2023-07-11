package com.kenny.bankapp.mybankapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DebitAmountRequest {
    private String accountNumber;
    private BigDecimal amount;
}
