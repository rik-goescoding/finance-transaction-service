package com.financeapp.transaction.controller;

import com.financeapp.transaction.dto.BulkTransactionRequest;
import com.financeapp.transaction.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @PostMapping("/bulk")
    public void importBulk(@RequestBody BulkTransactionRequest request) {
        transactionService.importBulk(request);
    }
}
