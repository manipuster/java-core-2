package ru.surova.java.core;

public class MyArraySizeException extends Exception{

    @Override
    public String getMessage() {
        return "Array size is not 4x4";
    }
}
