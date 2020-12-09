package ru.surova.java.core;

public class MyArrayDataException extends Exception{

    private int x;
    private int y;

    public MyArrayDataException(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String getMessage() {
        return "Error is in [" + x + "][" + y + "]";
    }
}
