package com.kenny.bankapp.mybankapp.service.impl;

import com.kenny.bankapp.mybankapp.dto.*;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest enquiryRequest);
    String nameEnquiry(EnquiryRequest enquiryRequest);
    BankResponse creditAccount(CreditAmountRequest creditAmountRequest);
    BankResponse debitAccount(DebitAmountRequest debitAmountRequest);
    BankResponse transfer(TransferRequest transferRequest);
}
