package com.banking.banking.service;

import com.banking.banking.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    Account find(long id);

    Account save(Account account);

    Account delete(long id);
}
