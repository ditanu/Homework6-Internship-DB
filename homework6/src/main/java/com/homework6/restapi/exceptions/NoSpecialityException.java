package com.homework6.restapi.exceptions;

public class NoSpecialityException extends Exception {
    public NoSpecialityException() {
        super("Speciality doesn't exist!");
    }
}
