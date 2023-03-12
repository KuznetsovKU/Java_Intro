package org.example.Homework_3.Hw_2;

import org.example.Homework_3.Hw_2.model.Items;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.MAX_VALUE;

/**
 * 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class Ex_2 {
    public static void main(String[] args) {
        Items item1 = new Items("apple", "Russia", 3.0, 5.1, 2);
        Items item2 = new Items("apple", "Turkey", 3.0, 5.4, 2);
        Items item3 = new Items("apple", "Brasil", 3.0, 5.3, 3);
        Items item4 = new Items("banana", "Russia", 3.0, 5.2, 1);
        Items item5 = new Items("banana", "Turkey", 3.0, 5.1, 2);
        Items item6 = new Items("banana", "Brasil", 3.0, 5.0, 3);
        Items item7 = new Items("avocado", "Russia", 3.0, 5.7, 1);
        Items item8 = new Items("avocado", "Turkey", 3.0, 5.6, 2);
        Items item9 = new Items("avocado", "Brasil", 3.0, 5.8, 3);
        Items item10 = new Items("pineapple", "Russia", 3.0, 5.9, 1);

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);
        itemsList.add(item4);
        itemsList.add(item5);
        itemsList.add(item6);
        itemsList.add(item7);
        itemsList.add(item8);
        itemsList.add(item9);
        itemsList.add(item10);

        System.out.println(itemsMinPriseBySort(itemsList, 2));
    }

    /**
     * Метод нахождения наименований товаров заданного сорта с наименьшей ценой
     *
     * @param inputList - список товаров
     * @param variety   - сорт товара
     * @return - список товаров, удовлетворяющих условиям
     */
    private static List<String> itemsMinPriseBySort(List<Items> inputList, int variety) {
        List<String> filtered = new ArrayList<>();
        Double minPrise = MAX_VALUE;
        for (Items el : inputList) {
            if (el.getVariety() == variety && el.getPrise() < minPrise) {
                minPrise = el.getPrise();
            }
        }
        for (Items el : inputList) {
            if (el.getVariety() == variety && el.getPrise().equals(minPrise)) {
                filtered.add(el.getCountry());
            }
        }
        return filtered;
    }
}
