package com.advanced.bank.bank.system.service;

import com.advanced.bank.bank.system.model.Bank;

import java.util.List;

public interface BankService {
    void createBank(Bank bank);
    void updateBank(Bank bank);
    List<Bank> getAllBanks();
    Bank getBankById(Long bankId);
    void deleteBankById(Long bankId);
}
