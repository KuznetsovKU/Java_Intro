package org.example.Seminar_3.cw_1.cw_3;


import org.example.Seminar_3.cw_1.cw_3.moodel.Cube;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах),
 * его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.).
 * Найти:
 * - количество кубиков желтого цвета и их суммарный объем;
 * - количество деревянных кубиков с ребром 3 см
 */
public class Ex_3 {
    public static void main(String[] args) {
        Cube cube1 = new Cube(3, "red", "wood");
        Cube cube2 = new Cube(73, "green", "metal");
        Cube cube3 = new Cube(23, "yellow", "wood");
        Cube cube4 = new Cube(3, "yellow", "metal");
        Cube cube5 = new Cube(3, "white", "wood");

        List<Cube> cubeList = new ArrayList<>();
        cubeList.add(cube1);
        cubeList.add(cube2);
        cubeList.add(cube3);
        cubeList.add(cube4);
        cubeList.add(cube5);

        int cubeCounter = 0;
        int sumVolume = 0;
        int woodCubeCounter = 0;
        for (Cube el : cubeList) {
            if (el.getColor().equals("yellow")) {
                cubeCounter++;
                sumVolume += cubeVolume(el.getSize());
            }
            if (el.getMaterial().equals("wood") && el.getSize().equals(3)) {
                woodCubeCounter++;
            }
        }
        System.out.println(cubeCounter);
        System.out.println(sumVolume);
        System.out.println(woodCubeCounter);

    }

    private static int cubeVolume(Integer size) {
        return size * size * size;
    }


}
