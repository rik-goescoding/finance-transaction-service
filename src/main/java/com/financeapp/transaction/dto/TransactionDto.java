package com.financeapp.transaction.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class TransactionDto {
    private String externalTransactionId;
    private LocalDate bookingDate;
    private BigDecimal amount;
    private String currency;
    private String counterpartyName;
    private String counterpartyIban;
    private String description;
    private String direction;
    private String status;
}
