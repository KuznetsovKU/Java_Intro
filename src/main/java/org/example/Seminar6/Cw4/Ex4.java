package org.example.Seminar6.Cw4;

import org.example.Seminar6.Cw4.model.Celsius;
import org.example.Seminar6.Cw4.model.Fahrenheit;
import org.example.Seminar6.Cw4.model.Kelvins;

/**
 * 4) Напишите интерфейс Converter для конвертации из градусов по Цельсию в
 * Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод интерфейса,
 * для валидного перевода величин. Метод для конвертации назовите "convertValue".
 */
public class Ex4 {
    public static void main(String[] args) {
        Double temperatureCelsius = 100.0;
        Double tFahr = new Fahrenheit().convertValue(temperatureCelsius);
        System.out.println("Fahrenheit temperature = " + tFahr);
        Double tKel = new Kelvins().convertValue(temperatureCelsius);
        System.out.println("Kelvins temperature = " + tKel);
        Double tCels = new Celsius().convertValue(temperatureCelsius);
        System.out.println("Celsius temperature = " + tCels);
    }
}
