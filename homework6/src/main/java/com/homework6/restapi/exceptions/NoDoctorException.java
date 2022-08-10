package com.homework6.restapi.exceptions;

public class NoDoctorException extends Exception {
    public NoDoctorException() {
        super("Doctor doesn't exist!");
    }
}
