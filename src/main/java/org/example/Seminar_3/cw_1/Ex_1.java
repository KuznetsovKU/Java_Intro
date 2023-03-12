package org.example.Seminar_3.cw_1;

import org.example.Seminar_3.cw_1.model.Items;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Items item1 = new Items("oil", "Russia", 5.0);
        Items item2 = new Items("oil", "Qatar", 5.0);
        Items item3 = new Items("corn", "Russia", 5.0);
        Items item4 = new Items("corn", "USA", 5.0);
        Items item5 = new Items("oil", "USA", 5.0);

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);
        itemsList.add(item4);
        itemsList.add(item5);

        Scanner scanner = new Scanner(System.in);
        String query = scanner.nextLine();
        double sumVolume = 0.0;
        List<String> countries = new ArrayList<>();

        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getName().equals(query)) {
                sumVolume += itemsList.get(i).getVolume();
                countries.add(itemsList.get(i).getCountry());
            }
        }
        System.out.println("sum = " + sumVolume);
        System.out.println("countries: " + countries);
    }
}
