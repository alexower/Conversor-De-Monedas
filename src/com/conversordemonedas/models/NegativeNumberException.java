package com.conversordemonedas.models;

public class NegativeNumberException extends  RuntimeException {

        public NegativeNumberException(String message) {
            super(message);
        }
}
