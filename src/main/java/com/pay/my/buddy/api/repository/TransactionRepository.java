package com.pay.my.buddy.api.repository;

import com.pay.my.buddy.api.entity.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Integer> {

    Iterable<Transaction> findTransactionByDate(Date date);
}
