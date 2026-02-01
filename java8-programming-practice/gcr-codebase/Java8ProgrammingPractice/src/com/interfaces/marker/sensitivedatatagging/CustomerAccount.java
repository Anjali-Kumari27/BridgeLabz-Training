package com.interfaces.marker.sensitivedatatagging;

public class CustomerAccount implements SensitiveData{

	private String customerName;
    private String accountNumber;

    public CustomerAccount(String customerName, String accountNumber) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
