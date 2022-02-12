package com.pay.my.buddy.api.repository;

import com.pay.my.buddy.api.entity.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Integer> {
    
    Iterable<Account> findByIban(String iban);

    Iterable<Account> findByBank(String bank);
    
}
