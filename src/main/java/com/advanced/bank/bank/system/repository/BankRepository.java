package com.advanced.bank.bank.system.repository;

import com.advanced.bank.bank.system.model.Bank;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends CrudRepository<Bank, Long> {
}
