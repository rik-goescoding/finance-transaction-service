package com.financeapp.transaction.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BulkTransactionRequest {

    private AccountDto account;
    private List<TransactionDto> transactions;
}
