package org.example.Seminar6.Cw4.model;

public class Fahrenheit implements Converter{
    @Override
    public Double convertValue(Double inputValue) {
        return inputValue * 9 / 5 + 32;
    }
}
