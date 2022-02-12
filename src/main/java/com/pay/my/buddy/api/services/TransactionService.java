package com.pay.my.buddy.api.services;

import com.pay.my.buddy.api.entity.Transaction;
import com.pay.my.buddy.api.entity.Transfer;
import com.pay.my.buddy.api.repository.TransactionRepository;
import com.pay.my.buddy.api.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    public Optional<Transaction> getTransactionById(Integer id) {
        return transactionRepository.findById(id);
    }

    public Iterable<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Iterable<Transaction> getTransactionByDate(Date date) {
        return transactionRepository.findTransactionByDate(date);
    }


}
