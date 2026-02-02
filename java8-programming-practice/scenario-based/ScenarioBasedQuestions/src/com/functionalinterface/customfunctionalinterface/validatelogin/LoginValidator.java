package com.functionalinterface.customfunctionalinterface.validatelogin;

@FunctionalInterface
public interface LoginValidator {
    boolean validate(String username, String password);
}

