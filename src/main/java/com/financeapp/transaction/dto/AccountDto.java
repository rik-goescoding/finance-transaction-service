package com.financeapp.transaction.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountDto {

    private String externalAccountId;
    private String iban;
    private String accountName;
    private String currency;
}
