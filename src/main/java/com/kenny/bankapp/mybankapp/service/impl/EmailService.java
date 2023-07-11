package com.kenny.bankapp.mybankapp.service.impl;

import com.kenny.bankapp.mybankapp.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
