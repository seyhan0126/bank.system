package com.advanced.bank.bank.system.model.contract;

import com.advanced.bank.bank.system.model.enums.ContractType;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ContractDetails {
    private Long id;
    private BigDecimal interest;
    private ContractType contractType = ContractType.NONE;
    private Long principal;
    private Map<String, Object> additionalInfo = new HashMap<>();

    public Long getId() {
        return id;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public Long getPrincipal() {
        return principal;
    }

    public void setPrincipal(Long principal) {
        this.principal = principal;
    }

    public Map<String, Object> getAdditionalInfo() {

        return additionalInfo;
    }

    public void setAdditionalInfo(Map<String, Object> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
