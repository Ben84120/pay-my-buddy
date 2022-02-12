package com.pay.my.buddy.api.services;

import com.pay.my.buddy.api.entity.Account;
import com.pay.my.buddy.api.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public Optional<Account> getAccountById(Integer id){
        return accountRepository.findById(id);
    }

    public Iterable<Account> getAccountByIban(String iban){
        return accountRepository.findByIban(iban);
    }

    public Iterable<Account> getAccountByBank(String bank){
        return accountRepository.findByBank(bank);
    }
}
