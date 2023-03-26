package org.example.Seminar6.Cw4.model;

public class Kelvins implements Converter {
    @Override
    public Double convertValue(Double inputValue) {
        return inputValue + 273.15;
    }
}
