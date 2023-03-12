package org.example.Seminar_3.cw_4;

import org.example.Seminar_3.cw_4.model.Cube;

import java.util.*;

public class Ex_4 {
    public static void main(String[] args) {
        Cube cube1 = new Cube(3, "red", "wood");
        Cube cube2 = new Cube(73, "green", "metal");
        Cube cube3 = new Cube(23, "yellow", "wood");
        Cube cube4 = new Cube(3, "yellow", "metal");
        Cube cube5 = new Cube(3, "red", "wood");

        List<Cube> cubeList = new ArrayList<>();
        cubeList.add(cube1);
        cubeList.add(cube2);
        cubeList.add(cube3);
        cubeList.add(cube4);
        cubeList.add(cube5);

        System.out.println("main collection: " + cubeList);
        System.out.println("unique collection: " + uniqueCubeColl(cubeList));
    }

    private static Collection<Cube> uniqueCubeColl(List<Cube> cubeList) {
        return new HashSet<>(cubeList);
    }
}
