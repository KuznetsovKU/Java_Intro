package org.example.Seminar_2.cw_4;

import org.example.Seminar_2.cw_4.model.Vector;

public class Ex_4 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0, 1.0, 1.0);
        Vector vector2 = new Vector(1.0, 2.0, 1.0);
        System.out.println(vector1.toString());
        System.out.println(vector2.toString());
        System.out.println("Длина вектора 1 = " + vector1.lengthVector());
        System.out.println("Длина вектора 2 = " + vector2.lengthVector());
        System.out.println("Скалярное произведение = " + vector1.scalarMulti(vector2));
        System.out.println("Векторное произведение = " + vector1.vectorMulti(vector2));
        System.out.println("Косинус угла = " + vector1.cosVector(vector2));
        System.out.println("Сумма векторов = " + vector1.summ(vector2));
        System.out.println(("Разность векторов = " + vector1.subtraction(vector2)));
    }
}
