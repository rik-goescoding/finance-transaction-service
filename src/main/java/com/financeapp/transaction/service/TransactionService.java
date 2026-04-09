package com.financeapp.transaction.service;

import com.financeapp.transaction.dto.BulkTransactionRequest;
import com.financeapp.transaction.model.Transaction;
import com.financeapp.transaction.model.TransactionDirection;
import com.financeapp.transaction.model.TransactionSource;
import com.financeapp.transaction.model.TransactionStatus;
import com.financeapp.transaction.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public void importBulk(BulkTransactionRequest request) {
        List<Transaction> transactions = request.getTransactions()
                .stream()
                .map(this::mapToEntity)
                .toList();

        transactionRepository.saveAll(transactions);
    }

    private Transaction mapToEntity(com.financeapp.transaction.dto.TransactionDto dto) {
        Transaction transaction = new Transaction();
        transaction.setAccountId(1L); // TIJDELIJKE HARDCODE
        transaction.setExternalTransactionId(dto.getExternalTransactionId());
        transaction.setBookingDate(dto.getBookingDate());
        transaction.setAmount(dto.getAmount());
        transaction.setCurrency(dto.getCurrency());
        transaction.setCounterpartyName(dto.getCounterpartyName());
        transaction.setCounterpartyIban(dto.getCounterpartyIban());
        transaction.setDescription(dto.getDescription());
        transaction.setDirection(TransactionDirection.valueOf(dto.getDirection()));
        transaction.setStatus(TransactionStatus.valueOf(dto.getStatus()));
        transaction.setSource(TransactionSource.SEED);
        return transaction;
    }

}
