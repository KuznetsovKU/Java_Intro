package org.example.Homework6.Hw1;

import org.example.Homework6.Hw1.model.Infrastructure;
import org.example.Homework6.Hw1.model.Laptop;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        List<Laptop> laptopList = new ArrayList<>(Infrastructure.makeLaptopList(10));
        Infrastructure.printStorage(laptopList);
        System.out.println();
        Infrastructure.printStorage(Infrastructure.getFilteredList(laptopList, Infrastructure.getBenchmark(new LinkedHashMap<>(Infrastructure.getClientChoice()))));
    }
}
